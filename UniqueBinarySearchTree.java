/**
 * It takes a lot of time to figure out
 */

public class Solution {
    public int numTrees(int n) {
		int[] Total = new int[n+1];
		Total[0] = 1;
		Total[1] = 1;
		for(int i = 2; i <= n; i++) {
			int temp = 0;
			for(int j = 1; j <= i; j ++) {
				temp += (Total[j - 1] * Total[i - j]);
			}
			Total[i] = temp;
		}
		return Total[n];
    }
}