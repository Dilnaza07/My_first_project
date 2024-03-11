package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите число: ");
        double num2 = sc.nextDouble();
        System.out.println("Введите операцию: ");
        String operation = sc.next();

        double result;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/" : if(num2 ==0){
                System.out.println("На ноль делить нельзя");
                result = 0;
            }else{
                result = num1 / num2;}
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                result = 0;
                System.out.println("Такой операции нет");
        }
        System.out.printf(num1 + " " + operation + " " + num2 + " = " + "%.2f", result);


    }
}
