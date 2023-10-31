package L09Polymorphism.P03Animal;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favoriteFood) {
        setName(name);
        setFavouriteFood(favoriteFood);
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s",
                this.getName(),
                this.getFavouriteFood());
    }
}
