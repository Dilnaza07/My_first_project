package Lesson29_inheritance_practice2;

public class Bread {
    double weight;
    double price;
    String produceCompany;

    Bread(double weight, double price, String produceCompany) {
        this.weight = weight;
        this.price = price;
        this.produceCompany = produceCompany;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduceCompany(String produceCompany) {
        this.produceCompany = produceCompany;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getProduceCompany() {
        return produceCompany;
    }

    void bake() {
        System.out.println("The bread is ready!");
    }

    void pack() {
        System.out.println("The bread is packed!");
    }


    @Override
    public String toString() {
        String message = "Bread " + "weight: " + this.weight + ", price: " + price + ", produce company: " + this.produceCompany;
        return message;
    }
}