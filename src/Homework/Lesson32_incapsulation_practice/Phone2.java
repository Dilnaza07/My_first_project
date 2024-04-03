//package Homework.Lesson32_incapsulation_practice;
//
//import java.util.Arrays;
//
//public class Phone2 extends SimCard {
//
//    SimCard simCard1;
//    SimCard simCard2;
//
//    String keyboard;
//
//    public Phone2(String name, String currentNumber, double balance, double callPrice, double smsPrice, double internetPrice, String calledNumber, SimCard simCard1, SimCard simCard2) {
//        super(name, currentNumber, balance, callPrice, smsPrice, internetPrice, calledNumber);
//    }
//
////    public Phone2(SimCard simCard1, SimCard simCard2) {
////        super(name, currentNumber, balance, callPrice, smsPrice, internetPrice, calledNumber);
////    }
//
//    public static void on() {
//        System.out.println("Телефон включен.");
//        System.out.println("Выберите операцию: " +
//                "1 - включить" +
//                "2 - выключить" +
//                "3 - набрать номер" +
//                "4 - позвонить" +
//                "5 - отправить смс" +
//                "6 - использовать интернет" +
//                "7 - проверить баланс" +
//                "8 - сменить сим карту");
//    }
//
//
//    public void makeCall(String currentNumber, String calledNumber) {
//        if (currentNumber.startsWith("550", 1)) {
//            currentNumber = "mega";
//        } else if (currentNumber.startsWith("700", 1)) {
//            currentNumber = "o";
//        } else if (currentNumber.startsWith("775", 1)) {
//            currentNumber = "bee";
//
//        }
//
//        public void makeSms () {
//
//        }
//
//        public void useInternet () {
//
//        }
//
//      //  public void identificationNumber (String currentNumber, String calledNumber){
//
//        }
//    }