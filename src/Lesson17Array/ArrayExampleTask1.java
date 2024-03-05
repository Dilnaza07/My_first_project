package Lesson17Array;

public class ArrayExampleTask1 {
    public static void main(String[] args) {
        //Найти элемент равный Х:

        int size = 10;

        int [] array = new int [size];
        int number = 2;

        int i = 0;

//        while (array[i]!=number){  //цикл бесконечный, значение в ячейках массива не заданы, ошибка
//            System.out.println(array[i]);
//            i++;
//        }
//        System.out.println("Array{" + i + "{ = " + number);

        while(i<size && array[i]!=number){
            i++;
        }if (i<size)
            System.out.println("Array{" + i + "{ = " + number);
            else
            System.out.println("Не нашли!"); //потому что не заданы значения массива


        //Поиск в массиве
        //Вариант с досрочным выходом

        int nX = -1;

        for( ; i < size; i++){
            if(array[i]==number){
                nX = i;
                break;
            }
        }
        if (nX >=0)
            System.out.println("Array{" + i + "{ = " + number);
        else
            System.out.println("Не нашли!");


    }
}
