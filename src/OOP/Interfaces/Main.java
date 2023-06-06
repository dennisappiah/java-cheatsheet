package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(2,4,6);
        Shape shape2 = new Triangle(2,4);
        Shape shape3 = new Rectangle(1,2);
        System.out.println(shape2.calculateArea());
        System.out.println(shape2.calculatePerimeter());
    }
}
