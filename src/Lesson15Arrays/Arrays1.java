package Lesson15Arrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();

        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = i * i;
            System.out.println(number[i]);
        }
    }
}
