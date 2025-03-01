class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // First Pass: Merge adjacent equal numbers
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Second Pass: Move non-zero elements forward
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Fill the remaining part with zeros
        while (index < n) {
            nums[index++] = 0;
        }

        return nums;
    }
}
