package lesson24_25_oop_practice;

import static lesson24_25_oop_practice.Notebook.showPrint;

public class oop_practiceTask2 {
    public static void main(String[] args) {
        Hdd hdd1 = new Hdd(5, 7);
        Ram ram = new Ram(16, "v9");
        Os os = new Os("Windows", 11.0);
        Cpu cpu = new Cpu("i7", 12, 8);

        Hdd[] hddArray = new Hdd[]{hdd1};
        Ram[] ramArray = new Ram[]{ram};
        Os[] osArray = new Os[]{os};

        Notebook notebook = new Notebook(hddArray, ramArray, osArray, cpu);

        showPrint(notebook, hddArray, ramArray, osArray);

        //заменяем комплектующие ноутбука

        Cpu cpu2 = new Cpu("i9", 12, 8);
        Hdd hdd2 = new Hdd(7, 9);
        Os os2 = new Os("Ubuntu", 16.06);


        Hdd[] hddArray2 = new Hdd[]{hdd2};
        Os[] osArray2 = new Os[]{os2};
        notebook.setCpu(cpu2);
        //замена первого элемента в массиве через создание нового массива с новыми значениями
        notebook.setHddArray(hddArray2);
        notebook.setOsArray(osArray2);

        //второй способ, замена элемента массива в самом этом массиве без создания нового,
        // обращение через геттер к переменной в ячейке памяти под 0 индексом в массиве и замена его
        notebook.getOsArray()[0]=os2;

        System.out.println();
        System.out.println("Upgrade!");
        System.out.println();

        showPrint(notebook, hddArray, ramArray, osArray);
    }
}