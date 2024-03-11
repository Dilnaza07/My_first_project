package lesson24_oop_practice;

public class Notebook {
    Hdd hdd;
    Ram ram;
    Os os;
    Cpu cpu;

    public Notebook(Hdd hdd, Ram ram, Os os, Cpu cpu){
        this.cpu = cpu;
        this.hdd = hdd;
        this.os = os;
        this.ram = ram;
    }

    public void setHdd(Hdd a){
        this.hdd = a;
    }

    public void setRam(Ram m){
        this.ram = m;
    }

    public void setOs(Os o){
        this.os = o;
    }
    public void setCpu(Cpu c){
        this.cpu = c;
    }

    public Ram getRam(){
        return ram;
    }

    public Cpu getCpu(){
        return cpu;
    }

    public Os getOs(){
        return os;
    }

    public Hdd getHdd() {
        return hdd;
    }
}
