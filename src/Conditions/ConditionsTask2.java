package Conditions;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class ConditionsTask2 {
    public static void main(String[] args) {
        String text1 = showInputDialog(null, "Введите первое число: ");
        String text2 = showInputDialog(null, "Введите второе число: ");
        String text3 = showInputDialog(null, "Введите третье число: ");

        int number1 = Integer.parseInt(text1);
        int number2 = Integer.parseInt(text2);
        int number3 = Integer.parseInt(text3);

        if (number1 > number2) { if (number1 > number3)
            showMessageDialog(null, "Максимальное число: " + number1);
        } else {
            if (number2 > number1 && number2 > number3) {
                showMessageDialog(null, "Максимальное число: " + number2);
            } else {
                showMessageDialog(null, "Максимальное число: " + number3);
            }
        }
    }
}
