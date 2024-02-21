import java.util.Random;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MyRandom {
    public static void main(String[] args) {
        Random random  = new Random();
        int number = random.nextInt();

        String text = showInputDialog("Введмте число: ");
        int number2 = Integer.parseInt(text);
        number = random.nextInt(number2);

        showMessageDialog(null,"Рандомное число: " + number);

        int max = 10;
        int min = 5;

        int abc = random.nextInt((max - min) + 1) + min;
        System.out.println(abc);


        String text2 = showInputDialog("Введите максимальное число: ");
        int max2  = Integer.parseInt(text2);
        String text3 = showInputDialog("Введите минимальное число: ");
        int  min2 = Integer.parseInt(text3);

        int ff = random.nextInt((max2 - min2) + 1) + min2;
        showMessageDialog(null,"Рандомное число между min(" + min2 + ") и max("+ max2 + ") = " + ff);



    }
}
