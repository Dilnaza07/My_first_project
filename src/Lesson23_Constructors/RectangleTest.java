package Lesson23_Constructors;

public class RectangleTest {
    public static void main(String[] args) {


        Rectangle c1 = new Rectangle(10, 12);
        Rectangle c2 = new Rectangle(5, 7);
        Rectangle c3 = new Rectangle(18, 34);

        System.out.println("Length c1: " + c1.getLength() + ". Width: " + c1.getWidth());
        System.out.println("Length c2: " + c2.getLength() + ". Width: " + c2.getWidth());
        System.out.println("Length c3: " + c3.getLength() + ". Width: " + c3.getWidth());


    }
}




