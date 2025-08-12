import java.util.HashSet;
import java.util.Set;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,6,7,8,9};
        System.out.println(containsDuplicate(nums));
    }
}
