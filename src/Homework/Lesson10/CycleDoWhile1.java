package Homework.Lesson10;

import java.util.Scanner;

public class CycleDoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int number = sc.nextInt();

        int lastNumber = number % 10;
        number = number / 10;

        boolean hasNearNumbers = false;

        do {
            int preLastNumber = number % 10;
            if (lastNumber == preLastNumber) {
                hasNearNumbers = true;
            }
            number = number / 10;
            System.out.println("Prelast " + preLastNumber + ",lastNumber " + lastNumber);
            lastNumber = preLastNumber;
        }
        while (number != 0);

        if (hasNearNumbers) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }


    }
}



