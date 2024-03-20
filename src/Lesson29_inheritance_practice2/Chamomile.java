package Lesson29_inheritance_practice2;

public class Chamomile extends Bread{
    int petalsCount;
    Chamomile(double weight, double price, String produceCompany, int petalsCount) {
        super(weight, price, produceCompany);
        this.petalsCount = petalsCount;
    }

    public double getPetalsCount(){
        return petalsCount;
    }

    public void setPetalsCount(int petalsCount){
        this.petalsCount = petalsCount;
    }
}
