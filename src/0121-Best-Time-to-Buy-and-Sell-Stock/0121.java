public class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowestBuyingPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestBuyingPrice) {
                lowestBuyingPrice = prices[i];
            } else {
                if (maxProfit < prices[i] - lowestBuyingPrice) {
                    maxProfit = prices[i] - lowestBuyingPrice;
                }
            }
        }

        return maxProfit;

    }
}