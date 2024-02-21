package CodingBat.Warmup_1;

public class NearHundredTask {

//    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//
//
//            nearHundred(93) → true
//    nearHundred(90) → true
//    nearHundred(89) → false

    public static void main(String[] args) {
        nearHundred(90);
        nearHundred(89);
        nearHundred(198);
    }

    public static boolean nearHundred(int n) {
        int num = Math.abs(n);
        if (num >= 90 && num <= 100 || num >= 190 && num <= 200) {
            System.out.println("num >=90 && num<=100 ||num >=190 && num<=200");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public boolean nearHundred2(int n) {
        int num = Math.abs(n);
        if (num >= 90 && num <= 110 || num >= 190 && num <= 210) {
            return true;
        }
        return false;

    }

}
