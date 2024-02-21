package CodingBat.Warmup_1;

public class Makes10Task {
    public static void main(String[] args) {
        makes10(9, 10);
        makes10(9, 9);
        makes10(1, 9);
    }


//    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//
//
//    makes10(9, 10) → true
//    makes10(9, 9) → false
//    makes10(1, 9) → true

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            System.out.println("a or b == 10");
            return true;
        } else if (a + b == 10) {
            System.out.println("a + b ==10");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }

    //  Solution:
    public boolean makes101(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }
}
