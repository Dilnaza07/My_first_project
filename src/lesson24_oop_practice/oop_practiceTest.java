package lesson24_oop_practice;

public class oop_practiceTest {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(5, 7);
        Ram ram = new Ram(16, "v9");
        Os os = new Os("Windows", 11);
        Cpu cpu = new Cpu("Cor i 7", 12, 8);

        Notebook notebook = new Notebook(hdd, ram, os, cpu);
        System.out.println("Notebook: ");
        System.out.println("Hdd size: " + notebook.getHdd().getSize() + ", speed: " + notebook.getHdd().getSpeed());
        System.out.println("Ram size: " + notebook.getRam().getSize() + ", model: " + notebook.getRam().getModel());
        System.out.println("Os name: " + notebook.getOs().getName() + ", version: " + notebook.getOs().getVersion());
        System.out.println("Cpu model: " + notebook.getCpu().getModel() + ", coreCount: " + notebook.getCpu().getCoreCount() + ", frequency: " + notebook.getCpu().getFrequency());
    }
}
