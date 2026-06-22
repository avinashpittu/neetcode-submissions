class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] isVisited = new boolean[row][col];
        int res = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if((!isVisited[i][j]) && grid[i][j] == 1)
                    res = Math.max(res, dfs(grid, i, j, isVisited));
            }
        }
        
        return res;
    }

    public int dfs(int[][] grid, int row, int col, boolean[][] isVisited){

        int[] rowdir = {-1, 0, 1, 0};
        int[] coldir = {0, -1, 0, 1};
        int count = 1;
        isVisited[row][col] = true;
        for(int i=0; i<4; i++){
            int newRow = row+rowdir[i];
            int newCol = col+coldir[i];
            if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && (!isVisited[newRow][newCol]) && grid[newRow][newCol] == 1){
                count += dfs(grid, newRow, newCol, isVisited);
            }
        }
        return count;
        
    }
}
