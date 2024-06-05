package Homework.Lesson32_incapsulation_practice;

import java.util.Arrays;

public class Phone {
    double[] sim1;
    double[] sim2;

    double[] dialedNumber;




    public Phone(double[] sim1, double[] sim2, double[] dialedNumber) {
        this.sim1 = sim1;
        this.sim2 = sim2;
        this.dialedNumber = dialedNumber;
    }


    public void inputNumber(double number) {

    }

    public void makeCall() {
        if (this.sim1[0] == this.dialedNumber[0]) {
            System.out.println("Звонок внутри сети sim1 бесплатный");

        } else if (this.sim2[0] == this.dialedNumber[0]) {
            System.out.println("Звонок внутри сети sim2 бесплатный");

        } else if (this.sim1[0] < this.sim2[0]) {
            System.out.println("Выгоднее сим1, тариф: " + this.sim1[0] + " com/мин");
        } else {
            System.out.println("Выгоднее сим2, тариф: " + this.sim2[0] + " com/мин");
        }
    }

    public void makeSms() {
        if (this.sim1[1] == this.dialedNumber[1]) {
            System.out.println("Sms внутри сети sim1 бесплатный");

        } else if (this.sim2[1] == this.dialedNumber[1]) {
            System.out.println("Sms внутри сети sim2 бесплатный");

        } else if (this.sim1[1] < this.sim2[1]) {
            System.out.println("Выгоднее сим1, тариф: " + this.sim1[1] + ", 1 sms");
        } else {
            System.out.println("Выгоднее сим2, тариф: " + this.sim2[1] + ", 1 sms");
        }
    }

    public void useInternet() {
        if (Arrays.equals(this.sim1, this.dialedNumber)) {
            System.out.println("Интернет внутри сети sim1 бесплатный");

        } else if (Arrays.equals(this.sim2, this.dialedNumber)) {
            System.out.println("Интернет внутри сети sim2 бесплатный");

        } else if (this.sim1[2] <= this.sim2[2]) {
            System.out.println("Выгоднее сим1, тариф: " + this.sim1[2] + ", 1 гб");
        } else {
            System.out.println("Выгоднее сим2, тариф: " + this.sim2[2] + ", 1 гб");
        }

    }
}
