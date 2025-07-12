import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,6,7,4,1,3,2,7,8,9,10,2,6,22,62,46,85,63,43,12,16,53,81,56};
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int j;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                j = map.get(target - nums[i]);
                return new int[] {i,j};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
