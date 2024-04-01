package Lesson34_Staticpractice;

import java.awt.*;

public class Circle {
    final double PI = 3.14;
    private Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public double getLengthArc(){
        return 2 * radius * PI;
    }
}
