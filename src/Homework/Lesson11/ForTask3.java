package Homework.Lesson11;

import java.util.Scanner;

public class ForTask3 {
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

        if (firstNum % 2 == 0)
            firstNum++;

        for (int k = firstNum; k <= secondNum; k += 2) {
            System.out.println(k);
            count = count + k;

        }
        System.out.println("Сумма нечетных чисел в диапазоне: " + count);
    }
}
