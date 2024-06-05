package Homework.Lesson32_incapsulation_practice;

public class PhoneTest2 {
    public static void main(String[] args) {

        final Tarif beelain = new Tarif("Beelain", 1, 1.2, 30);
        final Tarif oshka = new Tarif("Oshka", 0.95, 2, 30);
        final Tarif megacom = new Tarif("Megakom", 1.05, 1.7, 40);

        SimCard simCard1 = new SimCard("0778123123", beelain, 100);
        SimCard simCard2 = new SimCard("0700212212", oshka, 50);

        Phone2 phone = new Phone2(simCard1, simCard2);

        phone.makeCall("0550900410");


//        phone.makeSms();
//        phone.useInternet();


    }
}
