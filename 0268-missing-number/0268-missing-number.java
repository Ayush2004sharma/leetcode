class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int  i =0;
        for(int n :nums){
            if(n!=i)break;
            i++;
        }
        return i ;
    }
}