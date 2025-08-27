class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // ASCII chars
        Arrays.fill(lastIndex, -1);

        int maxLen = 0;
        int i = 0; // left pointer

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            // If character was seen, move left pointer
            if (lastIndex[c] >= i) {
                i = lastIndex[c] + 1;
            }

            // Update last index of current char
            lastIndex[c] = j;

            // Update max length
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
