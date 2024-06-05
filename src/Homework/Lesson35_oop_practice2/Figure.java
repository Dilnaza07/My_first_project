package Homework.Lesson35_oop_practice2;

import java.awt.*;

public class Figure{
   private Color color;
   private LocatoinOfFigure locatoin;

   private boolean isVisible;

    public Figure(Color color, LocatoinOfFigure locatoin, boolean isVisible) {
        this.color = color;
        this.locatoin = locatoin;
        this.isVisible = isVisible;
    }



    public String speak() {
        return "Figure{" +
                "color=" + color +
                ", locatoinOfFigure{" +
                "X=" + locatoin.getX() +
                ", Y=" + locatoin.getY() + "}"+
                ", isVisible=" + isVisible +
                '}';
    }

    public java.awt.Color getColor() {
        return color;
    }

    public void setColor(java.awt.Color color) {
        this.color = color;
    }

    public LocatoinOfFigure getLocatoin() {
        return locatoin;
    }

    public void setLocatoin(LocatoinOfFigure locatoin) {
        this.locatoin = locatoin;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

}
