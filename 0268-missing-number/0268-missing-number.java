class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>h= new HashSet<>();
        for(int i :nums){
            h.add(i);
        }
        int ans=0;
        int temp =0;
        int n = nums.length;
        for(int i=0;i<=n;i++){
            if(!h.contains(i)){
                ans= temp;
                break;
            }
            temp++;
        }
        return ans ;
    }
}