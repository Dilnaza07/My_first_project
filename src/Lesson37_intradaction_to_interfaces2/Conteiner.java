package Lesson37_intradaction_to_interfaces2;

public class Conteiner {
    PostponeableEggs postponeableEggs;
    Swimable swimable;

    public Conteiner(PostponeableEggs postponeableEggs, Swimable swimable) {
        this.postponeableEggs = postponeableEggs;
        this.swimable = swimable;
    }
}
