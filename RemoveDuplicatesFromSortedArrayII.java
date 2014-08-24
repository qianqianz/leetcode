public class Solution {
    public int removeDuplicates(int[] A) {
        int result = 1;
        if(A.length == 0) return 0;
        int counter = 1;
        int temp = A[0];
        int index = 1;
        for(int i = 1; i < A.length; i ++) {
            if(A[i] == temp) {
                counter++;
            }else {
                temp = A[i];
                counter = 1;
            }
            if(counter < 3) {
                A[index++] = A[i]; 
                result ++;
            }
        }
        return result;
    }
}