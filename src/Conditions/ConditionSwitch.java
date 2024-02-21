package Conditions;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class ConditionSwitch {
    public static void main(String[] args) {

        String text1 = showInputDialog(null, "Введите номер месяца: ");
        int monthNumber = Integer.parseInt(text1);

        switch (monthNumber) {
            case 1:
                showMessageDialog(null, "Январь");
                break;
            case 2:
                showMessageDialog(null, "Февраль");
                break;
            case 3:
                showMessageDialog(null, "Март");
                break;
            case 4:
                showMessageDialog(null, "Апрель");
                break;
            case 5:
                showMessageDialog(null, "Май");
                break;
            case 6:
                showMessageDialog(null, "Июнь");
                break;
            case 7:
                showMessageDialog(null, "Июль");
                break;
            case 8:
                showMessageDialog(null, "Август");
                break;
            case 9:
                showMessageDialog(null, "Сентябрь");
                break;
            case 10:
                showMessageDialog(null, "Октябрь");
                break;
            case 11:
                showMessageDialog(null, "Ноябрь");
                break;
            case 12:
                showMessageDialog(null, "Декабрь");
                break;
            default:
                showMessageDialog(null, "Такого порядкового номера месяца нет");

        }


    }
}
