package Lesson37_intradaction_to_interfaces2;

public class Chicken implements PostponeableEggs{
    @Override
    public void postpone() {
        System.out.println("Курица несет яйца");
    }
}
