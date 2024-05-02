package l47_hashCode;

import java.util.ArrayList;

public class CatMain {
    public static void main(String[] args) {

        Cat cat1 = new Cat("abc");
        Cat cat2 = new Cat("cde");

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        ArrayList <Cat> cats = new ArrayList<>();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat2);


       for (int i = 0; i < cats.size()-1; i++) {
           for (int j = 1+1; j < cats.size(); j++) {
               Cat firstCat = cats.get(i);
               Cat secondCat = cats.get(j);
               if (firstCat.equals(secondCat)) {
                   System.out.println("Кошка под индексом " + i + ": " + firstCat.hashCode() + " равна кошке под индексом " + j + ": " + secondCat.hashCode());
               }
          }
        }
    }
}
