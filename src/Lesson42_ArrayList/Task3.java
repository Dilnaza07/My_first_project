package Lesson42_ArrayList;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {


        ArrayList<Integer> integerArrayList = new ArrayList<>();


        for (int i = 0; i <= 10000; i++) {
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

        ArrayList<Integer> divided23List = new ArrayList<>();

        for (int i = 0; i < integerArrayList.size(); i++) {
            int element = integerArrayList.get(i);
            if (element % 2 == 0 || element % 3 == 0) {
                divided23List.add(element);
            }
        }

        System.out.println("Числа, кратные 2 или 3:");
        System.out.println(divided23List);
    }
}
