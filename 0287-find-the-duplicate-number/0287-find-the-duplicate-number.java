class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int n = nums[j];
            if (vis[n])return n;
                vis[n]=true;
        }

        return -1;
    }
}