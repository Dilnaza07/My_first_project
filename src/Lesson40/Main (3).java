//package Lesson40;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Random rnd = new Random();
//        int[] array = new int[3];
//        try {
//            for (int i = 0; i < array.length + 1; i++) {
//                array[i] = rnd.nextInt(10);
//                System.out.println(array[i]);
//            }
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println(ex);
//        }
//
//        int a = 0;
//        int d = 10;
//        try {
//            System.out.println(d + " / " + a);
//            System.out.println(d / a);
//        } catch (ArithmeticException ex) {
//            System.out.println(ex);
//        }
//    }
//}
//
