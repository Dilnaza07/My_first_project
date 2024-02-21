package Homework.Lesson17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите искомое число: ");
        int searchNumber = scanner.nextInt();

        int[] numbers = new int[10];
        boolean foundSearchNumber = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(6);
        }
        System.out.println("All numbers: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                if (!foundSearchNumber) System.out.print("Нашли: ");
                else System.out.print(", ");
                System.out.print("numbers[" + i + "] = " + numbers[i]);
                foundSearchNumber = true;
            }
        }

        if (!foundSearchNumber) System.out.println("Не нашли искомого числа!");

    }
}
