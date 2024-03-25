package lesson24_25_oop_practice;

public class nullPointerExceptions {
    public static void main(String[] args) {
        Example example = new Example();
       // System.out.println(example.array.length); //NullPointerException: Cannot read the array length because "example.array" is null
        //Решение этой проблемы, в создании объекта к которому пытаемся обратиться
        example.array = new int[5];
        System.out.println(example.array.length);

        int [] array;
    }
}

class Example{
    int [] array;
}
