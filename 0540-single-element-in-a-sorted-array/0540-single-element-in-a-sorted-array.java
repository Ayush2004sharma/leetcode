class Solution {
    public int singleNonDuplicate(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--; // Ensure mid is even
            if (arr[mid] == arr[mid + 1]) left = mid + 2; // Move right
            else right = mid; // Move left
        }
        return arr[left];
    }
}
