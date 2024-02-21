package Lesson16Arrays;

import java.util.Random;

public class ArrayTask2 {
    //Перебор элементов
    //Задача, Подсчёт нужных элементов:
    //Создать массив длиной в 20, записать в массив случайные значения роста от (170 до 220).
    // Сколько из них имеет рост больше 180 см, но меньше 190 см?
    // Подсчитать, вывести эти значения и вывести их (баскетболистов чей рост больше 180, но меньше 190) средний рост.
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] array = new int[size];

        int count = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (190 < array[i] && array[i] < 190) {
                count++;
                sum += array[i];
            }
        }
        System.out.println((float) sum / count);


    }
}
