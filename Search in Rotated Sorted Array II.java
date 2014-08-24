public class Solution {
    public boolean search(int[] A, int target) {
        if(A.length == 0)   return false;
        return subSearch(A,0,A.length - 1, target);
    }
    public static boolean subSearch(int[] A, int begin, int end, int target){
        int middle = (begin + end) / 2;
        if(begin > end) return false;
        else if(A[middle] == target) return true;
        else{
            if(A[begin] < A[middle]){
                if(A[middle] > target  && target >= A[begin])  return subSearch(A, begin, middle-1, target);
                else    return subSearch(A,  middle + 1, end, target);
            }else if(A[begin]>A[middle]){
                if(A[middle] < target && target <= A[end]){
                    return  subSearch(A, middle + 1, end, target);
                }else{
                        return subSearch(A, begin, middle - 1, target);
                }
            }else{
                return  subSearch(A, middle + 1, end, target) || subSearch(A, begin, middle - 1, target);
            }
        }
    }
}