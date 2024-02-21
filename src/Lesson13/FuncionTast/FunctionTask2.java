package Lesson13.FuncionTast;

import java.util.Scanner;

public class FunctionTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();

        int result = calculateSumOfDigitsOfNumber(number);
        System.out.println(result);

        if (result > 50) {
            System.out.println("Сумма больше 50 ");
        }else {
            System.out.println("Сумма меньше 50");
        }
    }

    public static int calculateSumOfDigitsOfNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
