public class Solution {
    public int maxSubArray(int[] A) {
        int len = A.length;
        if(len < 1) return 0;
        int sum = 0;
        int max = A[0];
        for(int i = 0; i < len; i ++) {
            sum += A[i];
            max = Math.max(max, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}