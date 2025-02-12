class Solution {
    public int missingNumber(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
      HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return max+1;
    }
}