class Solution {
    class Pair {
        int f;
        int s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean vis[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    count++;
                    bfs(i, j, grid, vis);
                }
            }
        }
        return count;
    }

    public void bfs (int row, int col, char grid[][], boolean [][]vis){
       vis[row][col]=true;
        Queue<Pair>q = new LinkedList<>();
        q.add(new  Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
     while (!q.isEmpty()) {
    int ro = q.peek().f;
    int co = q.peek().s;
    q.remove();

    for (int k = 0; k < 4; k++) {
        int nr = ro + dRow[k];
        int nc = co + dCol[k];

        if (nr >= 0 && nr < n && nc >= 0 && nc < m 
            && grid[nr][nc] == '1' && !vis[nr][nc]) {
            vis[nr][nc] = true;
            q.add(new Pair(nr, nc));
        }
    }
}

}}