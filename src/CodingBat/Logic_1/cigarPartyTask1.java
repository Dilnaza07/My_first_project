package CodingBat.Logic_1;

public class cigarPartyTask1 {
    public static void main(String[] args) {
        //When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
        //
        //cigarParty(30, false) → false
        //cigarParty(50, false) → true
        //cigarParty(70, true) → true

        boolean isSigarPartySuccessful = cigarParty(100, true);
        boolean isSigarPartySuccessful2 = cigarParty2(100, true);
        boolean isSigarPartySuccessful3 = cigarParty3(100, true);
        System.out.println(isSigarPartySuccessful);
        System.out.println(isSigarPartySuccessful2);
        System.out.println(isSigarPartySuccessful3);


    }

    //MySolution
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && (cigars <= 60 || isWeekend)) {
            System.out.println(" the party is successful");
            return true;
        }
        System.out.println(" the party with the given values is not successful");
        return false;
    }

    //Solution1
    public static boolean cigarParty2(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40);
            // A longer way to write the above line:
            // if (cigars >= 40) {
            //   return true;
            // } else {
            //   return false;
            // }
        } else {
            return (cigars >= 40 && cigars <= 60);
        }
    }

    //Solution2
    public static boolean cigarParty3(int cigars, boolean isWeekend) {
        if (isWeekend) return (cigars >= 40);
        return (cigars >= 40 && cigars <= 60);

    }
}
