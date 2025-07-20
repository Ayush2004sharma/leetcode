class Solution {
    public boolean search(int arr[], int k){
        int left =0;
        int right =arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==k){
                return true;
            }
            else if (arr[mid]>k){
                right=mid-1;
            }
            else left=mid+1;
        }
        return false;
    }
    public int findKthPositive(int[] arr, int k) {
        int min = Integer.MIN_VALUE;
        int j=1;
        while(k!=0){
            if(!search(arr,j)){
                k--;
                min=j;
            }
            j++;
        }

        return min;
    }
}