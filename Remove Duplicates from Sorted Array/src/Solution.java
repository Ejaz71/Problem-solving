public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,2,3,3,4,6,8,11,11,14};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if(nums[fast] == nums[slow]) fast++;
            else {
                nums[++slow] = nums[fast++];
            }
        }
        return ++slow;
    }
}
