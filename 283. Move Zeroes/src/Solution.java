import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,0,0,10,1,1,1,1,2,3,};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        int a = 1, b = 2;
        swap(new int[]{a,b});
        System.out.println(a + " " + b);
    }

    public static void moveZeroes(int[] nums) {
        int slow = 0, fast = 0, temp, n = nums.length;
        while (slow < n && fast < n) {
            if(nums[fast]!=0) {
                temp = nums[slow];
                nums[slow++] = nums[fast];
                nums[fast] = temp;
            }
            fast++;
        }
    }

    static void swap (int[] a) {
        int temp;
        temp = a[0];
        a[0] = a[1];
        a[1] = temp;
        System.out.println(a[0] + " haha " + a[1]);
    }
}


