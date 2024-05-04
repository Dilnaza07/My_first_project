package l49_Treads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько копий документа хотите напечатать?");
        int count = sc.nextInt();

        DocumentsThread documentsThread = new DocumentsThread(count);
        documentsThread.start();

        for (int i = 0; i < count; i++) {
            System.out.println("Печатаю " + (i + 1) + " копию документа ");
        }

    }
}
