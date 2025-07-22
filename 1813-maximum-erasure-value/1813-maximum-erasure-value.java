class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int left = 0, right = 0;
        int sum = 0, maxSum = 0;

        while (right < nums.length) {
            while (seen.contains(nums[right])) {
                seen.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            seen.add(nums[right]);
            sum += nums[right];
            maxSum = Math.max(maxSum, sum);
            right++;
        }

        return maxSum;
    }
}
