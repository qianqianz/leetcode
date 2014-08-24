public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length < 1) return 0;
        int loc = 1;
        int curr = A[0];
        for(int i = 1; i < A.length; i++) {
            while(loc<A.length && A[loc] == A[i-1]){
                loc++;
            }
            if(loc == A.length){
                return i;
            }
            A[i] = A[loc];
            loc ++;
        }
        return A.length;
    }
}