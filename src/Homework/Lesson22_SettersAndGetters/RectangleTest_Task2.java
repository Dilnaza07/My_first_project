package Homework.Lesson22_SettersAndGetters;

import java.util.Scanner;

public class RectangleTest_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RectangleTask2 rectangle2 = new RectangleTask2();

        System.out.println("Enter the length and width: ");
        rectangle2.setLength(sc.nextInt());
        System.out.println("Enter the color: ");
        rectangle2.setColor(sc.next());

        System.out.println("the area of a rectangle with a length of " + rectangle2.getLength() +
                " and a width of " + rectangle2.getWidth() + " is " + rectangle2.getArea()
                + ". The color of the area is " + rectangle2.getColor());
    }
}
