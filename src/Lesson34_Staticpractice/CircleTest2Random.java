package Lesson34_Staticpractice;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CircleTest2Random extends Canvas {

    public CircleTest2Random() {
    }

    @Override
    public void paint(Graphics graphics) {

        Random random = new Random();

        Circle[] circles = new Circle[30];


        for (int i = 0; i < circles.length; i++) {
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color color = new Color(red, green, blue);
            Circle circle = new Circle(color, (i + 1) * 10);
            graphics.setColor(circles[i].getColor());
            graphics.fillOval(100, circles[i].getRadius(), circles[i].getRadius(), circles[i].getRadius());

        }

    }

    public static void main(String[] args) {
        CircleTest2Random canvas = new CircleTest2Random();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);

    }
}
