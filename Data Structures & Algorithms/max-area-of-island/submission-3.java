class Solution {
     private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};

    public int maxAreaOfIsland(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;

         boolean[][] isVisited = new boolean[rows][cols];

        for(int r=0;r<rows;r++){
            for(int c=0; c<cols;c++){
                if(grid[r][c] == 1){
                    
                    maxArea = Math.max(dfs(grid,r,c, isVisited), maxArea);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int nr, int nc, boolean[][] isVisited){
        
        isVisited[nr][nc] = true;
        int res=1;

        for(int[] dir : directions){
            int newr = nr +dir[0];
            int newc = nc + dir[1];

            if(newr >=0 && newc >=0 && newr < grid.length && newc < grid[0].length && grid[newr][newc] == 1 && !isVisited[newr][newc]){
                res+= dfs(grid, newr,newc, isVisited);
            }
        }
        return res;
    }
}
