public class Solution {
    public static void main(String[] args) {
        int[] arr = {5, 1,2,3,8,9,6,8,6,2,5,6,7,8};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int minSoFar = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > minSoFar)  maxProfit += prices[i] - minSoFar;
            minSoFar = prices[i];
        }
        return maxProfit;
    }
}
