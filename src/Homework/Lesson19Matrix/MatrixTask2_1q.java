package Homework.Lesson19Matrix;

import java.util.Scanner;

public class MatrixTask2_1q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array: ");

        int size = 100;
        int[] array = new int[size];
        int maxNumber = array[0];
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            String input = sc.next();
            if (input.equals("q")) {
                break;
            }
            int number = Integer.parseInt(input);

            array[i] = number;
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                count = 1;
            } else if (array[i] == maxNumber) {
                count++;
            }
        }

        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Quantity of elements: " + count);
    }
}

