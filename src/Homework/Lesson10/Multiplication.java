package Homework.Lesson10;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();

        int sing = 0;
        if (num1 < 0 ^ num2 < 0) {
            sing = -1;
        } else {
            sing = 1;
        }

        int result = 0;
        int Nnum2 = num2;

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num2 > 0) {

            result = result + num1;
            num2--;
        }
        System.out.println(num1 + "*" + Nnum2 + "=" + result * sing);


    }
}