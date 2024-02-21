package Homework.Lesson9;

import java.util.Scanner;

public class MaxNumber5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 целых чисел: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
            System.out.println("Максимальное число " + num1);
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
            System.out.println("Максимальное число " + num2);
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
            System.out.println("Максимальное число " + num3);
        } else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num2 >= num5) {
            System.out.println("Максимальное число " + num4);
        } else if (num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4) {
            System.out.println("Максимальное число " + num5);
        } else {
            System.out.println("Ошибка");
        } ;


    }
}
