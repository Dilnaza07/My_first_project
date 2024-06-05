package l44_linkedList;

abstract class Animal {

    String name;
    int age;

    public Animal(int age) {
        this.age = age;
    }

    public Animal(){
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
