class Solution {
    public boolean canJump(int[] nums) {
        int n =nums.length;
        int jumps=0;
        for( int i =0;i<nums.length;i++){
           if(jumps<i)return false;
           jumps=Math.max(nums[i]+i,jumps);
           if(jumps>=n)return true;
        }
        return true;
    }
}