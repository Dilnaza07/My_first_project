package CodingBat.Logic_1;

public class love6 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4)); ;//→ true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true

    }
    public static boolean love6(int a, int b) {
        return(a==6||b==6||a+b==6||a-b==6||b-a==6);
    }
}
