class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []ans = new int [2];
        int n = grid.length;
        HashSet<Integer>hm = new HashSet<>();
        boolean []vis= new boolean [(n*n)+1];
        for ( int i =0;i<n;i++){
            for( int j=0;j<n;j++){
                if( !vis[grid[i][j]]){
                    vis[grid[i][j]]=true;
                }
                if(hm.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }
                else{
                    hm.add(grid[i][j]);
                }
            }
        }
        for ( int i =0;i<vis.length;i++){
            if( !vis[i]){
                ans[1]=i;
            }
        }
        return ans ;
    }
}