package CodingBat.Warmup_1;

public class ParrotTroubleTask {
    public static void main(String[] args) {

        parrotTrouble(true, 6);
        parrotTrouble(true, 7);
        parrotTrouble(false, 6);
        parrotTrouble(true, 22);

    }
//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//
//    parrotTrouble(true, 6) → true
//    parrotTrouble(true, 7) → false
//    parrotTrouble(false, 6) → false

    public static boolean parrotTrouble(boolean talking, int hour) {

        if (talking && hour < 7 || talking && hour > 20) {
            System.out.println("Папугай говорит и время меньше 7 или больше 20");
            return true;
        } else {
            System.out.println("Иначе");
            return false;
        }
    }


    //Solution:
    public boolean parrotTrouble1(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
        // Need extra parenthesis around the || clause
        // since && binds more tightly than ||
        // && is like arithmetic *, || is like arithmetic +
    }


}
