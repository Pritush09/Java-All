abstract class TwoDFigure {
    double dimension1;
    double dimension2;

    TwoDFigure(double d1, double d2) {
        dimension1 = d1;
        dimension2 = d2;
    }

    abstract double calculateArea();
}

class Rectangle extends TwoDFigure {
    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double calculateArea() {
        return dimension1 * dimension2;
    }
}

class Triangle extends TwoDFigure {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class Asg8c {
    public static void main(String[] args) {
        // Creating objects of derived classes using base class reference
        TwoDFigure rectangle = new Rectangle(5, 10);
        TwoDFigure triangle = new Triangle(8, 6);

        // Displaying the area using base class reference
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
