package L50_Threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();

        ThreadsEx3 thread1 = new ThreadsEx3(10,"Принтер 1 работает...");
        ThreadsEx3 thread2 = new ThreadsEx3(17,"Принтер 2 работает...");
        ThreadsEx3 thread3 = new ThreadsEx3(20,"Принтер 3 работает...");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println();
        System.out.println();

        Printer.synchronizedPrint("Принтер 4 работает...",10);
        Printer.synchronizedPrint("Принтер 5 работает...",25);
        Printer.synchronizedPrint("Принтер 6 работает...",30);

    }
}
