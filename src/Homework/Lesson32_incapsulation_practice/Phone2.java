package Homework.Lesson32_incapsulation_practice;

public class Phone2 extends SimCard{

    SimCard simCard1;
    SimCard simCard2;

    String keyboard;

    public Phone2(String name, String currentNumber, double balance, double callPrice, double smsPrice, double internetPrice, String calledNumber) {
        super(name, currentNumber, balance, callPrice, smsPrice, internetPrice, calledNumber);
    }
}
