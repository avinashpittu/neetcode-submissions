

class Solution {
    int INF = 2147483647;  // Defining INF value as a large integer

    public void islandsAndTreasure(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == INF) {
                    boolean[][] isVisited = new boolean[row][col];  // Reset isVisited for each BFS
                    grid[i][j] = bfs(grid, i, j, isVisited);
                }
            }
        }
    }

    public int bfs(int[][] grid, int row, int col, boolean[][] isVisited) {
        int[] rowdir = {-1, 0, 1, 0};
        int[] coldir = {0, -1, 0, 1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});
        isVisited[row][col] = true;
        int distance = 0;

        while (!q.isEmpty()) {
            int size = q.size();  // Level size, to handle the distance level
            distance++;  // Increment distance at each level
            for (int s = 0; s < size; s++) {
                int[] pos = q.poll();
                int currentRow = pos[0];
                int currentCol = pos[1];

                for (int i = 0; i < 4; i++) {
                    int newRow = currentRow + rowdir[i];
                    int newCol = currentCol + coldir[i];

                    if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length 
                        && !isVisited[newRow][newCol] && grid[newRow][newCol] != -1) {
                        
                        if (grid[newRow][newCol] == 0) {
                            return distance;  // Return distance as soon as treasure is found
                        }

                        isVisited[newRow][newCol] = true;
                        q.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }

        return INF;  // If no treasure is found, return INF (unlikely since we assume there is at least one treasure)
    }
}
