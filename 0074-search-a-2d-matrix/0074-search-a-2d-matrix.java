class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int i = 0;
        while (left <= right) {
            int row[] = matrix[i];
            int mid = left + (right - left) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (left > right) {
                left = 0;
                right = n - 1;
                i++;
            }
            if (i == m)
                break;

        }
        return false;

    }
}