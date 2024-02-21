package Conditions;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class ConditionsTask3 {
    public static void main(String[] args) {

        String text1 = showInputDialog(null, "Возраст Антона: ");
        String text2 = showInputDialog(null, "Возраст Бориса: ");
        String text3 = showInputDialog(null, "Возраст Виктора: ");

        int antonAge = Integer.parseInt(text1);
        int borisAge = Integer.parseInt(text2);
        int victorAge = Integer.parseInt(text3);

        if (antonAge > borisAge && antonAge > victorAge) {
            showMessageDialog(null, "Антон старше всех ");
        } else if (borisAge > antonAge && borisAge > victorAge) {
            showMessageDialog(null, "Борис старше всех ");
        } else if (victorAge > borisAge && victorAge > antonAge) {
            showMessageDialog(null, "Виктор старше всех ");
        } else if (borisAge == antonAge && borisAge > victorAge) {
            showMessageDialog(null, "Борис и Антон старше всех ");
        } else if (victorAge == borisAge && victorAge > antonAge) {
            showMessageDialog(null, "Борис и Виктор старше всех ");
        } else if (victorAge == antonAge && antonAge > borisAge) {
            showMessageDialog(null, "Антон и Виктор старше всех ");
        } else {
            showMessageDialog(null, "У Антона, Бориса и Виктора равный возраст");
        }

    }
}
