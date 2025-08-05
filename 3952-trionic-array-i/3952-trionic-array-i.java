class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<3||nums[0]>nums[1])return false;
        int count=0;
        int f = nums[0];
        int flag=0;
        for(int i  =1;i<nums.length;i++){
            int n =nums[i];
            if(f==n)return false;
            if(f>n&&flag==0){
                count++;
                flag=1;
            }
            else if(f<n&&flag==1){
                count++;
                flag=0;
            }
            f=n;
            
            
        }
        if(count==2)return true;
        return false;
    }
}