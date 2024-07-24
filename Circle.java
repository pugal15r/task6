package task6;

public class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 3.0; // default radius
    }

    // Two-argument constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter and setter for radius (optional)
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Example usage:
        Circle circle1 = new Circle(); // Using no-argument constructor
        System.out.println("Radius of circle1: " + circle1.getRadius());
        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(3.5); // Using two-argument constructor
        System.out.println("Radius of circle2: " + circle2.getRadius());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }
}
