package L51_Generics;


import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        NewGenerics<Integer> generics = new NewGenerics(36);

        Integer[] array1 = new Integer[]{1, 2, 3, 4};
        String[] array2 = new String[]{"1,2,3,4", "a", "37"};
        Cat[] cats = new Cat[]{new Cat("Myrka"), new Cat("Lona")};
        var element1 = printArr(array1);
        var element2 = printArr(array2);
        var element3 = printArr(cats);

        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);

        String a = "aef";
        String b = "waf";

        if (a.compareTo(b) > 0) {
            System.out.println("Максимальное значение " + a);
        } else if (a.compareTo(b) < 0) {
            System.out.println("Минимальное значение " + a);
        } else {
            System.out.println("Значения равны");
        }


        Integer[] numbers = new Integer[]{1,2,3,45,67,8,32,4};

        Integer greatest = findGreatest(numbers);

        if (greatest == null) {
            System.out.println("Ваш массив пустой ");
        } else {
            System.out.println(greatest);
        }

    }


    public static <T> T printArr(T[] arr) {
        if (arr.length % 2 == 0) {
            return arr[0];
        } else {
            return arr[arr.length - 1];
        }
    }


    public static <T extends Comparable<T>> T findGreatest(T[] arr) {
        if (arr.length == 0) return null;
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}

