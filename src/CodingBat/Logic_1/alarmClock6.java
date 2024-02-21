package CodingBat.Logic_1;

public class alarmClock6 {

    //    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
//    return a string of the form "7:00"
//    indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
//    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
//
//    alarmClock(1, false) → "7:00"
//    alarmClock(5, false) → "7:00"
//    alarmClock(0, false) → "10:00"
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
        System.out.println(alarmClock(3, true));
        System.out.println(alarmClock(0, true));

    }

    public static String alarmClock1(int day, boolean vacation) {
        String alarm = "nul";
        if (!vacation) {
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    alarm = "7:00";
                    break;
                case 6:
                case 0:
                    alarm = "10:00";
                    break;

            }
        } else {
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    alarm = "10:00";
                    break;
                case 6:
                case 0:
                    alarm = "off";
                    break;
            }
        }
        return alarm;
    }
////simple code
    public static String alarmClock(int day, boolean vacation) {
        String alarm = "nul";
        if (!vacation) {
            alarm = switch (day) {
                case 1, 2, 3, 4, 5 -> "7:00";
                case 6, 0 -> "10:00";
                default -> alarm;
            };
        } else  {
            alarm = switch (day) {
                case 1, 2, 3, 4, 5 -> "10:00";
                case 6, 0 -> "off";
                default -> alarm;
            };
        }
        return alarm;
    }
}
