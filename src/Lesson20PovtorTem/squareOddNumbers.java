package Lesson20PovtorTem;

public class squareOddNumbers {
    public static void main(String[] args) {
        // вывести все квадраты нечетных чисел от нуля до 100

        int[] number = new int[100];

        int oddNumber = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] += i;
        }

        System.out.println();

        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println("OddNumbers: " + i);
                System.out.println("SquareOddNumbers: " + i * i);
            }
        }
        System.out.println()
        ;
        for (int i : number) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println("SquareOddNumbers: " + i * i);
            }
        }
    }
}
