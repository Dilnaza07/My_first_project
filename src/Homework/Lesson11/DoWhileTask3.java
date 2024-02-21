package Homework.Lesson11;

import java.util.Scanner;

public class DoWhileTask3 {
    public static void main(String[] args) {

        //Задача
        //Написать программу, которая получает диапазон чисел от пользователя и суммирует все нечётные числа в данном диапазоне.
        //Пример:
        //Введите диапазон:
        //10 20
        //Сумма нечётных чисел в диапазоне: 75

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите диапозон: ");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int count = 0;
        int k = firstNum;

        if (k % 2 == 0)
            k += 1;

        do {
            System.out.println(k);
            count = count + k;
            k += 2;

        } while (k <= secondNum);
        System.out.println("Сумма нечетных чисел в диапазоне: " + count);
    }
}