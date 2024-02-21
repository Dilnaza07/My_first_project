package Homework.Lesson9;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Homework1 {
    public static void main(String[] args) {
        String A1 = showInputDialog(null, "Введите координаты точки А (Х): ");
        String A2 = showInputDialog(null, "Введите координаты точки А (Y): ");
        double x1 = Double.parseDouble(A1);
        double y1 = Double.parseDouble(A2);

        String B1 = showInputDialog(null, "Введите координаты точки B (Х): ");
        String B2 = showInputDialog(null, "Введите координаты точки B (Y): ");
        double x2 = Double.parseDouble(B1);
        double y2 = Double.parseDouble(B2);

        //d = sqrt((x2 - x1)^2 + (y2 - y1)^2) формула вычисления длины отрезка
        double d1 = Math.pow((x2 - x1), 2);
        double d2 = Math.pow((y2 - y1), 2);
        double dlina = Math.sqrt(d1 + d2);
        String result = String.format("%.3f", dlina);
        showMessageDialog(null,"Длина отрезка АВ: " + result);
    }
}
