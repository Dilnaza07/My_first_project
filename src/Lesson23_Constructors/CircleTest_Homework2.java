package Lesson23_Constructors;

import java.util.Random;
import java.util.Scanner;

public class CircleTest_Homework2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "red", true);
        Circle circle2 = new Circle(4, "blue", false);
        System.out.println("Circle1 radius: " + circle1.getRadius() + ", color: " + circle1.getColor() + ". Is transparent? " + circle1.getIsTransparent());
        System.out.println("Circle2 radius: " + circle2.getRadius() + ", color: " + circle2.getColor() + ". Is transparent? " + circle2.getIsTransparent());

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        circle1.setRadius(circle1.getRadius() * N);
        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle1 Length: " + circle1.getLength() + ", Area: " + circle1.getArea());

        Circle[] allCircles = new Circle[100];
        Circle[] dividedBy3Circle = new Circle[99];
        int count = 0;

        for (int i = 0; i < allCircles.length; i++) {
            int radius = random.nextInt(50);
            allCircles[i] = new Circle(radius);
            if (radius % 3 == 0) {
                dividedBy3Circle[count] = allCircles[i];
                count++;
            }
        }
        System.out.println();
        System.out.println("Circles with a radius multiple of 3: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Circle " + (i + 1) + ": Radius " + dividedBy3Circle[i].getRadius());
        }
    }
}

