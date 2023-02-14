public class Circle {
    // private instance variables
    private double radius;


    // Constructors
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }

    public String toString() {
        return "Circle[radius= + radius ]";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
}
