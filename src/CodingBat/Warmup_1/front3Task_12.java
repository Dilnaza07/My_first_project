package CodingBat.Warmup_1;

public class front3Task_12 {
    public static void main(String[] args) {
        System.out.println(front3("werhjbj"));

    }

    public static String front3(String str) {
        String front = "";
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }
        return front + front + front;

    }

}
