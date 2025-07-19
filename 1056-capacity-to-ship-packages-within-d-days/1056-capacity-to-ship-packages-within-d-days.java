class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int left = max(arr);          // min capacity must be at least the heaviest box
        int right = sum(arr);         // max capacity could be total sum (all in 1 day)
        int min = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int neededDays = daysNeeded(arr, mid);

            if (neededDays <= days) {
                min = mid;
                right = mid - 1; // try smaller capacity
            } else {
                left = mid + 1;  // increase capacity
            }
        }

        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int current = 0;

        for (int weight : weights) {
            if (current + weight > capacity) {
                days++;
                current = 0;
            }
            current += weight;
        }

        return days;
    }
}
