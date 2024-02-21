package Homework.Lesson19Matrix;

import java.util.Random;

public class MatrixTask3_MaxMinElement {
    public static void main(String[] args) {
        Random random = new Random();
        int rowsCount = 4, columnsCount = 4;
        int matrix[][] = new int[rowsCount][columnsCount];
        int maxNumber = matrix[0][0], minNumber = matrix[0][0] = 99;
        int rowsIndexMax = 0, columnIndexMax = 0, rowsIndexMin = 0, columnIndexMin = 0;
        int max = 99;
        int min = 10;

        System.out.println("Matrix A: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt((max - min) + 1) + min;
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                    rowsIndexMax = i;
                    columnIndexMax = j;
                }
                if (matrix[i][j] < minNumber) {
                    minNumber = matrix[i][j];
                    rowsIndexMin = i;
                    columnIndexMin = j;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum element A[" + rowsIndexMax + "]" + "[" + columnIndexMax + "]" + " = " + maxNumber);
        System.out.println("Minimum element A[" + rowsIndexMin + "]" + "[" + columnIndexMin + "]" + " = " + minNumber);

    }
}
