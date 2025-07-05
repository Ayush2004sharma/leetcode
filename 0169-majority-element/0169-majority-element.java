class Solution {
    public int majorityElement(int[] nums) {
        int k = nums.length/2;
        int count=1;
        int el=nums[0];
       for(int i =1;i<nums.length;i++){
        if(el==nums[i]){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            el=nums[i];
            count++;
        }
       }
       return el;
         
    }
}