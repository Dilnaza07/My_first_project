package Lesson41;

import java.util.Scanner;

public class Exeptions {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();


        boolean isSquareNumber = isSquareNumber(number);
        if (!isSquareNumber) {
            throw new Error();
        }
    }

    public static boolean isSquareNumber(int number) {
        for (int i = number; i > 0; i--) {
            if (i * i == number) {
                System.out.println("Число " + number + " является квадратом");
                return true;
            }
        }
        return false;
    }
}
