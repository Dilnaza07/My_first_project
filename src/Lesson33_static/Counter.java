package Lesson33_static;

public class Counter {
    private static int numOfCalls;

    public static void increment() {
        numOfCalls++;
    }

    public String factorial() {
        int factorial = 1;
        for (int i = 1; i <=numOfCalls; i++) {
            factorial *= i;
        }
        return "Факториал числа " + numOfCalls + "! = " + factorial;
    }


    @Override
    public String toString() {

        return "Факториал числа " + numOfCalls + "! = " + factorial();
    }
}
