package lesson24_25_oop_practice;

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

    public String toString(){
        String message = (". Ram size: " + getSize() + ", model: " + getModel());
        return message;
    }

}
