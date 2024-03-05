package CodingBat.Array_1;

public class firstLast6 {
    public static void main(String[] args) {
      //  firstLast6([1,2,3])
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;}
}
