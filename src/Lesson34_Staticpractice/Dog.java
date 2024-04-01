package Lesson34_Staticpractice;

public class Dog {
    private String name;
    private double weight;
    private int old;
    public static int dogCount;

    public Dog(String name, double weight, int old) {
        this.name = name;
        this.weight = weight;
        this.old = old;

        dogCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static void setDogCount(int dogCount) {
        Dog.dogCount = dogCount;
    }
}
