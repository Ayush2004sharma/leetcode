class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles); // max pile size

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, mid, h)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canEatAll(int[] piles, int k, int h) {
        long hours = 0; // Use long to prevent integer overflow
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // same as ceil(pile / k)
            if (hours > h) {
                return false;
            }
        }
        return hours <= h;
    }

    private int getMax(int[] arr) {
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}