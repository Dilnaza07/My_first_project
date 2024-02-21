package Homework.Lesson14;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class СurrencyTask3 {
    //Задача - Обменка
    //Написать программу, которая принимает от пользователя валюту, сумму и тип операции(покупка или продажа).
    // Получает результат в сомах. Лимит суммы 200 тыс - если превышает, выводим отрицательное сообщение и сумму которую отказываемся выдавать.
    //продажа 69, 78, 1, 0.33
    //покупка 68, 77, 0.8, 0.25

// разделить метод на 2, разделять методы
    //солид 1 принцип метод отвечает за что то одно


    public static void main(String[] args) {
        String currency = showInputDialog("Выберите валюту(USD, RUB, EUR, CNY): ");
        String sumToTransfer = showInputDialog("Введите сумму: ");
        String operation = showInputDialog("выберите тип операции(buy/sale): ");
        double sum = Double.parseDouble(sumToTransfer);

        double finishSum = getCurrentCurrencyRate(currency, operation, sum);

        if (finishSum >= 200000) {
            showMessageDialog(null, "Ошибка. Превышен лимит суммы 200000 сом." + "Ваша сумма состовляет: " + finishSum);
        } else {
            showMessageDialog(null, "Операция прошла успешно");
        }

    }

    public static double getCurrentCurrencyRate(String currency, String operation, double sum) {
        double rateBuy = 0;
        double rateSalle = 0;
        String currencyUppercase = currency.toUpperCase();
        String operationUppercase = operation.toUpperCase();
        System.out.println(operationUppercase);
        switch (currency.toUpperCase()) {
            case "USD":
                rateBuy = 89.40;
                rateSalle = 89.72;
                break;
            case "EUR":
                rateBuy = 96.70;
                rateSalle = 97.70;
                break;
            case "RUB":
                rateBuy = 0.9750;
                rateSalle = 1.005;
                break;
            case "KZT":
                rateBuy = 0.1350;
                rateSalle = 0.2050;
                break;
            default:
                System.out.println("Неверно введена валюта");

        }

        double result;

        if (operationUppercase.equals("BUY")) {
            result = rateBuy * sum;
            showMessageDialog(null, "Получено: " + sum + " .Покупка: " + currencyUppercase + " по курсу: " + rateBuy + ", Итого: " + result + " som");
            return result;
        } else if (operationUppercase.equals("SALE")) {
            result = rateSalle * sum;
            showMessageDialog(null, "Получено: " + sum + " .Продажа: " + currencyUppercase + " по курсу: " + rateSalle + ", Итого: " + result + " som");
            return result;
        } else {
            showMessageDialog(null, "Ошибка. Неверно введен тип операции");
            return 0;
        }

    }
}
