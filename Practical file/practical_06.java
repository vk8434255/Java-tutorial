// Interface for shapes
interface Shape {
    double calculateArea();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    // @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square class implementing Shape interface
class Square implements Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate area of square
    // @Override
    public double calculateArea() {
        return side * side;
    }
}

// Main class to test the program
public class practical_06 {
    public static void main(String[] args) {
        // Creating instances of Circle and Square
        Circle circle = new Circle(5);
        Square square = new Square(4);

        // Calculating and displaying area of circle
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Calculating and displaying area of square
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
