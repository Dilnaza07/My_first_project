package Homework.Lesson9;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class HumanAge {
    public static void main(String[] args) {
        String text = showInputDialog(null, "Введите возраст: ");
        int age = Integer.parseInt(text);

        int units = age % 10;
        int decimals = age / 10 % 10;
        int hungreds = age / 100 % 10;


        if (age > 4 && age < 21) {
            showMessageDialog(null, "Вам " + age + " лет");
        } else if (age > 120) {
            showMessageDialog(null, "Вы бессмертны");
        } else if (age < 1) {
            showMessageDialog(null, "Вам слишком мало лет");
        }else if (decimals == 1 && units <= 4){
            showMessageDialog(null, "Вам " + age + " лет");
        } else if (units == 1) {
            showMessageDialog(null, "Вам " + age + " год");
        } else if (units < 5 && units>0) {
            showMessageDialog(null, "Вам " + age + " года");
        } else {
            showMessageDialog(null, "Вам " + age + " лет");
        }


    }

}
