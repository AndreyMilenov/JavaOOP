package L09Polymorphism.P03Animal;

public class Dog extends Animal {
    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%nDJAAF", super.explainSelf());
    }
}
