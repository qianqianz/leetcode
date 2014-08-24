public class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int div = 1000;
        char[] table = {' ', ' ', 'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int index = 2;
        while(num > 0) {
            int digit = num / div;
            if(digit == 9) {
                sb.append(table[index]);
                sb.append(table[index - 2]);
                digit = 0;
            }
            if(digit >= 5) {
                sb.append(table[index - 1]);
                digit -= 5;
            }
            if(digit == 4){
                sb.append(table[index]);
                sb.append(table[index - 1]);
                digit = 0;
            }
            for(int i = 0; i < digit; i++) {
                sb.append(table[index]);
            }
            num = num % div;
            div /= 10;
            index += 2;
        }
        return sb.toString();
    }
}