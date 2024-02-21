package Conditions;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class ConditionsTask1 {
    public static void main(String[] args) {
        String text = showInputDialog(null, "Введите два числа: ");
        String text2 = showInputDialog(null, "Введите второе число: ");

        double number = Double.parseDouble(text);
        double number2 = Double.parseDouble(text2);

        if (number > number2) {
            showMessageDialog(null, "Наименьшее число: " + number2);
        } else {
            showMessageDialog(null, "Наименьшее число: " + number);
        }


    }
}
