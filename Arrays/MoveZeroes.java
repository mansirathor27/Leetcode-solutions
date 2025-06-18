package Arrays;
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                lastNonZeroFoundAt++;
            }
        }
        // for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
        //     nums[i] = 0;
        // }
    }
}