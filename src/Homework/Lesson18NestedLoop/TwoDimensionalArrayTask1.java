package Homework.Lesson18NestedLoop;

import java.util.Random;

public class TwoDimensionalArrayTask1 {
    public static void main(String[] args) {
        int N = 3, M = 4;
        int[][] numbers = new int[N][M];
        double[][] X = new double[1][2];
        boolean[][] L = new boolean[1][3];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                numbers[i][j] = random.nextInt(10);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
