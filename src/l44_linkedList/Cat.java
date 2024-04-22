package l44_linkedList;

public class Cat extends Animal{

    public Cat(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
