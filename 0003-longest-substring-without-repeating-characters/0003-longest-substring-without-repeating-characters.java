class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        int i = 0, j = 0;

        while (j < s.length()) {
            char c = s.charAt(j);

            // If duplicate found, shrink from the left
            while (hs.contains(c)) {
                hs.remove(s.charAt(i));
                i++;
            }

            // Add current char and expand window
            hs.add(c);
            count = Math.max(count, j - i + 1);
            j++;
        }
        return count;
    }
}
