public class Solution {
    public int minPathSum(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int[][] path = new int[height][width];
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(i == 0 && j  == 0) {
                    path[i][j] = grid[i][j];
                }else if(i == 0){
                    path[i][j] = path[i][j-1] + grid[i][j];
                }else if(j == 0) {
                    path[i][j] = path[i-1][j] + grid[i][j];
                }else {
                    int temp1 = path[i-1][j] + grid[i][j];
                    int temp2 = path[i][j-1] + grid[i][j];
                    path[i][j] = temp1<temp2?temp1:temp2;
                }
            }
        }
        return path[height-1][width-1];
    }
}