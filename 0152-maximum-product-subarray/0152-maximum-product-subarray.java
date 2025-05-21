class Solution {
       public int maxProduct(int[] nums) {
        int maxSoFar = nums[0], minSoFar = nums[0], result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int tempMax = Math.max(num, Math.max(maxSoFar * num, minSoFar * num));
            minSoFar = Math.min(num, Math.min(maxSoFar * num, minSoFar * num));
            maxSoFar = tempMax;
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}
