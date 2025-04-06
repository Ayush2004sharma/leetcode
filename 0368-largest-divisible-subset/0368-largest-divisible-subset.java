import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        int n = nums.length;

        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        int maxLen = 1, maxIdx = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIdx = i;
            }
        }

        while (maxIdx != -1) {
            result.add(nums[maxIdx]);
            maxIdx = parent[maxIdx];
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<Integer> result = solution.largestDivisibleSubset(nums);
        System.out.println(result);
    }
}
