package l47_hashCode;

import java.util.ArrayList;
import java.util.HashSet;

public class CatsMain2 {
    public static void main(String[] args) {
        Cat2 cat1 = new Cat2(10, "Vasya");
        Cat2 cat2 = new Cat2(20, "Petya");
        Cat2 cat3 = new Cat2(5, "Masha");
        Cat2 cat4 = new Cat2(2, "Natasha");
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        ArrayList<Cat2> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat2);
        cats.add(cat1);
        cats.add(cat1);

        for (int i = 0; i < cats.size() - 1; i++) {
            for (int j = i + 1; j < cats.size(); j++) {
                Cat2 firstCat = cats.get(i);
                Cat2 secondCat = cats.get(j);
                if (firstCat.equals(secondCat)) {
                    System.out.println("Кошка под индексом " + i + ": " + firstCat.hashCode() + " равна кошке под индексом " + j + ": " + secondCat.hashCode());
                }
            }
        }

        HashSet<Cat2> catsHashSet = new HashSet<>();

        catsHashSet.add(cat1);
        catsHashSet.add(cat2);
        catsHashSet.add(cat3);
        catsHashSet.add(cat4);

        System.out.println("HashSet: " + catsHashSet);

        catsHashSet.add(new Cat2(10, "Vasya"));
        catsHashSet.add(cat2);
        catsHashSet.add(cat3);
        catsHashSet.add(cat4);
    }
}
