package lesson24_oop_practice;

public class Ram {

    int size;
    String model;

    public Ram(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public void setSize(int s) {
        this.size = s;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

}