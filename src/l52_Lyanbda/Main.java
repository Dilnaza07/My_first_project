package l52_Lyanbda;

public class Main {
    public static void main(String[] args) {
        Printable printable = (String text)-> System.out.println("Я лямбда, я печатаю текст: " + text);
        printable.print("yyy");
        printable.print("такой то текст");


    }
}
