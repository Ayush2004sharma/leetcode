class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length;
        int sum =0;
        for(int i=1;i<=n*n;i++){
            sum+=i;
        }
        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (hm.contains(grid[i][j])) {
                    ans[0] = grid[i][j];
                } else {
                    hm.add(grid[i][j]);
                    sum-=grid[i][j];
                }
            }
        }
        ans[1]=sum;
        return ans;
    }
}