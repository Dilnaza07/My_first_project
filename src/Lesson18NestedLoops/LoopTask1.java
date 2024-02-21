package Lesson18NestedLoops;

public class LoopTask1 {
    public static void main(String[] args) {

        int simpleNumbers = 0;
        boolean notSimple;

        for (int i = 2; i <= 1000; i++) {
            notSimple = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    notSimple = true;
                    break;
                }
            }
            if (!notSimple) {
                System.out.println("Простое число: " + i);
            }


        }
    }
}


