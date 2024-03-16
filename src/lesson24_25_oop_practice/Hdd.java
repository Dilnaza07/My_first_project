package lesson24_25_oop_practice;

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

    @Override
    public String toString(){
        String message = (". Hdd  size: " + getSize() + ", speed: " + getSpeed());
        return message;
    }
}
