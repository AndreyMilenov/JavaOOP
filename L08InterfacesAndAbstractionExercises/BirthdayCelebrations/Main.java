package L08InterfacesAndAbstractionExercises.BirthdayCelebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> bithBleList = new ArrayList<>();
        while (!"End".equals(input.trim())) {
            String[] tokens = input.split("\\s+");
            String objectTape = tokens[0];

            switch (objectTape) {
                case "Pet":
                    String petName = tokens[1];
                    String birtDate = tokens[2];
                    Pet pet = new Pet(petName,birtDate);
                    bithBleList.add(pet);
                    break;
                case "Citizen":
                     String name = tokens[1];
                     int age = Integer.parseInt(tokens[2]);
                     String id = tokens[3];
                     String birthDate = tokens[4];
                     Citizen citizen = new Citizen(name,age,id,birthDate);
                    bithBleList.add(citizen);
                    break;
                case "Robot":
                    String robotId = tokens[1];
                    String model = tokens[2];
                    Robot robot = new Robot(robotId,model);

                    break;

            }
            input = scanner.nextLine().trim();
        }
        String yearToPrint = scanner.nextLine().trim();
        for (Birthable birthable : bithBleList) {

            if (birthable.getBirthDate().trim().endsWith(yearToPrint) ) {
                System.out.println(birthable.getBirthDate());

            }
        }
    }
}
