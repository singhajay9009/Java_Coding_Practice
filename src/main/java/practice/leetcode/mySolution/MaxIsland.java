package practice.leetcode.mySolution;

public class MaxIsland{    
public int numIslands(char[][] grid) {
     if(grid == null || grid.length==0){
         return 0;
     }
     int numIsland = 0;   
        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    numIsland += dfsIsland(grid, i, j);
                }
            }
        }
        return numIsland;
    }
    
    public int dfsIsland(char[][] grid, int i, int j){
        
        if(i<0 || i >= grid.length || j >= grid[i].length ||  j < 0 || grid[i][j] == '0'){
            return 0;
        }
        
        grid[i][j] = '0';
        
	// we are checking if every neighbour of current grid element 
        // is already covered

        dfsIsland(grid, i+1, j);
        dfsIsland(grid, i-1, j);
        dfsIsland(grid, i, j-1);
        dfsIsland(grid, i, j+1);
        return 1;
    }
}