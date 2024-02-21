import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class MessageDialog {
    public static void main(String[] args) {

        showMessageDialog(null,"Привет!");

        String text = showInputDialog("Введмте число: ");

//        System.out.println("Я ввел такой текст: " + text);

        int number = Integer.parseInt(text);
        System.out.println(number);

//        int number2 = number * 100;
//        System.out.println(number2);

        String text2 = showInputDialog("Введите дробное число: ");
        double number3 = Double.parseDouble(text2);
        System.out.println(number3);

        String text3 = showInputDialog("Введите дробное число: ");
        double number4 = Double.parseDouble(text3);
        System.out.println(number4);

        double summ = number + number3 + number4;
        //showMessageDialog(null, "Суммв двух чисел: " + summ);

        String result = "Первое число: " + number + "\n" + "Второе число: " + number3 + "\n" + "Третье число: " + number4 + "\n" + "Сумма трех чисел: " + summ;
        showMessageDialog(null,result);


    }
}
