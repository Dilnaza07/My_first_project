package Lesson16Arrays;

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        //Заполните массив случайными числами в интервале от 0 до 100 включительно
        // и найдите среднее арифметическое его значений
        //Пример:
        //Массив:
        //1 2 3 4 5
        //Среднее арифметическое 3.0

        Random random = new Random();
        int size = 10;
        int[] randomNumbers = new int[size];

        int sum = 0;

        System.out.println("Массив: ");

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(101);
            System.out.println(randomNumbers[i]);
                sum += randomNumbers[i];

        }
        float average = (float) sum / size;
       // System.out.printf("Среднее арифметическое: %.2f", (float) sum / size );
        System.out.printf("Среднее арифметическое: %.2f", average );
    }
}
