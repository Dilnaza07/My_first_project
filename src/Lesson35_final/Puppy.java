package Lesson35_final;

public class Puppy extends Dog{
    public Puppy(String name, double weight) {
        super(name, weight);
    }

    //@Override
   // final void bark(){}

    public static void main(String[] args) {
        Dog puppy = new Dog("U",2);
        puppy.bark();
    }
}
