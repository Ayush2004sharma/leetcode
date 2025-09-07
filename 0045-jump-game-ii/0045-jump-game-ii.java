class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if( n==1)return 0;
        int jumps = 0;
        int currend = 0;
        int furthest = 0;

        for (int i = 0; i < nums.length-1; i++) {
            furthest = Math.max(nums[i] + i, furthest);
            if (i == currend) {
                jumps++;
                currend = furthest;
            }
          
        }
        return jumps;

    }
}
