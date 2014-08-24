public class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0)   return s;
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i --) {
            if(!words[i].equals("")){
                result.append(words[i]);
                result.append(" ");
            }
        }
        return result.length() == 0 ? "" : result.substring(0, result.length() - 1);
    }
}