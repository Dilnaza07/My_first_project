package Lesson15Arrays;

import java.util.Scanner;

public class ArrayExsample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int [] a = new int [n];

        for (int i = 0; i <n; i ++) {
            System.out.println("A[" + i + "] = ");
            a[i] = sc.nextInt();
        }

            System.out.println("Array a: ");
            for (int i = 0; i < n; i++){
                System.out.println(a[i] + " ");
            }
        }

    }


