package L10PolymorphismExercises.P01Vehicles;



public class Car extends VehicleImpl {
    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);

    }





}
