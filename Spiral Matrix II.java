public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        int i = 0;
        int j = 0;
        int begin = 0; 
        int end = n -1;
        int up = 0;
        int down = n - 1;
        while(count<=(n*n)){
            if(count == (n*n)){
                result[i][j] = count;
                count ++;
            }else {
                while(j<end){
                    result[i][j++] = count;
                    count ++;
                }
                end --;
                while(i < down){
                    result[i++][j] = count;
                    count ++;
                }
                down --;
                while(j>begin){
                    result[i][j--] = count;
                    count ++;
                }
                begin ++;
                while(i>up){
                    result[i--][j] = count;
                    count ++;
                }
                up ++;
                i++;
                j++;
            }
        }
        return result;
    }
}