class Solution {
    public int findDuplicate(int[] nums) {
           HashMap<Integer, Integer> freqMap = new HashMap<>();
        boolean hasDuplicate = false;
int ans=0;
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) > 1) {
               ans = num;
            }
        }
        return ans;
    }
}