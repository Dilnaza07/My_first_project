package Lesson19.Matrix;

import java.util.Random;

public class Matrixtask2Pixels {
    public static void main(String[] args) {
        Random random = new Random();

        int rowsCount = 4, columnsCount = 4;
        int[][] array = new int[rowsCount][columnsCount];
        int sum = 0;
        int count = 0;
        int averageBrightness = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + "\t");
                sum = sum + array[i][j];
                count++;
            }
            System.out.println();
        }
        int rgbMatrix [][] = array;
        averageBrightness = sum / count;
        System.out.println();
        System.out.println("Sum " + sum + ", count " + count);
        System.out.println("Средняя яркость: " + averageBrightness);
        System.out.println("Результат: ");
        System.out.println();

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (array[i][j] < averageBrightness) {
                    rgbMatrix[i][j] = 0;
                } else if (array[i][j] >= averageBrightness) {
                    rgbMatrix[i][j] = 255;
                }
                System.out.print(rgbMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
