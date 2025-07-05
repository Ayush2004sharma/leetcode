class Solution {
    public void swap(int arr[], int m , int k){
        int temp=arr[m];
        arr[m]=arr[k];
        arr[k]= temp;
    }
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==1)m++;
            else{
                swap(nums,m,h);
                h--;
            }
        }
    }
}