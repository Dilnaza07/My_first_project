package Lesson20PovtorTem;

public class sumOfSquares {
    public static void main(String[] args) {

        calculateSum(1, 2, 3); //10
        calculateSum(1, 2, 3, 4, 5); //35
        calculateSum();  //0
        calculateSum(1, 2, 5, 7, 9, 11, 13, 15, 21, 31);

    }

    public static void calculateSum(int... nums) {
        int result = 0;
        for (int n : nums) {
            if ((n * n) % 2 == 0) {
                continue;
            } else {
                result += n * n;
            }
        }
        System.out.println("the sum of the squares of all numbers except odd squares: " + result);

    }

}

