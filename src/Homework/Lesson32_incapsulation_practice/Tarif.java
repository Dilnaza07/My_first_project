package Homework.Lesson32_incapsulation_practice;

public class Tarif {
    String name;
    double callPrice;
    double smsPrice;
    double internetPrice;


    public Tarif(String name, double callPrice, double smsPrice, double internetPrice) {
        this.name = name;
        this.callPrice = callPrice;
        this.smsPrice = smsPrice;
        this.internetPrice = internetPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
