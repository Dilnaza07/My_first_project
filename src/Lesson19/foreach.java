package Lesson19;

import java.util.Random;

public class foreach {
    public static void main(String[] args) {

        int [] numbers2 = new int [10];
        Random random = new Random();

        for(int i = 0; i < numbers2.length; i++){
            numbers2[i] = random.nextInt(100);
        }

        for(int i : numbers2){
            System.out.println("Значение: " + i);
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
    }
}
