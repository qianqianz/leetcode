/*
 * 0^a = a, a^a = 0
 */
public class Solution {
    public int singleNumber(int[] A) {
        int len = A.length;
		int singleNum = 0;
		for(int i = 0; i < len; i ++)  {
			singleNum ^= A[i]; 
		}
		return singleNum;
    }
}