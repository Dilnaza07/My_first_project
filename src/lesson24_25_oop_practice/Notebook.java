package lesson24_25_oop_practice;

public class Notebook {
    Hdd[] hddArray;
    Ram [] ramArray;
    Os [] osArray;
    Cpu cpu;

    public Notebook(Hdd [] hdd, Ram [] ram, Os [] os, Cpu cpu){
        this.cpu = cpu;
        this.hddArray = hdd;
        this.osArray = os;
        this.ramArray = ram;
    }

    public void setHddArray(Hdd[] m ){
        this.hddArray = m;
    }

    public void setRamArray(Ram [] m){
        this.ramArray = m;
    }

    public void setOsArray(Os [] o){
        this.osArray = o;
    }
    public void setCpu(Cpu c){
        this.cpu = c;
    }

    public Ram[] getRamArray(){
        return ramArray;
    }

    public Cpu getCpu(){
        return cpu;
    }

    public Os[] getOsArray(){
        return osArray;
    }

    public Hdd[] getHddArray() {
        return hddArray;
    }

    public static void showPrint(Notebook notebook, Hdd[] arrayHdd, Ram[] arrayRam, Os[] arrayOs) {
        System.out.println("Notebook: ");
        System.out.println("Cpu model: " + notebook.getCpu().getModel() + ", coreCount: " + notebook.getCpu().getCoreCount() + ", frequency: " + notebook.getCpu().getFrequency());

        for (int i = 0; i < arrayHdd.length; i++) {
            System.out.println("Hdd" + (i + 1) + " size: " + notebook.getHddArray()[i].getSize() + ", speed: " + notebook.getHddArray()[i].getSpeed());
        }
        for (int i = 0; i < arrayRam.length; i++) {
            System.out.println("Ram" + (i + 1) + " size: " + notebook.getRamArray()[i].getSize() + ", model: " + notebook.getRamArray()[i].getModel());
        }
        for (int i = 0; i < arrayOs.length; i++) {
            System.out.println("Os" + (i + 1) + " name: " + notebook.getOsArray()[i].getName() + ", version: " + notebook.getOsArray()[i].getVersion());
        }
    }
}
