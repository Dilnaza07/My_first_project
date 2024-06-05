package Lesson33_static;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        Counter.increment();
        Counter.increment();
        Counter.increment();
        System.out.println(counter1.factorial());

        Counter.increment();
        Counter.increment();
        Counter.increment();
        Counter.increment();
        Counter.increment();
        System.out.println(counter2.factorial());
    }
}
