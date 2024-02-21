import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Calculator2 {
    public static void main(String[] args) {
        String text = showInputDialog(null, "Введите число: ");
        double num1 = Double.parseDouble(text);
        String text2 = showInputDialog(null, "Введите число: ");
        double num2 = Double.parseDouble(text2);
        String operation = showInputDialog(null, "Введите операцию: ");

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
                result = 0;
                showMessageDialog(null, "На ноль делить нельзя");
            }else{
                result = num1 / num2;}
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                result = 0;
                showMessageDialog(null, "Такой операции нет");
        }
        showMessageDialog(null, num1 + " " + operation + " " + num2 + " = " +  result);


    }
}
