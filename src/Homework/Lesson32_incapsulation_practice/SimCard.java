package Homework.Lesson32_incapsulation_practice;

public class SimCard {

    private String myNumber;

    private Tarif tarif;

//    Tarif beelain = new Tarif("Belain", 1,1.2,30);
//    Tarif oshka = new Tarif("O", 0.95,2,30);
//    Tarif megacom = new Tarif("Megakom", 1.05,1.7,40);

    double balance;


    public SimCard(String myNumber, Tarif tarif, double balance) {
        this.myNumber = myNumber;
        this.tarif = tarif;
        this.balance = balance;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public Tarif getTarif() {
        return tarif;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
