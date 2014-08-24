public class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length()-1;
        int blen = b.length()-1;
        int carry = 0;
        String result = "";
        while(alen>=0 && blen>=0){
            int temp = a.charAt(alen)-'0'+b.charAt(blen) -'0' + carry;
            carry = temp / 2;
            result = String.valueOf(temp%2) + result;
            alen--;
            blen--;
        }
        while(alen>=0){
            int temp = a.charAt(alen)-'0' + carry;
            carry = temp / 2;
            result = String.valueOf(temp%2) + result;
            alen--;
        }
        while(blen>=0){
            int temp = b.charAt(blen)-'0' + carry;
            carry = temp / 2;
            result = String.valueOf(temp%2) + result;
            blen--;
        }
        if(carry>0){
            result = String.valueOf(carry) + result;
        }
        return result;
    }
}