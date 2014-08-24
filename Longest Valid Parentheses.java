public class Solution {
    public int longestValidParentheses(String s) {
        int[] result = new int[s.length()];    
        Arrays.fill(result, 0);
        int max = 0;
        for(int i = s.length() - 2; i >= 0; i--) {
            if(s.charAt(i) == '(') {
                int loc = i + 1 + result[i+1];
                if(loc < s.length() && s.charAt(loc) == ')') {
                    result[i] = result[i+1] + 2;
                    if(loc + 1 < s.length()) {
                        result[i] += result[loc+1];
                    }
                }
                max = Math.max(max, result[i]);
            }
        }
        return max;
    }
}