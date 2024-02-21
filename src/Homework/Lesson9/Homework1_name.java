package Homework.Lesson9;

import java.util.Scanner;

public class Homework1_name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String name = sc.nextLine();
        System.out.println("Привет " + name + "!");
    }
}
