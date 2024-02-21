package Conditions;

public class Conditions {
    public static void main(String[] args){
        boolean isEquals = 5 == 3;
        boolean isMore = 5 > 6;
        boolean isLess = 5 < 6;
        boolean isLessOrEqual = 5 <= 2;
        boolean isMoreOrEquals = 5 >= 2;
        boolean isNotEquals = 7 != 8;

        System.out.println("5 is less than 6 is? "  + isLess);
        System.out.println(isEquals + " " + isMore + " " + isLessOrEqual);
        System.out.println(isMoreOrEquals + " " + isNotEquals);
    }
}
