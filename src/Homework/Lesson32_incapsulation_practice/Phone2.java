package Homework.Lesson32_incapsulation_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Phone2 {

    SimCard simCard1;
    SimCard simCard2;

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
        System.out.println("2 - выключить");
        System.out.println("3 - набрать номер");
        System.out.println("4 - позвонить");
        System.out.println("5 - отправить смс");
        System.out.println("6 - использовать интернет");
        System.out.println("7 - проверить баланс");
        System.out.println("8 - сменить сим карту");

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

    public void dualNumber(){
        System.out.println("Введите номер: ");
    }


    public void makeCall(String calledNumber) {

    }//


    //   public void makeSms () {

    //  }

    //   public void useInternet () {

    //   }

    public void identificationNumber(String calledNumber) {
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
                numberCode = "1";
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
                numberCode = "2";
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
                numberCode = "3";
                break;

            default:
                System.out.println("Неверно введен номер");
        }
    }

}
