package Lesson17Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int max = 5;
        int min = 0;
        int[] array = new int[max];

        System.out.println("Массив:");
        for (int i = 0; i < max; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Что ищем?");
        int number = sc.nextInt();

        int nX = -1;

        for (int i = 0; i < max; i++) {
            if (array[i] == number) {
                nX = i;
                System.out.println("A{" + nX + "} = " + number);
            }
        }
        if (nX < 0)
            System.out.println("Не нашли!");

    }


}

