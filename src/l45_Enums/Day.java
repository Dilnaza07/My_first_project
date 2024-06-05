package l45_Enums;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String getInRash(Day day) {
        String rusDay = null;
        switch (day) {
            case MONDAY:
                rusDay = "Понедельник";
                break;
            case WEDNESDAY:
                rusDay = "Среду";
                break;
            case FRIDAY:
                rusDay = "Пятницу";
                break;
            case THURSDAY:
                rusDay = "Четверг";
                break;
            case TUESDAY:
                rusDay = "Вторник";
                break;
            case SATURDAY:
                rusDay = "Суббота";
                break;
            case SUNDAY:
                rusDay = "Воскресенье";;
        }
        return rusDay;
    }
}
