package CodingBat.Warmup_1;

public class frontBackTask_11 {
    public static void main(String[] args) {

        String m = frontBack("ann");
        System.out.println(m);
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String mid = str.substring(1, (str.length() - 1));

        char back = str.charAt(0);
        char front = str.charAt(str.length() - 1);
        return front + mid + back;

    }
}