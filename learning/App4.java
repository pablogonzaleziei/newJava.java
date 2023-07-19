public class App4 {
    public static void main(String[] args) {
        // Method Overloading
        System.out.println("Sum of two integers: " + sum(5, 10));
        System.out.println("Sum of three integers: " + sum(3, 8, 12));
        System.out.println("Sum of two doubles: " + sum(3.5, 2.7));

        // Abstract Classes
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        // Interfaces
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.start();
        car.stop();
        bicycle.start();
        bicycle.stop();
    }

    // Method Overloading: Calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method Overloading: Calculate the sum of three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method Overloading: Calculate the sum of two doubles
    public static double sum(double a, double b) {
        return a + b;
    }
}

// Abstract Classes
abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Interfaces
interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped.");
    }
}
