import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] digits = {9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int sum, carry = 1;
        int[] ans = new int[digits.length + 1];
        for (int i = digits.length - 1 ; i >= 0; i--) {
            sum = (carry + digits[i]) % 10;
            carry = (carry + digits[i]) / 10;
            ans[i+1] = sum;
            if (i == 0 && carry == 1) {
                ans[0] = 1;
                return ans;
            }
        }
        return Arrays.copyOfRange(ans, 1 , ans.length);
    }
}
