package L10PolymorphismExercises.P02VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends VehicleImpl {

    public static final double AC_ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double distance) {
        setFuelConsumption(getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
        String driveResult = super.drive(distance);
        setFuelConsumption(getFuelConsumption() - AC_ADDITIONAL_CONSUMPTION);
        return driveResult;
    }

    public String driveEmpty(double distance) {
       return super.drive(distance);
    }
}
