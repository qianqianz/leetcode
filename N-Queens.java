public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> result = new ArrayList<String[]>();
        int[] loc = new int[n];
        if(n == 2||n ==3)   return result;
        putQuenes(result,n,loc,0);
        return result;
    }
    public static void putQuenes(ArrayList<String[]> result, int n, int[] loc, int level){
        if(level == n) {
            print(result,loc,n);
        }else{
            for(int i = 0; i < n; i ++) {
                loc[level] = i;
                if(isValid(loc,level)) {
                    putQuenes(result, n, loc, level + 1);
                }
            }
        }
    }
    public static boolean isValid(int[] loc, int level){
        for(int i = 0; i < level; i++) {
            if(loc[i] == loc[level] || Math.abs(i - level)==Math.abs(loc[i] - loc[level])) {
                return false;
            }
        }
        return true;
    }
    public static void print(ArrayList<String[]> result,int[] loc, int n){
        String[] list = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder l = new StringBuilder();
            for(int j = 0; j<loc.length; j++) {
                if(j == loc[i]){
                    l.append('Q');
                }else{
                    l.append('.');
                }
            }
            list[i] = l.toString();
        }
        result.add(list);
        return;
    }
}