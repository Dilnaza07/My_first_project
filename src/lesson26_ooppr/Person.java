package lesson26_ooppr;

public class Person {
    String name;
    int age;
    String countryFrom;

    Person(String name, int age, String countryFrom) {
        this.name = name;
        this.age = age;
        this.countryFrom = countryFrom;
    }

    //Constructors, getters and setters

    @Override
    public String toString(){
        String message = "My name is " + this.name + ". I'm " + this.age + " years old. I am from " + this.countryFrom;
        return message;
    }
}
class PersonTest{
    public static void main(String[] args) {
        Person p = new Person("Marry", 23, "USA");
        System.out.println(p);
    }
}
