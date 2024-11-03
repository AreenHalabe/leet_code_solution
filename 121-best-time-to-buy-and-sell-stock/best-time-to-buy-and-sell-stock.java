class Solution {
    public int maxProfit(int[] prices) {
          if (prices == null || prices.length == 0) {
            return 0;
        }

        int BuyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < BuyPrice) {
                BuyPrice = prices[i];
            } else {
                int profit = prices[i] - BuyPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;

        
    }
}