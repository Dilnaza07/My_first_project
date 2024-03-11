package lesson24_oop_practice;

public class Os {


    double version;
    String name;

    public Os(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void setVersion(double s) {
        this.version = s;
    }

    public void setName(String m) {
        this.name = m;
    }

    public double getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }
}
