package Lesson14Functions;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class CurrencyTask2 {
    public static void main(String[] args) {
        String currency = showInputDialog("Input your currency (USD, RUB, EUR, CNY)");
        showMessageDialog(null, "Exchange rate to som: " + getCurrentCurrencyRate(currency));
    }

    static double getCurrentCurrencyRate(String currency) {
        double rate;
        String currencyUppercase = currency.toUpperCase();
        System.out.println(currencyUppercase);
        switch (currency.toUpperCase()) {
            case "USD":
                rate = 89.32;
                break;
            case "RUB":
                rate = 0.98;
                break;
            case "EUR":
                rate = 97.17;
                break;
            case "CNY":
                rate = 12.58;
                break;
            default:
                throw new Error("You wrote incorrect currency");
        }
        return rate;
    }
}
