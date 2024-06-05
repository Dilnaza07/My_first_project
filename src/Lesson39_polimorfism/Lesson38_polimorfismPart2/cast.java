package Lesson39_polimorfism.Lesson38_polimorfismPart2;

public class cast {
    public static void main(String[] args) {


        Voiceable shark = new Shark();
        ((Shark) shark).swim();   //shark типа войсабле плавающее животное, чтобы получить доступ к свойствам Shark
        //нужно сделать приведение типов - cast

        Swimable shark2 = new Shark();
        Swimable turtle = new Turtle();
        ((Shark) shark2).hunting();
        ((Turtle) turtle).postponeableEggs();
        System.out.println(shark2.getClass());
        System.out.println(shark2 instanceof Shark);
        System.out.println(turtle.getClass());
    }
}