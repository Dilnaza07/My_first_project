package CodingBat.Warmup_1;

public class Task1_SleepIn {

//        The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true

    public static void main(String[] args) {
        sleepIn(false, false);
        sleepIn(true, false);
        sleepIn(false, true);
        sleepIn(true, true);

    }
//    public boolean sleepIn(boolean weekday, boolean vacation) {
//        if (weekday == true && vacation == false) {
//            return false;
//        } else if (weekday == false && vacation == false) {
//            return true;
//      } else if (!weekday || vacation) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    // Solution:
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("return true");
            return true;

        } else {
            System.out.println("return false");
            return false;
        }

        // Solution notes: better to write "vacation" than "vacation == true"
        // though they mean exactly the same thing.
        // Likewise "!weekday" is better than "weekday == false".
        // This all can be shortened to: return (!weekday || vacation);
        // Here we just put the return-false last, or could use an if/else.
    }
}



