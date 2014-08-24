public class Solution {
    public String strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())   return null;
        if(needle.length()<1)  return haystack;
        int next = 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            boolean findFirst = false;
            while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                if(next <= i){
                    if(haystack.charAt(i + j) == needle.charAt(0)){
                        next = i+j;
                        findFirst = true;
                    }
                }
                if(j == needle.length()-1){
                    return haystack.substring(i);
                }
                j++;
                if(!findFirst){
                    next = i+j;
                }
            }
        }
        return null;
    }
}