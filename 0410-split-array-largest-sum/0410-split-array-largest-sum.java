class Solution {
    public int splitArray(int[] nums, int k) {
        int l = max(nums); // min possible largest sum
        int r = sum(nums); // max possible largest sum
        int minLargestSum = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canSplit(nums, k, mid)) {
                // Try for smaller max sum
                minLargestSum = mid;
                r = mid - 1;
            } else {
                // Need bigger max sum to split into ≤ k parts
                l = mid + 1;
            }
        }

        return minLargestSum;
    }

    // Can we split into ≤ k subarrays with max sum ≤ limit?
    public boolean canSplit(int[] nums, int k, int limit) {
        int count = 1; // At least one subarray
        int currSum = 0;

        for (int num : nums) {
            if (currSum + num > limit) {
                count++;
                currSum = num;
                if (count > k) return false;
            } else {
                currSum += num;
            }
        }

        return true;
    }

    public int max(int[] nums) {
        int m = nums[0];
        for (int i : nums) {
            if (i > m) m = i;
        }
        return m;
    }

    public int sum(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        return total;
    }
}
