public class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int len1 = num1.length();
        int len2 = num2.length();
        int[] digits = new int[len1+len2];
        for(int i = len1-1; i >=0; i--) {
            for(int j = len2 -1; j >= 0; j--) {
                digits[len1+len2-i-j-2] += (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
            }
        }
        int carry = 0;
        for(int i = 0; i <len1+len2-1; i++) {
            result.append((digits[i]+carry)%10);
            carry = (digits[i]+carry)/10;
        }
        if(carry>0){
            result.append(carry);
        }
        result.reverse();
        while(result.charAt(0) == '0' && result.length() > 1){
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}