package l45_Enums;

import static l45_Enums.Day.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Region.Batken.name());
        System.out.println(Laptop_enums.Lenovo);

        Day day = MONDAY;

        switch (day){
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println("Учеба в " + day.getInRash(day));
                break;
            case THURSDAY:
            case TUESDAY:
            case SATURDAY:
            case SUNDAY:
                System.out.println("В " + day.getInRash(day) + " я не учусь");
        }
    }
}
