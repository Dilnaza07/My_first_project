package Lesson23_Constructors;

import java.util.Random;
import java.util.Scanner;

public class CircleTest_Homework {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "red", true);
        Circle circle2 = new Circle(4, "blue", false);
        System.out.println("Circle1 radius: " + circle1.getRadius() + ", color: " + circle1.getColor() + ". Is transparent? " + circle1.getIsTransparent());
        System.out.println("Circle2 radius: " + circle2.getRadius() + ", color: " + circle2.getColor() + ". Is transparent? " + circle2.getIsTransparent());

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        circle1.radius = circle1.radius * N;
        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle1 Length: " + circle1.getLength() + ", Area: " + circle1.getArea());

        double[] array100Circles = new double[99];
        double[] arrayMultiple3 = new double[99];
        int index = 0;

        UNDER:
        for (int i = 0; i < 99; i++) {
            Circle c1 = new Circle(random.nextInt(100));
            array100Circles[i] = c1.radius;
            if (c1.radius % 3 == 0) {
                arrayMultiple3[index] = c1.radius;
                System.out.println("Array [" + index + "]" + " = " + arrayMultiple3[index]);
                index++;
            }
        }
    }
}

