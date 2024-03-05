package Lesson17Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask4Solution2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String foundNumbers = "Found: ";

        System.out.print("Введите искомое число: ");
        int searchNumber = scanner.nextInt();

        int[] numbers = new int[100];

        boolean foundSearchNumber = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(6);
            if (numbers[i] == searchNumber) {
                if (foundSearchNumber) foundNumbers += ", ";
                foundNumbers = foundNumbers + "numbers[" + i + "] = " + numbers[i];
                foundSearchNumber = true;
            }
        }

        System.out.println("All numbers: " + Arrays.toString(numbers));

        System.out.println();
        if (!foundSearchNumber) System.out.println("Не нашли искомого числа!");
        else System.out.println(foundNumbers);
    }
}
