package Lesson23_Constructors;

public class Rectangle {

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double length;
    private double width;

    public void setLength(int h) {

        if (h <= 0) throw new Error();
        length = h;
    }

    public void setWidth(int w) {
        if (w <= 0) throw new Error();
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}







