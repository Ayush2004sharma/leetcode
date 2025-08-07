class Solution {
    public int maxProfit(int[] prices) {
        int ans =0;
        int small=prices[0];
        for(int i =0;i<prices.length;i++){
            if(small>prices[i]){
                small=prices[i];
            }
            else{
                int diff=prices[i]-small;
                ans=Math.max(diff,ans);
            }
        
        }
        return ans;
    }
}