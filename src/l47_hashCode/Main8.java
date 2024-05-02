package l47_hashCode;

import java.util.ArrayList;
import java.util.HashSet;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(400);
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0, hashSetSum = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 100; j++) {
                integers.add(j);
                sum += j;
                hashSet.add(j);
            }
        }
        for (int i = 0; i < hashSet.size(); i++) {
           // hashSetSum += hashSet;
        }
        System.out.println(integers);
        System.out.println(sum);
        System.out.println(hashSetSum);
        System.out.println(hashSet);
    }
}
