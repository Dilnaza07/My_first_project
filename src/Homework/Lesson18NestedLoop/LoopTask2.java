package Homework.Lesson18NestedLoop;

import java.util.Scanner;

public class LoopTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите границы диапозона (min/max): ");
        int min = sc.nextInt();
        int max = sc.nextInt();

        if(min>=max){
            System.out.println("Ошибка, min должен быть меньше max");
        }

        boolean isNotSimple;

        for (int i = min; i <= max; i++) {
            isNotSimple = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isNotSimple = true;
                    break;
                }
            }
            if (!isNotSimple) {
                System.out.println("Простое число: " + i);
            }
        }
    }
}
