public class Solution {
    public void sortColors(int[] A) {
        for(int i = 0; i < A.length; i++) {
            int temp_index = A.length - 1;
            if(A[i] == 2) {
                while(temp_index > i && A[temp_index] == 2) {
                    temp_index--;
                }
                if(temp_index == i) break;
                int temp = A[temp_index];
                A[temp_index] = A[i];
                A[i] = temp;
            }
        }
        for(int i = 0; i < A.length; i++) {
            int temp_index = A.length - 1;
            if(A[i] == 1) {
                while(temp_index > i && A[temp_index] > 0) {
                    temp_index--;
                }
                if(temp_index == i) break;
                int temp = A[temp_index];
                A[temp_index] = A[i];
                A[i] = temp;
            }
        }
    }
}