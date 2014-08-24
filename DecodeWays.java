public class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() < 1 || s.charAt(0) == '0') return 0;
        int length = s.length();
        int[] ways = new int[length + 1];
        ways[0] = 1;
        ways[1] = 1;
        for(int i = 1; i < length; i++) {
            if(s.charAt(i) == '0') {
                if(s.charAt(i-1) == '0' || s.charAt(i-1) > '2') {
                    ways[i + 1] = 0;
                }else {
                    if(s.charAt(i-1) == '1' || s.charAt(i-1) == '2') {
                        ways[i+1] = ways[i-1];
                    }else {
                        ways[i+1] = ways[i];
                    }
                }
            }else if(s.charAt(i-1) == '1' || (s.charAt(i-1) == '2' && s.charAt(i) <='6')){
                ways[i+1] = ways[i] + ways[i-1];
            }else{
                ways[i+1] = ways[i];
            }
        }
        return ways[length];
    }
}