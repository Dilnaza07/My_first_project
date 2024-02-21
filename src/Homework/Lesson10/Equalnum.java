package Homework.Lesson10;


import java.util.Scanner;

public class Equalnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = sc.nextInt();

        int units = n % 10;
        int decimals = n / 10 % 10;
        int hungreds = n / 100 % 10;
        int thousands = n / 1000 % 10;
        int tenthousands = n / 10000 % 10;

        while (n > 0) {
            if (units == decimals ^ decimals == hungreds ^ hungreds == thousands ^ thousands == tenthousands) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
            break;

        }

    }
}