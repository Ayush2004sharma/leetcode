class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        
        int maxProfit = 0;
        int minPrice = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            int potentialProfit = prices[i] - minPrice;
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        
        return maxProfit;
    }
}