class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<ArrayList<Integer>> ansi = new ArrayList<>();
        
        int min = intervals[0][0];
        int max = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= max) {
                // Overlaps → merge
                max = Math.max(max, intervals[i][1]);
            } else {
                // No overlap → push old interval and reset
                ansi.add(new ArrayList<>(Arrays.asList(min, max)));
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        
        // Add the last interval
        ansi.add(new ArrayList<>(Arrays.asList(min, max)));

        // Convert to int[][]
        int rows = ansi.size();
        int[][] arr = new int[rows][2];

        for (int i = 0; i < rows; i++) {
            arr[i][0] = ansi.get(i).get(0);
            arr[i][1] = ansi.get(i).get(1);
        }

        return arr;
    }
}
