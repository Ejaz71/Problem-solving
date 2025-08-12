import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,5,3,6,7,2};
        rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }

    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums, 0, nums.length - k -1);
        rotate(nums, nums.length - k, nums.length - 1);
        rotate(nums,0, nums.length - 1);
    }

    static void rotate(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }


}
