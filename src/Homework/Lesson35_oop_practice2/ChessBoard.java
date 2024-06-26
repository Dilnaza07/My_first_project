package Homework.Lesson35_oop_practice2;

import java.util.Arrays;

public class ChessBoard {

    private  Rectangle [][] rectangles = new Rectangle[8][8];

    public ChessBoard(Rectangle[][] rectangles) {
        this.rectangles = rectangles;
    }

    public final void fillIn(Rectangle rectangle, LocatoinOfFigure locatoinOfFigure){

        this.rectangles[rectangle.getLocatoin().getX()][rectangle.getLocatoin().getY()] = rectangle;
    }

    public Rectangle getRectangle(int rowNumber, int columnNumber) {
        return rectangles[rowNumber][columnNumber];
    }

    @Override
    public String toString() {
        return "ChessBoard{" +
                "rectangles=" + Arrays.toString(rectangles) +
                '}';
    }
}
