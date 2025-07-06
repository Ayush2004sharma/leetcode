class Solution {
    public int maxProfit(int[] prices) {
     int min=prices[0];
     int profit=0;
     for(int i =1;i<prices.length;i++){
      
      int  p= prices[i]-min;
        profit=Math.max(p,profit);
          if(min>prices[i]){
            min=prices[i];
        }
     }   
     return profit;
    }
}