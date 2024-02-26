package Homework.Lesson17;

import java.util.Random;

public class ArrayTask6 {
    public static void main(String[] args) {
        Random random = new Random();

        int array[] = new int[7];

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6);
            System.out.print(array[i] + " ");

        }
        System.out.println();
        boolean hasDublicate = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == (array[i + 1])) {
                hasDublicate = true;
                System.out.println("Found: " + array[i] + " " + array[i + 1]);
            }
        }

        if (!hasDublicate) {
            System.out.println("Not found");
        }
    }
}




