package Lesson15Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("введите максимум: ");
        int max = sc.nextInt();
        System.out.println("Введите минимум ");
        int min = sc.nextInt();

        int size = 100;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }

        System.out.println(Arrays.toString(array));

    }
}


