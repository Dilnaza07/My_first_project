package Cycles;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
//        while (true) {  // есконечный цикл
//            System.out.println("Привет!");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        int count=0;

        while (n > 0){
            n  = n/10;
            count = count +1;

        }System.out.println("Количество цифр в числе: " + count);





    }
}
