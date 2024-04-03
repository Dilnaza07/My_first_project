package Homework.Lesson35_oop_practice2;

import java.awt.*;

public class ChessTest {
    public static void main(String[] args) {

        Rectangle[][] rectangles = new Rectangle[8][8];
        ChessBoard chessBoard = new ChessBoard(rectangles);

        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < rectangles[i].length; j++) {
                LocatoinOfFigure locatoinOfFigure = new LocatoinOfFigure(i, j);
                Rectangle rectangle = new Rectangle(Color.BLACK, locatoinOfFigure, true, 5);
                chessBoard.fillIn(rectangle, locatoinOfFigure);
                System.out.println(rectangle.speak());
            }

        }
        System.out.println(chessBoard);

        System.out.println("Количество созданных квадратов: " + Rectangle.rectangleCount);
    }
}