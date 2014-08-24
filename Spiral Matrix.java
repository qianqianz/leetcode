public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)   return result;
        int row = matrix.length;
        int col = matrix[0].length;
        int x = 0, y = 0;
        while(row>0 && col >0){
            if(row == 1 && col ==1){
                result.add(matrix[x][y]);
            }else{
                for(int i = 0; i < col - 1; i ++){
                    result.add(matrix[x][y++]);
                }
                for(int i = 0; i < row - 1; i ++) {
                    result.add(matrix[x++][y]);
                }
                if(row>1){
                    for(int i = 0; i< col - 1; i ++) {
                        result.add(matrix[x][y--]);
                    }
                }else{
                    result.add(matrix[x][y]);
                }
                if(col>1){
                    for(int i = 0; i < row - 1; i ++) {
                        result.add(matrix[x--][y]);
                    }
                }else{
                    result.add(matrix[x][y]);
                }
            }
            row -= 2;
            col -= 2;
            x++;
            y++;
        }
        return result;
    }
}