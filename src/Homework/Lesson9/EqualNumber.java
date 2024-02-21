package Homework.Lesson9;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 == num2 && num1 == num3){
            System.out.println("Все числа одинаковые: " + num1 + "," + num2 + "," + num3);
        }else if (num1 == num2){
            System.out.println("Два числа одинаковые: "  + num1 + "," + num2);
        }else if (num1 == num3){
            System.out.println("Два числа одинаковые: "  + num1 + "," + num3);
        }else if (num2 == num3){
            System.out.println("Два числа одинаковые: "  + num2 + "," + num3);
        }else {
            System.out.println("Нет одинаковых чисел");
        }
    }
}
