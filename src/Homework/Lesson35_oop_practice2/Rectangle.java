package Homework.Lesson35_oop_practice2;

import java.awt.*;

public final class Rectangle extends Figure {
    private int height;
    private int widht;

    static int rectangleCount;

    public Rectangle(Color color, LocatoinOfFigure coordinates, boolean isVisible, int height, int widht) {
        super(color, coordinates, isVisible);
        this.height = height;
        this.widht = widht;

        rectangleCount++;
    }

    public Rectangle(Color color, LocatoinOfFigure coordinates, boolean isVisible, int height) {
        super(color, coordinates, isVisible);
        this.height = height;
        this.widht = height;
        rectangleCount++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    @Override
    public String speak() {
        if (this.height == this.widht) {
            return "Square{" +
                    "height/widht=" + this.height +
                    ", color=" + this.getColor() +
                    ", locatoin{" +
                    "X=" + getLocatoin().getX() +
                    ", Y=" + getLocatoin().getY() + "}"+
                    ", isVisible=" + isVisible() +
                    '}';
        } else {
            return "Rectangle{" +
                    "height=" + this.height +
                    ", widht=" + this.widht +
                    ", color=" + this.getColor() +
                    ", locatoin{" +
                    "X=" + getLocatoin().getX() +
                    ", Y=" + getLocatoin().getY() + "}"+
                    ", isVisible=" + isVisible() +
                    '}';
        }
    }
}




