package practice.general;

public class RecursionPractice {


    public static void main(String[] args) {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
            };

      new RecursionPractice().maxAreaOfIsland(grid);
    }


    public int maxAreaOfIsland(int[][] grid) {

        if(grid == null || grid.length == 0) return 0;

        int maxArea = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    int area = 0;
                    int islandArea = dfs(grid, i, j, area);
                    maxArea = Math.max(maxArea, islandArea);

                }
            }
        }

        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j, int area){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0) return 0;

        grid[i][j]=0;
        area++;

        dfs(grid, i+1, j, area);
        dfs(grid, i-1, j, area);
        dfs(grid, i, j+1, area);
        dfs(grid, i, j-1, area);
        return area;

    }

}
