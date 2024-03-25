package lesson24_25_oop_practice;

import static lesson24_25_oop_practice.Notebook.showPrint;

public class oop_practiceTast4_keyboard_stickers {
    public static void main(String[] args) {
        Hdd hdd1 = new Hdd(5, 7);
        Hdd hdd2 = new Hdd(7, 7);
        Ram ram = new Ram(16, "v9");
        Os os = new Os("Windows", 11);
        Cpu cpu = new Cpu("Cor i 7", 12, 8);

        Hdd[] hddArray = new Hdd[]{hdd1, hdd2};
        Ram[] ramArray = new Ram[]{ram};
        Os [] osArray = new Os[]{os};

        char [] keyboardStickers = new char[]{'а','б','в','г','д','е'};

        Notebook notebook = new Notebook(hddArray, ramArray, osArray, cpu,keyboardStickers);

       // showPrint2(notebook);
       // showPrint(null);  ошибка

        System.out.println(notebook.toString());
    }
}
