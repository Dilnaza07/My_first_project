package Homework.Lesson35_oop_practice2;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class ChessBoardDrawing extends Canvas {
    public ChessBoardDrawing() {
    }

    @Override
    public void paint(Graphics graphics) {

        final Rectangle[][] rectangles = new Rectangle[8][8];
        ChessBoard chessBoard = new ChessBoard(rectangles);

        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < rectangles[i].length; j++) {
                LocatoinOfFigure locatoinOfFigure = new LocatoinOfFigure(i, j);
                Color color= (i+j)%2==0 ? Color.WHITE: Color.BLACK;
                Rectangle rectangle = new Rectangle(color, locatoinOfFigure, true, 50);
                chessBoard.fillIn(rectangle, locatoinOfFigure);
                System.out.println(rectangle.speak());

                int x = i * rectangle.getHeight();
                int y = j * rectangle.getHeight();


                // final Rectangle rectangle = chessBoard.getRectangle(i,j);
                graphics.setColor(rectangle.getColor());
                graphics.fillRect(x, y, rectangle.getWidht(), rectangle.getHeight());
                System.out.println(rectangle.speak());
            }

        }

}

public static void main(String[] args) {
    ChessBoardDrawing canvas = new ChessBoardDrawing();
    JFrame frame = new JFrame();
    frame.setSize(600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(canvas);
    frame.setVisible(true);
}
}
