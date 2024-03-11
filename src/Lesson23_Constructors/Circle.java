package Lesson23_Constructors;

public class Circle {
    double radius;
    String color;
    boolean isTransparent = false;

    final double pi = 3.14;

    Circle(double radius, String color, boolean isTransparent) {
        this.radius = radius;
        this.color = color;
        this.isTransparent = isTransparent;
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    Circle(double radius) {
        this.radius = radius;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setIsTransparent(boolean isTransparent) {
        this.isTransparent = isTransparent;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsTransparent() {
        return isTransparent;
    }

    public double getLength() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }
}
