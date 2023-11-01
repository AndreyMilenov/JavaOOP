package L10PolymorphismExercises.P02VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", getVehicle(scanner));
        vehicleMap.put("Truck", getVehicle(scanner));
        vehicleMap.put("Bus",getVehicle(scanner));

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");
            String commandName = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandName) {
                case "DriveEmpty":
                    Bus bus = (Bus) vehicleMap.get(vehicleType);
                    System.out.println(bus.driveEmpty(argument));
                    break;
                case "Drive":
                    System.out.println(vehicleMap.get(vehicleType).drive(argument));
                    break;

                case "Refuel":
                    try {
                        vehicleMap.get(vehicleType).refuel(argument);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
        }
        vehicleMap.forEach((key, value) -> System.out.println(value));
    }
    public static Vehicle getVehicle (Scanner scanner) {
        String[] vehicleData = scanner.nextLine().split(" ");
        String vehicleType = vehicleData[0];
        double fuelAmount = Double.parseDouble(vehicleData[1]);
        double fuelConsumtion = Double.parseDouble(vehicleData[2]);
        double tankCapacity = Double.parseDouble(vehicleData[3]);

        switch (vehicleType) {
            case "Car":
                return new Car(fuelAmount, fuelConsumtion,tankCapacity);
            case "Truck":
                return new Truck(fuelAmount, fuelConsumtion,tankCapacity);
            case "Bus":
                return new Bus(fuelAmount, fuelConsumtion,tankCapacity);
            default:
                throw new IllegalArgumentException("Missing car");
        }
    }
}
