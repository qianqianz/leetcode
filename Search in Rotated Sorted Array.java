public class Solution {
    public int search(int[] A, int target) {
        return search_binary(A, target, 0, A.length - 1);
    }
    public static int search_binary(int[] A, int target, int begin, int end) {
        if(begin > end) return -1;
        int middle = (begin + end) / 2;
        if(A[middle] == target) return middle;
        else{
            if(A[begin] <= A[middle]) {
                if(target >= A[begin] && target < A[middle])  return search_binary(A, target, begin, middle-1);
                else    return search_binary(A, target, middle+1, end);
            }else{
                if(target > A[middle] && target <= A[end])  return search_binary(A, target, middle+1,end);
                else    return search_binary(A,target,begin, middle - 1);
            }
        }
    }
}