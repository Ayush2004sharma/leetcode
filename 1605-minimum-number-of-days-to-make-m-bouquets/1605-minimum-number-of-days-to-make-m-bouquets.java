class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) return -1;

        int left = 1, right = 0;
        for (int day : bloomDay) {
            right = Math.max(right, day);
        }

        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                right = mid - 1; // try to minimize
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int days) {
        int flowers = 0, bouquets = 0;

        for (int day : bloomDay) {
            if (day <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}
