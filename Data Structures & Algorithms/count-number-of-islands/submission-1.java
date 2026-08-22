class Solution {

    class Pair {
        int r;
        int c;

        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public void bfs(int r, int c, char[][] grid, boolean[][] vis) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(r, c));
        vis[r][c] = true;   // mark starting cell visited

        while (!q.isEmpty()) {

            Pair front = q.remove();

            int row = front.r;
            int col = front.c;

            // UP
            if (row > 0) {
                if (!vis[row - 1][col] && grid[row - 1][col] == '1') {
                    q.add(new Pair(row - 1, col));
                    vis[row - 1][col] = true;
                }
            }

            // DOWN
            if (row < n - 1) {
                if (!vis[row + 1][col] && grid[row + 1][col] == '1') {
                    q.add(new Pair(row + 1, col));
                    vis[row + 1][col] = true;
                }
            }

            // RIGHT
            if (col < m - 1) {
                if (!vis[row][col + 1] && grid[row][col + 1] == '1') {
                    q.add(new Pair(row, col + 1));
                    vis[row][col + 1] = true;
                }
            }

            // LEFT
            if (col > 0) {
                if (!vis[row][col - 1] && grid[row][col - 1] == '1') {
                    q.add(new Pair(row, col - 1));
                    vis[row][col - 1] = true;
                }
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (!vis[i][j] && grid[i][j] == '1') {

                    bfs(i, j, grid, vis);

                    count++;
                }
            }
        }

        return count;
    }
}