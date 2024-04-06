package Lesson36_abstract;

abstract class Animal {
     double weight;
     int age;
     String color;

    public Animal(double weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract  void talk();
    abstract void sleep();
    abstract void eat();

    public void rest() {
        sleep();
        eat();
    }


    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

