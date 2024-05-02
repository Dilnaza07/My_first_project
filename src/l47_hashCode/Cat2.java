package l47_hashCode;

import java.util.Objects;

public class Cat2 {
    private int age;
    private String name;

    public Cat2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat2 cat = (Cat2) o;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + this.age +
                ", name='" + this.name + '\'' +
                '}';
    }
}


