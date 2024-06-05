package L46_Multiple;

import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 пар: ");
        System.out.println();

        ArrayList<Multiple> multiples = new ArrayList<>();

        for (int i =0; i < 5; i++) {
            System.out.print("Введите " + (i + 1) + " пару: ");
            Integer first = scanner.nextInt();
            Integer second = scanner.nextInt();
            Multiple multiple = new Multiple(first, second);
            tryToAddNewEntry(multiples, multiple);
        }

        System.out.println("Конечный список элементов: " + multiples);

    }

    public static void tryToAddNewEntry(ArrayList<Multiple> multiples, Multiple newMultiple) {

        for (Multiple multiple : multiples) {
            if (multiple.multiplyElements().equals(newMultiple.multiplyElements())) {
                return;
            }
        }
        multiples.add(newMultiple);
    }
}
