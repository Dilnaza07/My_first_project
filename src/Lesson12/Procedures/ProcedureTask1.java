package Lesson12.Procedures;

import java.util.Scanner;

public class ProcedureTask1 {
    public static void main(String[] args) {

        calculateMultiplicationTable();

    }

    static void calculateMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {

            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " * " + i + " = " + result);
            }
        } else {
            System.out.println("Error");
        }
    }


}

