package Lesson34_Staticpractice;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Bublik", 5,7);
        Dog dog2 = new Dog("Vika", 2,2);
        Dog dog3 = new Dog("Ann", 10,123);

        System.out.println("Создано собак: " + Dog.getDogCount());

    }
}
