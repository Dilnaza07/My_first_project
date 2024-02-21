import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //System.out.println("You wrote " + a);

        String b = sc.nextLine();
       // System.out.println("You wrote " + b);

        String summ = a+b;

        System.out.println("Summa = " + summ);



       // System.out.printf("a = %d; b = %d /n", a,b);


    }
}
