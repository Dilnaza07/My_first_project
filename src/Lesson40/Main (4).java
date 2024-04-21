//package Lesson40;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your number");
//        int number = sc.nextInt();
//        boolean isNumSquare = isNumberSquare(number);
//        System.out.println(isNumSquare);
//        if(isNumSquare){
//            System.out.println("Number is square");
//        } else {
//            throw new ArithmeticException("Number is not square");
//        }
//    }
//
//    public static boolean isNumberSquare(int number) {
//        for (int i = 0; i <= number; i++) {
//            if (i * i == number) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
