class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       int n =order.length;
        int m = friends.length;
        int ans[]=new int [m];
        int k =0;
        for( int i=0;i<n;i++){
            int left =0;
            int right= m-1;
            
            while(left<=right){
                int mid =left+(right-left)/2;
                if(friends[mid]==order[i]){
                    ans[k]=order[i];
                    k++;
                    break;
                }
                else if (friends[mid]<order[i])left=mid+1;
                else right=mid-1;
            }
        }
        return ans ;
    }
}