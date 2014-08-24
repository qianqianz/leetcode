public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 1)   return;
        int length = matrix.length;
        for(int i = 0; i < Math.ceil((double)length/2.0); i++) {
            for(int j = 0; j < length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length - 1 - j][i];
                matrix[length - 1 - j][i] = matrix[length - i - 1][length - j - 1];
                matrix[length - i - 1][length - j - 1] = matrix[j][length - 1 - i];
                matrix[j][length - 1 - i] = temp;
            }
        }
    }
}