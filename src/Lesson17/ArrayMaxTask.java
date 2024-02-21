package Lesson17;

public class ArrayMaxTask {
    public static void main(String[] args) {
        //Максимальный элемент
        int[] array = new int[10];
        int Max = array[0], nMax = 0;

        for (int i = 1; i < 10; i++) {
            if (array[i] > Max) {
                Max = array[i];
                nMax = i;
            }
        }
        System.out.println("A{" + nMax + "} = " + Max);
    }
}
