package Lesson34_Staticpractice;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CircleTest extends Canvas {

    public CircleTest() {
    }

    @Override
    public void paint(Graphics graphics) {

        Random random = new Random();
        Circle[] circles = new Circle[]{
                new Circle(Color.BLACK, 20),
                new Circle(Color.CYAN, 50),
                new Circle(Color.RED, 70),
                new Circle(Color.yellow, 90),
                new Circle(Color.WHITE, 120),
                new Circle(Color.GREEN, 160),
                new Circle(Color.BLUE, 200)
        };

        for (int i = 0; i < circles.length; i++) {
            graphics.setColor(circles[i].getColor());
            graphics.fillOval(100, circles[i].getRadius(), circles[i].getRadius(), circles[i].getRadius());

        }

    }

public static void main(String[] args) {
    CircleTest canvas = new CircleTest();
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(canvas);
    frame.setVisible(true);

}
}
