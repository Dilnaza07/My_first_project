package Lesson29_inheritance_practice2;

public class FrenchBaguette extends Bread {

    String name = "Провансальский багет";
    int scarringCount;
    double length;

    FrenchBaguette(double weight, double price, String produceCompany, double length, int scarringCount) {
        super(weight, price, produceCompany);
        this.length = length;
        this.scarringCount = scarringCount;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getScarringCount() {
        return scarringCount;
    }

    public void setScarringCount(int scarringCount) {
        this.scarringCount = scarringCount;
    }

    void scarring() {
        System.out.println("Багет зарубцован");
    }

    @Override
    void pack(){
        System.out.println("Хлеб готов");
        System.out.println("Только в экологичный пакет");
    }

}
