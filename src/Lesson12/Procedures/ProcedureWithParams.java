package Lesson12.Procedures;

import java.util.Scanner;

public class ProcedureWithParams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите число: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int c = sc.nextInt();

        calculateAverage(a,b);
        // printSum(a, b, c);
       // printSum(1, 2, 3);

    }

    static void printSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);

    }

        static void calculateAverage(int num1, int num2){
            int average = num1 + num2 / 2;
            System.out.println("Среднее арифметическое: " + average);
        }
    }




