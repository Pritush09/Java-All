abstract class GeometricObject {
    private String color;
    private double weight;

    // Default constructor with default values
    public GeometricObject() {
        this.color = "White";
        this.weight = 1.0;
    }

    // Parameterized constructor
    // public GeometricObject(String color, double weight) {
    //     this.color = color;
    //     this.weight = weight;
    // }

    // Getter methods
    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    // Abstract methods
    public abstract double findArea();

    public abstract double findCircumference();
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        // super(color, weight); String color, double weight,
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double findArea() {
        // Using Heron's formula to calculate the area of the triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double findCircumference() {
        return side1 + side2 + side3;
    }
}

public class Asg8d {
    public static void main(String[] args) {
        // Creating an object of the Triangle class
        Triangle triangle = new Triangle(3, 4, 5);

        // Displaying the color, weight, area, and circumference of the triangle
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Weight: " + triangle.getWeight());
        System.out.println("Area: " + triangle.findArea());
        System.out.println("Circumference: " + triangle.findCircumference());
    }
}

