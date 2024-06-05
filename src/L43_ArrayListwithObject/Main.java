package L43_ArrayListwithObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Cat> catsList = new ArrayList<>();

        catsList.add(new Cat("ann", 2));
        catsList.add(new Cat("m2", 3));
        catsList.add(new Cat("Inna", 25));

        Cat cat = new Cat("B3",6);

        catsList.add(cat);

        System.out.println(catsList.indexOf(cat));
        System.out.println(catsList.indexOf(new Cat("ann",2)));
        System.out.println(catsList.contains(cat));

    }
}