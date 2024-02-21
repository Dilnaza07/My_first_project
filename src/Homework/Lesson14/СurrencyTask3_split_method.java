package Homework.Lesson14;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class СurrencyTask3_split_method {
    //Задача - Обменка
    //Написать программу, которая принимает от пользователя валюту, сумму и тип операции(покупка или продажа).
    // Получает результат в сомах. Лимит суммы 200 тыс - если превышает, выводим отрицательное сообщение и сумму которую отказываемся выдавать.
    //продажа 69, 78, 1, 0.33
    //покупка 68, 77, 0.8, 0.25


    public static void main(String[] args) {
        String currency = showInputDialog("Выберите валюту(USD, RUB, EUR, CNY): ");
        String sum1 = showInputDialog("Введите сумму: ");
        String operation = showInputDialog("выберите тип операции(buy/sale): ");
        double sum = Double.parseDouble(sum1);

        double finishSum = getfinishSum(operation, currency, sum);

        if (finishSum >= 200000) {
            showMessageDialog(null, "Ошибка. Превышен лимит суммы 200000 сом." + "Ваша сумма состовляет: " + finishSum);
        } else {
            showMessageDialog(null, "Операция прошла успешно");
        }

    }


    public static double getfinishSum(String operation, String currency, double sum) {
        String currencyUppercase = currency.toUpperCase();
        String operationUppercase = operation.toUpperCase();
        double result;
        double rate;

        if (operationUppercase.equals("BUY")) {
            rate = getCurrentCurrencyBuyRate(currencyUppercase);
            result = rate * sum;
            showMessageDialog(null, "Получено: " + sum + ". Покупка: " + currencyUppercase + " по курсу: " + rate + ", Итого: " + result + " som");
            return result;
        } else if (operationUppercase.equals("SALE")) {
            rate = getCurrentCurrencySaleRate(currencyUppercase);
            result = rate * sum;
            showMessageDialog(null, "Получено: " + sum + ". Продажа: " + currencyUppercase + " по курсу: " + rate + ", Итого: " + result + " som");
            return result;
        } else {
            showMessageDialog(null, "Ошибка. Неверно введен тип операции");
            return 0;
        }
    }


    public static double getCurrentCurrencyBuyRate(String currency) {
        double rateBuy = 0;
        switch (currency) {
            case "USD":
                rateBuy = 89.40;
                break;
            case "EUR":
                rateBuy = 96.70;
                break;
            case "RUB":
                rateBuy = 0.9750;
                break;
            case "KZT":
                rateBuy = 0.1350;
                break;
            default:
                System.out.println("Неверно введена валюта");

        }
        return rateBuy;

    }

    public static double getCurrentCurrencySaleRate(String currency) {
        double rateSale = 0;
        switch (currency) {
            case "USD":
                rateSale = 89.72;
                break;
            case "EUR":
                rateSale = 97.70;
                break;
            case "RUB":
                rateSale = 1.005;
                break;
            case "KZT":
                rateSale = 0.2050;
                break;
            default:
                System.out.println("Неверно введена валюта");

        }

        return rateSale;

    }

}
