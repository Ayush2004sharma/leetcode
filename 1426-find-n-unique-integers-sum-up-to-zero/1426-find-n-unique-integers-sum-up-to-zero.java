class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
        for( int i =0;i<n/2;i++){
            ans[i]=-(n/2)+i;
            ans[n-1-i]=n/2-i;
        }
        return ans;
    }
}