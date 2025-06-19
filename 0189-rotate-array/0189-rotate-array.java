class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length-1;
         k=k%(n+1);
          reverse(0,n,nums);
         reverse(0,k-1,nums);
         reverse(k,n,nums);
        
         
    }
    public  void reverse(int i,int j,  int arr[]){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}