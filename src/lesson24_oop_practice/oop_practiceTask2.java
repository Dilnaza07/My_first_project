package lesson24_oop_practice;

public class oop_practiceTask2 {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(5, 7);
        Ram ram = new Ram(16, "v9");
        Os os = new Os("Windows", 11.0);
        Cpu cpu = new Cpu("i7", 12, 8);

        Notebook notebook = new Notebook(hdd, ram, os, cpu);

        showPrint(notebook);

        Cpu cpu2 = new Cpu("i9", 12, 8);
        Hdd hdd2 = new Hdd(7, 9);
        Os os2 = new Os("Ubuntu", 16.06);

        notebook.setCpu(cpu2);
        notebook.setHdd(hdd2);
        notebook.setOs(os2);

        System.out.println();
        System.out.println("Upgrade!");
        System.out.println();

        showPrint(notebook);
    }

    public static void showPrint(Notebook notebook) {
        System.out.println("Notebook: ");
        System.out.println("Hdd size: " + notebook.getHdd().getSize() + ", speed: " + notebook.getHdd().getSpeed());
        System.out.println("Ram size: " + notebook.getRam().getSize() + ", model: " + notebook.getRam().getModel());
        System.out.println("Os name: " + notebook.getOs().getName() + ", version: " + notebook.getOs().getVersion());
        System.out.println("Cpu model: " + notebook.getCpu().getModel() + ", coreCount: " + notebook.getCpu().getCoreCount() + ", frequency: " + notebook.getCpu().getFrequency());

    }
}