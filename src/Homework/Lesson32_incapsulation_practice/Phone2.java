package Homework.Lesson32_incapsulation_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Phone2 {

    SimCard simCard1;
    SimCard simCard2;

    String calledNumber;
    String myNumber;
    String tarifOfNumber;

    String keyboard = "1,2,3,4,5,6,7,8";

    public Phone2(SimCard simCard1, SimCard simCard2) {
        this.simCard1 = simCard1;
        this.simCard2 = simCard2;
    }


    public void on() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Телефон включен.");
        System.out.println("Выберите операцию: ");
        System.out.println("1 - включить");

        System.out.println("4 - позвонить");
        System.out.println("5 - отправить смс");
        System.out.println("6 - использовать интернет");
        System.out.println("7 - проверить баланс");
        System.out.println("8 - сменить сим карту");  //новую сим карту
        System.out.println("2 - выключить");

        int num = sc.nextInt();

        switch (num) {
            case 1:
                on();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:

        }


    }

//    public void dualNumber(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите номер: ");
//        this.calledNumber = sc.next();
//    }


    public void makeCall(String calledNumber) {
        this.calledNumber = calledNumber;
        getProfitTarifOfCall();


    }//



    //  }

    //   public void useInternet () {

    //   }

    public String identificationNumber(String calledNumber) {
        String numberCode = calledNumber.substring(1, 4);

        switch (numberCode) {
            case "700":
            case "701":
            case "702":
            case "703":
            case "704":
            case "705":
            case "706":
            case "707":
            case "708":
            case "709":
                tarifOfNumber = "1";
                break;

            case "550":
            case "551":
            case "552":
            case "553":
            case "554":
            case "555":
            case "556":
            case "557":
            case "558":
            case "559":
                tarifOfNumber = "2";
                break;

            case "770":
            case "771":
            case "772":
            case "773":
            case "774":
            case "775":
            case "776":
            case "777":
            case "778":
            case "779":
                tarifOfNumber = "3";
                break;

            default:
                System.out.println("Неверно введен номер");
        }
        return tarifOfNumber;
    }


    public void getProfitTarifOfCall() {
        String calledNumberTarif = identificationNumber(calledNumber);
        String simkard1Tarif = identificationNumber(simCard1.getMyNumber());
        String simkard2Tarif = identificationNumber(simCard2.getMyNumber());

        if (simkard1Tarif.equals(calledNumberTarif)) {
            System.out.println("Выгоднее звонить с симкарты " + simCard1.getTarif().getName() + ", тариф: звонок внутри сети бесплатный");

        } else if (simkard2Tarif.equals(calledNumberTarif)) {
            System.out.println("Выгоднее звонить с симкарты " + simCard2.getTarif().getName() + ", тариф: звонок внутри сети бесплатный");

        } else if (simCard1.getTarif().getCallPrice() <= simCard2.getTarif().getCallPrice()) {
            System.out.println("Выгоднее звонить с симкарты " + simCard1.getTarif().getName() + ", тариф: " + simCard1.getTarif().getCallPrice());

        } else if (simCard2.getTarif().getCallPrice() <= simCard1.getTarif().getCallPrice()) {
            System.out.println("Выгоднее звонить с симкарты " + simCard2.getTarif().getName() + ", тариф: " + simCard2.getTarif().getCallPrice());

        } else {
            System.out.println("ошибка");
        }
    }
}