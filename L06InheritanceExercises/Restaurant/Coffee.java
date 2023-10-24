package L06InheritanceExercises.Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    public double caffeine;
    public final static double COFFEE_MILLILITERS = 50.0 ;
    public final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);


    public Coffee(String name,double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }
    @Override
    public double getMilliliters() {
        return COFFEE_MILLILITERS;
    }
    public double getCaffeine() {
        return caffeine;
    }
}
