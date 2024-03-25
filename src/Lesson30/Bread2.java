package Lesson30;

import Lesson29_inheritance_practice2.Bread;

public class Bread2 extends Bread {
    int wight;
    double price;

    public Bread2(int wight, double price, String produceCompany) {
        super(wight, price, produceCompany);
        this.wight = wight;
        this.price = price;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "wight=" + wight +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}
