class Solution {
    public int maxSubArray(int[] nums) {
        int ans =Integer.MIN_VALUE;
        int pro=0;
        for( int i =0;i<nums.length;i++){
            pro=pro+nums[i];
            ans=Math.max(ans, pro);
            if( pro<0)pro=0;
        }
        return ans;
    }
}