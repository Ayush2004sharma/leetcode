class Solution {
    public long prefix(int num[]){
        long pro=1;
        for(int i =0;i<num.length;i++){
            pro*=num[i];
        }
        return pro;
    }
    public boolean checkEqualPartitions(int[] nums, long target) {
        long pro= prefix(nums);
        if(pro==target*target)return true;
        return false;
    }
}