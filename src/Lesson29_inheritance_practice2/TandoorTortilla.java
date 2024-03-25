package Lesson29_inheritance_practice2;

public class TandoorTortilla extends Bread {
    double radius;

    TandoorTortilla(double weight, double price, String produceCompany, double radius) {
        super(weight, price, produceCompany);
        this.radius = radius;
        if (weight <= 0)
            System.out.println(  "Лепешка без веса - подделка");

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void drawPrints() {
        System.out.println("Нанесли узоры");
    }

    void varnish() {
        System.out.println("Лакировали");
    }


}
