public class Solution {
    public int searchInsert(int[] A, int target) {
        int begin = 0;
        int end = A.length - 1;
        int middle = 0;
        int insert = 0;
        while(begin <= end) {
            middle = (begin + end) / 2;
            if(A[middle] == target) {
                return middle;
            }else if(target < A[middle]){
                end = middle - 1;
                insert = middle;
            }else {
                begin = middle + 1;
                insert = middle + 1;
            }
        }
        return insert;
    }
}