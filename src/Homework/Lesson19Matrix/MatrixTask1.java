package Homework.Lesson19Matrix;

import java.util.Random;

public class MatrixTask1 {
    public static void main(String[] args) {
        Random random = new Random();

        int rowsCount = 3, columnsCount = 3;
        int[][] array = new int[rowsCount][columnsCount];
        int sum = 0;
        int count = 0;
        double averageBrightness = 0;
        int max = 9;
        int min = 1;


        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                array[i][j] = random.nextInt((max - min) + 1) + min;
                System.out.print(array[i][j] + "\t");
                sum = sum + array[i][j];
                count++;
            }
            System.out.println();
        }
        averageBrightness = (double) sum / count;
        System.out.println();
        System.out.println("Sum " + sum + ", count " + count);
        System.out.printf("Среднее арифметическое: %f" ,averageBrightness);
    }
}
