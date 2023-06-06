package OOP.Interfaces;

public class Triangle implements Shape{
    double base;
    double height;

    public Triangle(double width, double height) {
        this.base = width;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return (double) 1 /2 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
