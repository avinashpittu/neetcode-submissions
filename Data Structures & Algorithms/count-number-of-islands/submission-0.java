class Solution {
    public int numIslands(char[][] grid) {

    if (grid == null || grid.length == 0) return 0;
        
        // Round 1 Syntax: A primitive integer counter
        int numIslands = 0;

  
     
     int rows = grid.length;
     int cols = grid[0].length;

     for(int r=0;r<rows;r++){
        for(int c=0;c<cols;c++){
            if(grid[r][c]=='1'){
                numIslands +=1;
                dfs(grid, r, c);
            }
        }
     }

     return numIslands;
         
    }

    public void dfs(char[][] grid, int r,int c){

           int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        grid[r][c] = '0';

        for(int[] dir : directions){
            int newRow = r + dir[0];
            int newCol = c + dir[1];
            if(newRow <0 || newCol < 0 || newRow> grid.length-1 || newCol > grid[0].length-1 || grid[newRow][newCol] == '0'){
                continue;
            }
            dfs(grid, newRow, newCol);
        }


    }
}
