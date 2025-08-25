class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] ans = new int[m * n];

        int r = 0, c = 0, d = 1; // d = 1: up-right, d = -1: down-left
        int i = 0;

        while (i < m * n) {
            ans[i++] = mat[r][c];

            if (d == 1) { // moving up-right
                if (c == n - 1) {        // hit right border
                    r++; d = -1;
                } else if (r == 0) {     // hit top border
                    c++; d = -1;
                } else {                 // normal move
                    r--; c++;
                }
            } else { // d == -1, moving down-left
                if (r == m - 1) {        // hit bottom border
                    c++; d = 1;
                } else if (c == 0) {     // hit left border
                    r++; d = 1;
                } else {                 // normal move
                    r++; c--;
                }
            }
        }

        return ans;
    }
}
