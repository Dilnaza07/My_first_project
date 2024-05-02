package l48_HashMap;

import java.util.HashMap;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();

        HashMap <Integer, Integer> hashMap = new HashMap<>();
        Integer key = 0;
        Integer value = 1;

        for (int i = 0; i <1000 ; i++) {
            key = random.nextInt(100);
            if(hashMap.get(key)==null){
                hashMap.put(key, value=1);
            }else {
            }
        }
        hashMap.put(key,++value);

        System.out.println(hashMap);
    }
}
