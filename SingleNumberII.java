public class Solution {
    public int singleNumber(int[] A) {
        int one = 0;
        int two = 0;
        int three = 0;
        int len = A.length;
        if(len == 1)    return A[0];
        for(int i = 0; i < len; i ++) {
            two |= one & A[i];
            one ^= A[i];
            three = (one & two);
            one &= ~three;
            two &= ~three;
        }
        return one;
    }
}