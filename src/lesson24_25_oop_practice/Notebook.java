package lesson24_25_oop_practice;

public class Notebook {
    Hdd[] hddArray;
    Ram[] ramArray;
    Os[] osArray;
    Cpu cpu;

    char[] keyboardStickers;

    public Notebook(Hdd[] hdd, Ram[] ram, Os[] os, Cpu cpu, char[] keyboardStickers) {
        this.cpu = cpu;
        this.hddArray = hdd;
        this.osArray = os;
        this.ramArray = ram;
        this.keyboardStickers = keyboardStickers;
    }

    public Notebook(Hdd[] hdd, Ram[] ram, Os[] os, Cpu cpu) {
        this.cpu = cpu;
        this.hddArray = hdd;
        this.osArray = os;
        this.ramArray = ram;
    }

    public void setKeyboardStickers(char[] keyboardStickers) {
        this.keyboardStickers = keyboardStickers;
    }

    public char[] getKeyboardStickers() {
        return keyboardStickers;
    }

    public void setHddArray(Hdd[] m) {
        this.hddArray = m;
    }

    public void setRamArray(Ram[] m) {
        this.ramArray = m;
    }

    public void setOsArray(Os[] o) {
        this.osArray = o;
    }

    public void setCpu(Cpu c) {
        this.cpu = c;
    }

    public Ram[] getRamArray() {
        return ramArray;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Os[] getOsArray() {
        return osArray;
    }

    public Hdd[] getHddArray() {
        return hddArray;
    }



    public static void showPrint(Notebook notebook) {
        System.out.println("Notebook: ");
        System.out.println("Cpu model: " + notebook.getCpu().getModel() + ", coreCount: " + notebook.getCpu().getCoreCount() + ", frequency: " + notebook.getCpu().getFrequency());

        for (int i = 0; i < notebook.getHddArray().length; i++) {
            System.out.println("Hdd " + (i + 1) + " size: " + notebook.getHddArray()[i].getSize() + ", speed: " + notebook.getHddArray()[i].getSpeed());
        }
        for (int i = 0; i < notebook.getRamArray().length; i++) {
            System.out.println("Ram " + (i + 1) + " size: " + notebook.getRamArray()[i].getSize() + ", model: " + notebook.getRamArray()[i].getModel());
        }
        for (int i = 0; i < notebook.getOsArray().length; i++) {
            System.out.println("Os " + (i + 1) + " name: " + notebook.getOsArray()[i].getName() + ", version: " + notebook.getOsArray()[i].getVersion());
        }
    }

    public static void showPrint2(Notebook notebook) {
        System.out.println("Notebook: ");
        System.out.println("Cpu model: " + notebook.getCpu().getModel() + ", coreCount: " + notebook.getCpu().getCoreCount() + ", frequency: " + notebook.getCpu().getFrequency());

        for (int i = 0; i < notebook.getHddArray().length; i++) {
            System.out.println("Hdd " + (i + 1) + " size: " + notebook.getHddArray()[i].getSize() + ", speed: " + notebook.getHddArray()[i].getSpeed());
        }
        for (int i = 0; i < notebook.getRamArray().length; i++) {
            System.out.println("Ram " + (i + 1) + " size: " + notebook.getRamArray()[i].getSize() + ", model: " + notebook.getRamArray()[i].getModel());
        }
        for (int i = 0; i < notebook.getOsArray().length; i++) {
            System.out.println("Os " + (i + 1) + " name: " + notebook.getOsArray()[i].getName() + ", version: " + notebook.getOsArray()[i].getVersion());
        }
        System.out.println("keyboardStickers: ");
        for (int i = 0; i < notebook.keyboardStickers.length; i++) {
            System.out.print(notebook.getKeyboardStickers()[i] + " ");
        }
    }





    @Override
    public String toString() {
        String message = ("Notebook: " + getCpu().toString());

        for (int i = 0; i < getHddArray().length; i++) {
            message = message + getHddArray()[i].toString();
        }
        for (int i = 0; i < getRamArray().length; i++) {
            message = message + getRamArray()[i].toString();
        }
        for (int i = 0; i < getOsArray().length; i++) {
            message = message + getOsArray()[i].toString();
            ;
        }
        message = message + (". KeyboardStickers: ");
        for (int i = 0; i < keyboardStickers.length; i++) {
            message = message + (getKeyboardStickers()[i] + " ");
        }

        return message;
    }
}


