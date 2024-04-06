package Homework.Lesson32_incapsulation_practice;

public class SimCard {

    String myNumber;

    Tarif tarif;

//    Tarif beelain = new Tarif("Belain", 1,1.2,30);
//    Tarif oshka = new Tarif("O", 0.95,2,30);
//    Tarif megacom = new Tarif("Megakom", 1.05,1.7,40);

    double balance;
    String calledNumber;

    public SimCard(String myNumber, Tarif tarif, double balance) {
        this.myNumber = myNumber;
        this.tarif = tarif;
        this.balance = balance;
    }
}
