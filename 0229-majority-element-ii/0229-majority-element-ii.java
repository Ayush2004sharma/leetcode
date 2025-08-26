class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer>l = new ArrayList<>();
        int m =1+nums.length/3;
        int count=0;
        int a=nums[0];
        for(int n:nums){
            if(a==n){
                count++;
            }      
            else if(a!=n){
                count=1;
                a=n;
            }      
            if(count>=m){
                l.add(n);
            }
        }
        HashSet<Integer> set = new HashSet<>(l);
      l = new ArrayList<>(set);
        
        return l;
    }
}