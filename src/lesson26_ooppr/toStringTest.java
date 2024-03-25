package lesson26_ooppr;

import java.util.Random;
import java.util.Scanner;

public class toStringTest {
    public static void main(String[] args) {
        //to string присутствует в каждом обьекте по умолчанию

        int [] array = new int[5];
        System.out.println(array); //array.toString()
    Random rnd = new Random();
        System.out.println(rnd);
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

    }
}
