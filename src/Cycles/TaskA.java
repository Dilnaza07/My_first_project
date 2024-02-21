package Cycles;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число: ");
            int A = sc.nextInt();
            System.out.println("Введите второе число: ");
            int B = sc.nextInt();

            if (A < 0 || A > B) {
                System.out.println("Неверно, введи число согласно условию (0<A<B)");
            } else {
                while (A > 0 && A <= B) {
                    int result = A * A;
                    System.out.println(A + "*" + A + "=" + result);
                    A++;
                }
            }
        }

    }

}

