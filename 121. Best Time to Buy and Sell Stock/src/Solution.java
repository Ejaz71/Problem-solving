public class Solution {
    public static void main(String[] args) {
        int[] prices = {7,6,444,3,5,1,2,79,6, 99,7};
        System.out.println(maxProfit(prices));
    }
    static public int maxProfit(int[] prices) {
        int minSoFar = prices[0], localMax = 0, maxProfit= 0;
        for (int i =1; i<prices.length; i++) {
            if (prices[i] <= minSoFar) minSoFar = prices[i];
            else {
                localMax = prices[i] - minSoFar;
                if (localMax > maxProfit) maxProfit = localMax;
            }
        }
        return maxProfit;
    }
}
