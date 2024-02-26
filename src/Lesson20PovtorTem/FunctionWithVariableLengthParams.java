package Lesson20PovtorTem;

public class FunctionWithVariableLengthParams {
    public static void main(String[] args) {
        calculateSum(1, 2, 3); //6
        calculateSum(1, 2, 3, 4, 5); //16
        calculateSum();  //0
        calculateSum(1, 2, 5, 7, 9, 11, 13, 15, 21, 31);

    }

    static void calculateSum(int... nums) {
        int result = 0;
        for (int n : nums) result += n;
        System.out.println("The sum of " + nums.length + " numbers: " + result);

    }
}
