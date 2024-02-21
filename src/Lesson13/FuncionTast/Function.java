package Lesson13.FuncionTast;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = calculatrSum(num1,num2,num3);
        System.out.println("Summa: " + sum);
    }

    static int calculatrSum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }
}
