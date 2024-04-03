package Lesson35_final;

public class ArrayTask {
    public static void main(String[] args) {
        final int[] array = new int[]{1,7,4,6,3,2,5,7,8,45};

        for (int i = 0; i < array.length; i++) {
            array[i]= i + 1;
            System.out.println(array[i]);
        }

        array[1]=2345;

        // array = new int[]{1,2,3,4,5,64,3,2,2,5};
    }
}
