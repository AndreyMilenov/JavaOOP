package L09Polymorphism.P02Shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
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
        return 2 * height + 2 * width;
    }

    @Override
    public Double calculateArea() {
        return height * width;
    }
}
