public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,6};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int slow = 0, fast = 1, n = nums.length, temp;

        if (n == 1) return 1;

        while (fast < n) {
            if(nums[slow] == nums[fast]) fast++;
            else {
                nums[++slow] = nums[fast];
            }
        }

        return ++slow;
    }
}
