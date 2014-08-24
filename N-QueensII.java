public class Solution {
    static int result = 0;
    public int totalNQueens(int n) {
        int[] loc = new int[n];
        int result = calLocations(0, n,loc,0);
        return result;
    }
    public static int calLocations(int result, int n, int[] loc, int level){
        if(level == n) {
            result ++;
            return result;
        }else{
            for(int i = 0; i < n; i ++) {
                loc[level] = i;
                if(isValid(loc,level)) {
                    result = calLocations(result, n, loc, level + 1);
                }
            }
        }
        return result;
    }
    public static boolean isValid(int[] loc, int level){
        for(int i = 0; i < level; i++) {
            if(loc[i] == loc[level] || Math.abs(i - level)==Math.abs(loc[i] - loc[level])) {
                return false;
            }
        }
        return true;
    }
}