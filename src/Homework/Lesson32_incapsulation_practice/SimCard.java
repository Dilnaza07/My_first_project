package Homework.Lesson32_incapsulation_practice;

public class SimCard {

    String name;

    String currentNumber;

    double balance;
    double callPrice;

    double smsPrice;
    double internetPrice;

    String calledNumber;


    public SimCard(String name, String currentNumber, double balance, double callPrice, double smsPrice, double internetPrice, String calledNumber) {
        this.name = name;
        this.currentNumber = currentNumber;
        this.balance = balance;
        this.callPrice = callPrice;
        this.smsPrice = smsPrice;
        this.internetPrice = internetPrice;
        this.calledNumber = calledNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(String currentNumber) {
        this.currentNumber = currentNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCallPrice() {
        return callPrice;
    }

    public void setCallPrice(double callPrice) {
        this.callPrice = callPrice;
    }

    public double getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(double smsPrice) {
        this.smsPrice = smsPrice;
    }

    public double getInternetPrice() {
        return internetPrice;
    }

    public void setInternetPrice(double internetPrice) {
        this.internetPrice = internetPrice;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }
}
