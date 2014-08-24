public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        boolean overTen = false;
        if(digits[length - 1] == 9) {
            overTen = true;
            digits[length - 1] = 0;
        }else {
            digits[length - 1] ++;
        }
        int loop = length - 1;
        while(overTen && loop>0) {
            loop--;
            if(digits[loop] < 9) {
                overTen = false;
                digits[loop] ++;
            }else {
                digits[loop] = 0;
            }
        }
        if(overTen) {
            int[] result = new int[length+1];
            result[0] = 1;
            for(int i = 1; i < length+1; i++) {
                result[i] = 0;
            }
            return result;
        }
        return digits;
    }
}