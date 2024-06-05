package L43_ArrayListwithObject;

import java.util.ArrayList;

public class MainTask2 {
    public static void main(String[] args) {


        ArrayList<Cat> catsList = new ArrayList<>();

        catsList.add(new Cat("anna", 2));
        catsList.add(new Cat("mariya", 3));
        catsList.add(new Cat("Inna", 25));

        Cat cat = new Cat("Boika", 6);

        catsList.add(cat);

        System.out.println(catsList.indexOf(cat));
        System.out.println(catsList.indexOf(new Cat("anna", 2)));
        System.out.println(catsList.contains(cat));

        boolean c1 = catsList.get(3).equals(new Cat("Boika", 6));
        boolean c2 = catsList.get(1).equals(new Cat("mariya", 3));
        System.out.println(c1);
        System.out.println(c2);

        catsList.toArray();
        System.out.println(catsList);
    }
}