public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int[] char_table = new int[256];
        int i = 0;
        int max = 0;
        int last = 0;
        Arrays.fill(char_table, -1);
        while(i < length) {
            char c = s.charAt(i);
            int loc = c;
            if(char_table[loc] >= last) {
                last = char_table[loc] +1;
            }
            max = Math.max(i - last + 1, max);
            char_table[loc] = i;
            i++;
        }
        return max;
    }
        
}