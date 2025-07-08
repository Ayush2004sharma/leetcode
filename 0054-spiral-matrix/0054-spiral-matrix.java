import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> s = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return s;

        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;

        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++) s.add(matrix[top][j]);
            top++;

            for (int i = top; i <= bottom; i++) s.add(matrix[i][right]);
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) s.add(matrix[bottom][j]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) s.add(matrix[i][left]);
                left++;
            }
        }
        return s;
    }
}