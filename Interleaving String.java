public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if((s1.length() + s2.length() )!= s3.length())  return false;
        boolean[][] result = new boolean[s1.length() + 1][s2.length() + 1];
        
        for(int i = 0; i < s1.length() + 1; i++) {
            for(int j = 0; j < s2.length() + 1; j++) {
                if(i == 0 && j == 0){
                    result[0][0]=true;
                }else{
                    if(i == 0){
                        if(s2.charAt(j-1) == s3.charAt(j-1) && result[i][j-1]==true){
                            result[i][j] = true;
                        }else{
                            result[i][j] = false;
                        }
                    }else if(j == 0){
                        if(s1.charAt(i-1) == s3.charAt(i-1) && result[i-1][j]==true){
                            result[i][j] = true;
                        }else{
                            result[i][j] = false;
                        }
                    }else{
                        if((result[i-1][j] == true && s1.charAt(i-1) == s3.charAt(i + j -1)) || (result[i][j-1] == true && s2.charAt(j-1) == s3.charAt(i + j -1))){
                            result[i][j] = true;
                        }else{
                            result[i][j] = false;
                        }
                    }
                }
            }
        }
        return result[s1.length()][s2.length()];    
    }
}