public class calculation {
    public static void main(String[] args) {

        double b = 5;
        double c = 5;
        double d = 3;
        double a = 100 - (((b + c) * 2 * 3 - 10) / (2 * (4 + d))) * d;
        System.out.println(a);


        int number1 = 5;
        int number2 = 10;

        number1++;
        number2--;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println();

        number1 += number2;
        number2 -= number1;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println();


        number1 *= number2;
        number2 /= number1;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println();


        //  number1 %=number2;
        //  number2 %=number1;

        //  System.out.println(number1);
        //  System.out.println(number2);


        float dec = 10 / 3.f;
        float d1 = 1 / 8f;
        System.out.println(dec);
        System.out.println(d1);
        System.out.printf("%.2f \n", d1);
        System.out.printf("%f \n", dec);
        System.out.printf("%.2f \n", dec);
        System.out.printf("%.3f \n", dec);
        System.out.printf("%.4f \n", dec);
        System.out.println();


        int abc = Math.abs(-5);
        System.out.println(abc);
        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);
        double pow = Math.pow(4, 3);
        double pow1 = Math.pow(10, 8);
        System.out.println(pow);
        System.out.println(pow1);
        System.out.println();

        double cos = Math.cos(3.14);
        System.out.println(cos);
        double sin = Math.sin(3.14);
        System.out.println(sin);


    }
}
