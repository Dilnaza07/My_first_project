package Conditions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class ConditionTask3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст Антона: ");
        int antonAge = sc.nextInt();
        System.out.println("Введите возраст Бориса: ");
        int borisAge = sc.nextInt();
        System.out.println("Введите возраст Виктора: ");
        int victorAge = sc.nextInt();

        if (antonAge > borisAge && antonAge > victorAge) {
            System.out.println("Антон старше всех ");
        } else if (borisAge > antonAge && borisAge > victorAge) {
            System.out.println("Борис старше всех ");
        } else if (victorAge > borisAge && victorAge > antonAge) {
            System.out.println("Виктор старше всех ");
        } else if (borisAge == antonAge && borisAge > victorAge) {
            System.out.println("Борис и Антон старше всех ");
        } else if (victorAge == borisAge && victorAge > antonAge) {
            System.out.println("Борис и Виктор старше всех ");
        } else if (victorAge == antonAge && antonAge > borisAge) {
            System.out.println("Антон и Виктор старше всех ");
        } else {
            System.out.println("У Антона, Бориса и Виктора равный возраст");
        }

    }

}

