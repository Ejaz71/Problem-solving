public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,1,2,4,5,6,7,8};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) ans ^= i;
        return ans;
    }
}
