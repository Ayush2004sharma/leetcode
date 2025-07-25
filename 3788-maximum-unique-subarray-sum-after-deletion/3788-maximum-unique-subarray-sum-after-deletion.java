class Solution {
    public int max(int nums[]){
        int a=nums[0];
        for(int i :nums){
            if(i>a){
                a=i;
            }
        }
        return a;
    }
    public int maxSum(int[] nums) {
        if(nums.length==1)return nums[0];
        int max1 = max(nums);
        if(max1<0)return max1;
        HashSet<Integer>s = new HashSet<>();

        int sum =0;
        for(int n:nums ){
            if(!s.contains(n)&&n>0){
                sum+=n;
                s.add(n);
            }
        }
        return sum;
    }
}