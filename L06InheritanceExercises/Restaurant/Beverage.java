package L06InheritanceExercises.Restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    private double millilitres;
    public Beverage(String name, BigDecimal price,double millilitres) {
        super(name, price);
        this.millilitres = millilitres;
    }

    public double getMilliliters() {
        return millilitres;
    }
}
