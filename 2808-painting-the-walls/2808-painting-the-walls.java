import java.util.Arrays;

public class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int maxWalls = n;

        int[][] dp = new int[n + 1][maxWalls + 1];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE / 2);

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            int c = cost[i - 1];
            int t = time[i - 1];
            for (int j = 0; j <= maxWalls; j++) {
                // Don't pick this wall: carry forward
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);

                // Pick this wall: paid painter paints this wall
                int paintedWalls = Math.min(maxWalls, j + 1 + t);  // paid painter paints 1, free painter can paint t
                dp[i][paintedWalls] = Math.min(dp[i][paintedWalls], dp[i - 1][j] + c);
            }
        }

        return dp[n][maxWalls];
    }
}
