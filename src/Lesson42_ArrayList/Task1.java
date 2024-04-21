package Lesson42_ArrayList;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {


        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i <= 100000000; i++) {
            for (int j = 0; j <= i; j++) {
                if (j * j == i) {
                    integerArrayList.add(i);
                    break;
                } else if (j * j > i) {
                    break;
                }

            }
        }
        System.out.println("Квадраты чисел до 10000: ");
        System.out.println(integerArrayList);
    }
}
