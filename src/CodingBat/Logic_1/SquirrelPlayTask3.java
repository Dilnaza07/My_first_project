package CodingBat.Logic_1;

public class SquirrelPlayTask3 {
    //The squirrels in Palo Alto spend most of the day playing.
    // In particular, they play if the temperature is between 60 and 90 (inclusive).
    // Unless it is summer, then the upper limit is 100 instead of 90.
    // Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
    //
    //squirrelPlay(70, false) → true
    //squirrelPlay(95, false) → false
    //squirrelPlay(95, true) → true

    //Белки играют в игру
    //входные данные int temp и boolean isSummer
    //if temp >=60 or <=90 = true
    // if isSummer temp<= 100 = true
    //return true if the squirrels play


    public static void main(String[] args) {

        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(50, true));

    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && isSummer && temp <= 100) {
            return true;
        } else return temp <= 90 && temp >= 60;


    }
}
