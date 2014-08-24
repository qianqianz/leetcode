public class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        for(int i = 0; i < len; i ++) {
            char c = s.charAt(i);
            switch(c) {
                case 'I': sum += 1;
                          break;
                case 'V': sum += 5;
                          break;
                case 'X': sum += 10;
                          break;
                case 'L': sum += 50;
                          break;
                case 'C': sum += 100;
                          break;
                case 'D': sum += 500;
                          break;
                case 'M': sum += 1000;
                          break;
            }
            if(i>0) {
                if(s.substring(i-1,i+1).equals("IV") || s.substring(i-1,i+1).equals("IX")) {
                    sum -= 2;
                }else if(s.substring(i-1,i+1).equals("XC") || s.substring(i-1,i+1).equals("XL")) {
                    sum -= 20;
                }else if(s.substring(i-1,i+1).equals("CD") || s.substring(i-1,i+1).equals("CM")) {
                    sum -= 200;
                }
            }
        }
        return sum;
    }
}