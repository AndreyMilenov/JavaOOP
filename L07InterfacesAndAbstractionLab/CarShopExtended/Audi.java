package L07InterfacesAndAbstractionLab.CarShopExtended;

public class Audi extends CarImpl implements Rentable{

    private Integer minRentDay;
    private Double pricePerDay ;


    public Audi(String model, String color, Integer horsePower, String countryProduced,Integer minRentDay,Double pricePerDay) {
        super(model,color,horsePower,countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;

    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(super.toString());
        out.append(System.lineSeparator());
        out.append(String.format("Minimum rental period of %d. Price per day %f",getMinRentDay(),getPricePerDay()));

        return out.toString();
    }

}
