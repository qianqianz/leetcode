public class Solution {
    public int firstMissingPositive(int[] A) {
        if(A == null || A.length < 1)   return 1;
        if(A.length == 1) return A[0] == 1? 2:1;
        for(int i = 0; i < A.length; i ++) {
            if(A[i] != (i+1) && A[i] > 0 && A[i] <= A.length && A[A[i]-1] != A[i]) {
                int temp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = temp;
                i--;
            } 
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] != i+1) {
                return i + 1;
            }
        }
        return A.length + 1;
    }
}