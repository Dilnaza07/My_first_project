package Lesson16Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask4 {
    public static void main(String[] args) {

        Random random = new Random();
        int size = 10;
        int[] randomNumbers = new int[size];

        int lessThan50Sum = 0;
        int moreThan50Sum = 0;
        int lessThan50Сount  = 0;
        int moreThan50Сount  = 0;

        System.out.println("Массив: ");

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(101);
            if (randomNumbers[i] < 50) {
                lessThan50Sum += randomNumbers[i];
                lessThan50Сount++;
            } else {
                moreThan50Sum += randomNumbers[i];
                moreThan50Сount++;
            }
        }
        System.out.println(Arrays.toString(randomNumbers));

        float lessThan50Avarage = (float)lessThan50Sum / lessThan50Сount;
        float moreThan50Avarage = (float)moreThan50Sum / moreThan50Сount;
        System.out.printf("Среднее арифметическое значение всех элементов, которые меньше 50: %.2f\n", lessThan50Avarage);
        System.out.printf("Среднее арифметическое значение всех элементов, которые больше 50: %.2f", moreThan50Avarage);
    }
}
