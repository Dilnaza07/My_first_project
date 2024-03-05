package Lesson21OOPClassesAndObjecs;

public class Objects {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.color = "red";
        car1.engine = "V7";
        car1.speed = 160;

        car2.color = "blue";
        car2.engine = "V3";
        car2.speed = 140;

        car3.color = "white";
        car3.engine = "V8";
        car3.speed = 180;
        car3.model = "BMW";

        System.out.println("Color: " + car1.color + ". Engine: " + car1.engine + ". Speed: " + car1.speed);
        System.out.println("Color: " + car2.color + ". Engine: " + car2.engine + ". Speed: " + car2.speed);
        System.out.println("Color: " + car3.color + ". Engine: " + car3.engine + ". Speed: " + car3.speed);

        Driver driver = new Driver();
        driver.name = "Ivan";
        driver.age = 24;
        driver.experience = 5;

        System.out.println("Driver " + driver.name + ". Age " + driver.age);
    }
}



