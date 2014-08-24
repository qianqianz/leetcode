public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row*col;
        int begin = 0;
        int end = total - 1;
        while(begin <= end){
            int middle = (begin + end) / 2;
            int row_temp = middle/col;
            int col_temp = middle%col;
            if(matrix[row_temp][col_temp] == target){
                return true;
            }else if(matrix[row_temp][col_temp] < target){
                begin = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return false;
    }
}