package Lesson37_intradaction_to_interfaces2;

public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();

        turtle.swim();
        turtle.wearable();
        turtle.postpone();

        Swimable turtle1 = new Turtle();
        turtle1.swim();

        Turtleable turtle2 = new Turtle();
        turtle2.postpone();
        turtle2.wearable();
        turtle.swim();

        System.out.println();
        Chicken chicken = new Chicken();
        Conteiner conteiner = new Conteiner(chicken, turtle);
    }
}
