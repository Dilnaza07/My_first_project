package l48_HashMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Random random = new Random();

//        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();


        for(int i = 0; i < 1000; i++) {

            int number = random.nextInt(101);

            if (hashMap.containsKey(number)) {
                int count = hashMap.get(number);
                hashMap.put(number, count + 1);
            } else {
                hashMap.put(number, 1);
            }

        }


        System.out.println(hashMap);

//        for (Map.Entry<Integer, Integer> entry : entries) {
//            System.out.println(entry);
//        }

//        System.out.println("entries: " + entries);

    }


}
