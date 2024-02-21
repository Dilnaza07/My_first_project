package Homework.Lesson11;

import java.util.Scanner;

public class ForTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int n = 1; n <= 10; n++) {
            System.out.println(a + " * " + n + " = " + (a * n));

        }
    }
}


