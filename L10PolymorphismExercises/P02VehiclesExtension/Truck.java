package L10PolymorphismExercises.P02VehiclesExtension;

public class Truck extends VehicleImpl {
    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_AFTER_DRIVER_DEDUCTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + FUEL_AFTER_DRIVER_DEDUCTION
                , tankCapacity);
    }




    @Override
    public void refuel(double liters) {
        super.refuel(liters * FUEL_AFTER_DRIVER_DEDUCTION);
    }
}
