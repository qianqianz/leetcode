public class Solution {
    public int reverse(int x) {
        boolean isNagetive = x < 0 ? true : false;
		x = Math.abs(x);
		int reverseNum = 0;
		while(x > 0) {
			reverseNum *= 10;
			reverseNum += x%10;
			x /= 10;
		}
		return x >= 0?( isNagetive ? -reverseNum : reverseNum): -1;
    }
}
/**
 * failed test case: 0;
 * return statement first missed a "=" in the condition.
 */