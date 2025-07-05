class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];  // Start with first element (in case all elements are negative)
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];           // Add current number to sum
            max = Math.max(max, sum); // Update max if current sum is higher
            if (sum < 0) sum = 0;     // If sum goes negative, reset to 0
        }

        return max;
    }
}
