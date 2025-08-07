class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int ans=0;
        for(int i =1;i<prices.length;i++){
           if(prices[i]>buy) {int diff=prices[i]-buy;
            ans=Math.max(diff,ans);
            }
            else{
                buy=prices[i];
            }
        }
        return ans;
    }
}