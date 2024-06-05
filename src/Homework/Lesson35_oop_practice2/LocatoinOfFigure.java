package Homework.Lesson35_oop_practice2;

public class LocatoinOfFigure {

    private final int X;
    private final int Y;

    public LocatoinOfFigure(int x, int y) {
        X = x;
        Y = y;
   }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "LocatoinOfFigure{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}

