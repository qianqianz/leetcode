public class Solution {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        for(int i = 0; i < len; i ++) {
            if(A[i] == elem) {
                while(len > 0 && A[len - 1] == elem) {
                    len --;
                }
                if(len > i){
                    A[i] = A[len - 1];
                    len --;
                }else{
                    return i;
                }
            }
        }
        return len;
    }
}