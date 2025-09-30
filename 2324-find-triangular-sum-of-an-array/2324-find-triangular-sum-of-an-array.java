class Solution {
    public int triangularSum(int[] nums) {
        // Process the array layer by layer, reducing size by 1 each iteration
        // Start from the last index and work towards the beginning
        for (int currentLength = nums.length - 1; currentLength > 0; currentLength--) {
            // For each position in the current layer, calculate the sum of adjacent elements
            for (int index = 0; index < currentLength; index++) {
       
                nums[index] = (nums[index] + nums[index + 1]) % 10;
            }
        }
      
        // After all iterations, the first element contains the final triangular sum
        return nums[0];
    }
}