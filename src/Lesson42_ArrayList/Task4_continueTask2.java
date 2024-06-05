package Lesson42_ArrayList;

import java.util.ArrayList;

public class Task4_continueTask2 {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                integerArrayList.add(i);

            } else {
                integerArrayList.add(counter, i);
                counter++;
            }
        }
        System.out.println("Нечетные/четные: ");
        System.out.println(integerArrayList);


        for (int i = 0; i < integerArrayList.size(); ) {
            int element = integerArrayList.get(i);
            if (element % 2 == 0) {
                integerArrayList.remove(i);
            } else {
                i++;
            }
        }

        System.out.println(integerArrayList);

    }
}

