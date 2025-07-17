class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };

        // First Occurrence
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                right = mid - 1; // keep looking left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Reset bounds for second binary search
        left = 0;
        right = nums.length - 1;

        // Last Occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                left = mid + 1; // keep looking right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
