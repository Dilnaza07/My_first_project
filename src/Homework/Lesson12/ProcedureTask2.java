package Homework.Lesson12;

import java.util.Scanner;

public class ProcedureTask2 {
    public static void main(String[] args) {
        //Напишите процедуру, которая принимает
        //параметр - натуральное число N - и выводит на экран линию из N символов '-'(тире).
        //Пример:
        //Введите N:
        //10
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();

        printLine(number);

    }

    public static void printLine(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("-");
        }
    }
}

