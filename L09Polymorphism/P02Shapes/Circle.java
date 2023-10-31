package L09Polymorphism.P02Shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radios) {
        this.radius = radios;
    }


    public final Double getRadius() {
        return radius;
    }

    @Override
    public Double getArea() {
        return calculateArea();
    }

    @Override
    public Double getPerimeter() {
        return calculatePerimeter();
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}
