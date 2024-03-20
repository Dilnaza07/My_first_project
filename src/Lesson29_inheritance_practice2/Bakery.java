package Lesson29_inheritance_practice2;

public class Bakery {
    public static void main(String[] args) {
        Bread bread = new Bread(2, 0.5, "USSR");
        bread.bake();
        bread.pack();
        System.out.println(bread);
        System.out.println();

        TandoorTortilla tandoorTortilla = new TandoorTortilla(1,2,"UZB",2);
        tandoorTortilla.drawPrints();
        tandoorTortilla.bake();
        tandoorTortilla.varnish();
        tandoorTortilla.pack();
        System.out.println();

        ArmenianLavash armenianLavash = new ArmenianLavash(1,3,"Armenia",4,1);
        armenianLavash.wrap();
        armenianLavash.bake();

        FrenchBaguette frenchBaguette = new FrenchBaguette(1,4,"French",7,5);
        frenchBaguette.pack();
    }

}
