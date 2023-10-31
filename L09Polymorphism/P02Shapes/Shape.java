package L09Polymorphism.P02Shapes;

public  abstract class Shape {
    private Double perimeter;
    private Double area;

    public abstract Double getPerimeter();
    public abstract Double getArea();

   public abstract Double calculatePerimeter();
    public abstract Double calculateArea();
}
