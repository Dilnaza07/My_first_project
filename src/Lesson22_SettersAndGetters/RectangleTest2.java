package Lesson22_SettersAndGetters;

import java.util.Scanner;

public class RectangleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle2 rectangle2 = new Rectangle2();

        System.out.println("Enter the length: ");
        rectangle2.setLength(sc.nextInt());
        System.out.println("Enter the width: ");
        rectangle2.setWidth(sc.nextInt());

        System.out.println("The area of the rectangle: " + rectangle2.getArea());
    }
}
