package Homework.Lesson11;

import java.util.Scanner;

public class DoWhileTask4 {
    public static void main(String[] args) {
        //Задача
        //Написать программу, которая получает числа, до тех пор, пока пользователь не введёт 0.
        //После ввода 0, отобразить в консоль количество введенных чисел(не считая 0), их сумму и общее арифметическое
        //Пример:
        //Введите число: 5
        //Введите число: 4
        //Введите число: 3
        //Введите число: 2
        //Введите число: 1
        //Введите число: 0
        //Количество введенных чисел: 5
        //Сумма: 15
        //Среднее арифметическое: 3.0

        Scanner sc = new Scanner(System.in);
        int number;
        int countNumber = 0;
        int summa = 0;

        do {
            System.out.println("Введите число: ");
            number = sc.nextInt();
                summa = summa + number;
                System.out.println("summa: " + summa);
                countNumber++;
                System.out.println("countNumber: " + countNumber);


        } while (number != 0);
        countNumber--;
        System.out.println("Количество введенных чисел: " + countNumber);
        System.out.println("Сумма: " + summa);
        System.out.println("Среднее арифметическое: " + summa / countNumber);

    }
}
