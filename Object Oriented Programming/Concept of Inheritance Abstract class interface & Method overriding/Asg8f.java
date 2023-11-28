// First interface
interface Shape {
    void draw();
}

// Second interface
interface Color {
    void setColor(String color);
}

// Concrete class implementing both interfaces
class Circle implements Shape, Color {
    private String color;

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Setting color to: " + color);
    }

    public void displayInfo() {
        System.out.println("Circle information - Color: " + color);
    }
}

public class Asg8f {
    public static void main(String[] args) {
        // Creating an object of the Circle class
        Circle circle = new Circle();

        // Calling methods from both interfaces
        circle.draw();
        circle.setColor("Red");

        // Calling a method specific to the Circle class
        circle.displayInfo();
    }
}

