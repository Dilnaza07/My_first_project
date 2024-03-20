package Lesson29_inheritance_practice;

public class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String a) {
        this.name = a;
    }

    public void setAge(int b) {
        this.age = b;
    }

    public void setGrade(double d) {
        this.grade = d;
    }

    @Override
    public String toString() {
        return "Student name: " + this.name + ", age: " + this.age + ", grade: " + this.grade;
    }

}
