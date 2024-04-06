package Homework.Lesson32_incapsulation_practice;

public class PhoneTest2 {
    public static void main(String[] args) {

    Tarif beelain = new Tarif("Belain", 1,1.2,30);
    Tarif oshka = new Tarif("O", 0.95,2,30);
    Tarif megacom = new Tarif("Megakom", 1.05,1.7,40);

    SimCard simCard1 = new SimCard("0778123123",beelain,100);
    SimCard simCard2 = new SimCard("0700212212",oshka,50);

    Phone2 phone = new Phone2(simCard1,simCard2);

     phone.on();
 //    phone.makeCall("0555900410");
//        phone.makeSms();
//        phone.useInternet();






    }
}
