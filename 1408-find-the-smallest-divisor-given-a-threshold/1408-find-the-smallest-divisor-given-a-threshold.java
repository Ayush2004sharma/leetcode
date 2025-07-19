class Solution {

    public int smallestDivisor(int[] nums, int threshold) {
     int left =1;
     int right =max(nums);  
     int min =right;
     while(left<=right){
        int mid = left+(right-left)/2;
       int sum=check(nums,mid);
       if(sum<=threshold){
        if(min>=mid){
            min = mid;
        }
        right=mid-1;
       }
       else {
        left=mid+1;
       }
       
     }
     return min;
    }
    public int max(int nums[]){
        int max=nums[0];
        for(int n :nums){
            if(max<n){
                max=n;
            }
        }
        return max;
    }
public int check(int nums[], int k){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
        sum += (nums[i] + k - 1) / k; // this is equivalent to ceil(nums[i] / k)
    }
    return sum;
}

}