class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0)return false;
        HashMap<Integer,Integer>s = new HashMap<>();
         for (int num : nums) {
            s.put(num, s.getOrDefault(num, 0) + 1);
        }
        for (int freq : s.values()) {
            if (freq % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}