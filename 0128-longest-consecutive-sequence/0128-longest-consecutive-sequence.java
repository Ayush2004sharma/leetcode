import java.util.Iterator;
import java.util.TreeSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> hs = new TreeSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        int count = 1;   // At least one number exists
        int max = 1;

        Iterator<Integer> it = hs.iterator();
        int prev = it.next();  // Start from the first element

        while (it.hasNext()) {
            int curr = it.next();

            if (curr == prev + 1) {
                count++; // continue the streak
            } else {
                count = 1; // reset streak
            }

            max = Math.max(max, count);
            prev = curr; // move forward
        }

        return max;
    }
}
