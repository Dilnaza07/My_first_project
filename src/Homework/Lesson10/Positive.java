package Homework.Lesson10;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Введите число: ");
            int num1 = sc.nextInt();

            if (num1 <= 0) {
                System.out.println("До свидания!");
                break;
            }
        }

    }
}
