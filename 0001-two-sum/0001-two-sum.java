class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        for (int n : nums) {
            l.add(n);
        }

        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];

            // Check in original list (not after removal)
            int j = l.lastIndexOf(k);
            if (j != -1 && j != i) {
                ans[0] = i;
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
}
