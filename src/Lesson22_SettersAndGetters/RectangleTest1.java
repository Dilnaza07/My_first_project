package Lesson22_SettersAndGetters;

import java.util.Scanner;

public class RectangleTest1 {
    public static void main(String[] args) {

        Rectangle1 rectangle = new Rectangle1();
        rectangle.length = 10;
        rectangle.width = 34;

        System.out.println("The area of the rectangle: " + rectangle.getArea());


    }
}
