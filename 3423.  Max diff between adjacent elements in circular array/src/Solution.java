import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] a = {13,6,2,7,1,3,6,8,9,1,3,0,1};
        System.out.println(maxAdjacentDistance(a));
    }
    public static int maxAdjacentDistance(int[] nums) {
        int maxDiff = Math.abs(nums[0] - nums[nums.length-1]), diff;
        for (int i = 1; i < nums.length; i++) {
            diff = Math.abs(nums[i] - nums[i-1]);
            if (diff > maxDiff)  maxDiff = diff;
        }
        return maxDiff;
    }
}
