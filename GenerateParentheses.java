public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        String s = "";
        return generate(result, s, 0,0,n);
    }
    public static ArrayList<String> generate(ArrayList<String> result, String s, int left, int right, int n){
        if(left == n) {
            for(int i = right + 1; i <= n; i ++) {
                s=s+")";
            }
            result.add(s);
        }else {
            generate(result, s+"(", left+1, right, n);
            if(left > right) {
                generate(result, s+")",left,right+1,n);
            }
        }
        return result;
    }
}