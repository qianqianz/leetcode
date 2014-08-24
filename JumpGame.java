public class Solution {
    public boolean canJump(int[] A) {
        int[] step = new int[A.length];
        step[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            if(step[i-1]<1){
                return false;
            }
            step[i] = Math.max(step[i-1] - 1,A[i]);
        }
        return true;
    }
}