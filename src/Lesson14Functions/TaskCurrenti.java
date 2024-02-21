package Lesson14Functions;

import static javax.swing.JOptionPane.*;

public class TaskCurrenti {
    public static void main(String[] args) {

        String currency = showInputDialog("Введите валюту(USD,EUR,RUB,KZT): ");
        String buySall = showInputDialog("Введите тип операций(buy/sell)");

        showMessageDialog(null, "Курс валюты " + currency + " " + buySall + ": " + getCurrentcyTaskRate(currency,buySall));

        int result = showConfirmDialog(null,"Согласны ли вы? ");
    }

    static double getCurrentcyTaskRate(String currencyCode, String buySale) {
        double rateBuy;
        double rateSall;
       // String currencyUppercase = currencyUppercase();
        switch (currencyCode) {
            case "USD":
                rateBuy = 89.40; rateSall = 89.72;
                break;
            case "EUR":
                rateBuy = 96.70; rateSall = 97.70;
                break;
            case "RUB":
                rateBuy = 0.9750; rateSall = 1.005;
                break;
            case "KZT":
                rateBuy = 0.1350; rateSall = 0.2050;
                break;
            default:
                throw new Error();
              //  rateBuy = 1; rateSall = 1;
        }
        if (buySale=="buy"){
        return rateBuy;}
        else{
            return rateSall;
        }

    }
}
