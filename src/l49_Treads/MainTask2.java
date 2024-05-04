package l49_Treads;

import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество людей в очереди: ");

        int peopleCount = sc.nextInt();

        Thread1Ex2 thread1 = new Thread1Ex2("Обработка...",peopleCount/2);
        Thread1Ex2 thread2 = new Thread1Ex2("Обрабатываю человека номер...",peopleCount/2);
        thread1.start();
        thread2.start();


    }
}
