package Lesson29_inheritance_practice2;

public class ArmenianLavash extends Bread{

    double radius;
    int thickness;

    String name = "Элитный лаваш из Дилижана";


    ArmenianLavash(double weight, double price, String produceCompany, double radius, int thickness) {
        super(weight, price, produceCompany);
        this.radius = radius;
        this.thickness = thickness;
    }

    public double getRadius (){
        return radius;
    }
    public int getThickness(){
        return thickness;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setThickness(int thickness){
        this.thickness = thickness;
    }

     void wrap(){
         System.out.println("I am wrap");
    }

    @Override
    void bake(){
        super.bake();
        System.out.println("I am lavash. I am baked");
    }
}

