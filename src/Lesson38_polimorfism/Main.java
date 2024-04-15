package Lesson38_polimorfism;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Swimable[] oceanarium2 = {
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
        };
        for (int i = 0; i < 5; i++) {
            oceanarium2[i].voice();
            oceanarium2[i].swim();
        }

        Swimable[] oceanarium = new Swimable[15];
        int j = 0;

        for (; j < (oceanarium.length / 3); j++) {
            oceanarium[j * 3] = new Turtle();
            oceanarium[j * 3 + 1] = new Shark();
            oceanarium[j * 3 + 2] = new Duck();
        }

        j = j * 3;

        if (j < oceanarium.length) {
            oceanarium[j] = new Turtle();
            j++;
        }
        if (j < oceanarium.length) {
            oceanarium[j] = new Shark();
        }
    }
}
