import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        
        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        
        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {
                // Overlapping intervals, merge them by updating the end time
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                // Non-overlapping interval, add it and move to next
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        
        // Convert List<int[]> to int[][]
        return merged.toArray(new int[merged.size()][]);
    }
}
