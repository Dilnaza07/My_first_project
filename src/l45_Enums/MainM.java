package l45_Enums;

public class MainM {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
        String value = switch(dayOfWeek) {
            case MONDAY -> "Учеба в понедельник";
            case TUESDAY -> "Учеба во вторник";
            case WEDNESDAY -> "Учеба в среду";
            case FRIDAY -> "Учеба в пятницу";
            case THURSDAY -> "В четверг я не учусь";
            case SATURDAY -> "В субботу я не учусь";
            case SUNDAY -> "В воскресенье я не учусь";
//            case SUNDAY, THURSDAY, SATURDAY -> "В " + dayOfWeek.getNameInRussian() + " я не учусь";
        };

        System.out.println(value);

        System.out.println(dayOfWeek.getNameInRussian());

        DayOfWeek.MONDAY.ordinal();
















        DayOfWeek day = DayOfWeek.MONDAY;
        switch(day) {
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println(day.getDayInRussian() + ": работаю");
                break;
            case TUESDAY:
            case THURSDAY:
                System.out.println(day.getDayInRussian() + ": учусь");
                break;
            default:
                System.out.println(day.getDayInRussian() + ": отдыхаю");
                break;
        }
    }
}
