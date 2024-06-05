package Lesson36_abstract;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(2, 2, "red", 3, 4, 5);
        Cow cow = new Cow(2, 12, "blue");
        Tiger tiger = new Tiger(12, 123, "red", 8, 7, 5);

       // Animal animal = new Animal(2,3,"hh");


        System.out.println(cat);
        cat.talk();

        System.out.println(cow);
        cow.talk();

        System.out.println(tiger);
        tiger.talk();

        cat.rest();
        cow.rest();
        tiger.rest();

        cat.greet();
        tiger.greet();

    }
}
