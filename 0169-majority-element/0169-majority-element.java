class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans=nums[0];
        int count=0;
        for(int n:nums){
            if(ans==n){
                count++;
            }
            else{
                count--;
            }
            if(count<=0)ans=n;
        }
        return ans ;
    }
}