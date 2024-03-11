package lesson24_oop_practice;

public class Hdd {
    int size;
    int speed;

    public Hdd(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    public void setSize(int s) {
        this.size = s;
    }

    public void setSpeed(int p) {
        this.speed = p;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }
}
