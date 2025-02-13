class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int area = h * (j - i);
            max = Math.max(max, area);

            // Move the pointer pointing to the smaller height
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        
        return max;
    }
}
