package Lesson12.Procedures;

import java.util.Scanner;

public class ProcedureTask {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number < 0) showError();
        }

        static void showError() {
            System.out.println("Ошибка программы");
        }



    }

