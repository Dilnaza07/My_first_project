package CodingBat.Array_1;

public class commonEnd {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 9};
        System.out.println(sameFirstLast(array));
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[nums.length - 1] == nums[0]) {
            return true;
        }
        return false;

    }

}
