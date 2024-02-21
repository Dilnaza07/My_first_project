package Lesson17;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask6 {
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





    }


}

