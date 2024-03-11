package lesson24_oop_practice;

public class Cpu {
    String model;
    int coreCount;
    int frequency;

    public Cpu(String model, int coreCount, int frequency) {
        this.coreCount = coreCount;
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setModel(String m) {
        this.model = model;
    }

    public void setCoreCount(int n) {
        this.coreCount = n;
    }

    public void setFrequency(int m) {
        this.frequency = m;
    }

}
