public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] location = {-1, -1};
        if(A == null || A.length <1)    return location;
        findRange(A, target, location, 0, A.length-1);
        return location;
    }
    public void findRange(int[] A, int target, int[] location, int begin, int end){
        if(begin > end) return;
        else {
            int middle = (begin + end)/2;
            if(A[middle] == target){
                location[0] = middle;
                location[1] = middle;
                int temp = middle+1;
                while(temp < A.length && A[temp] == target){
                    location[1] = temp;
                    temp ++;
                }
                temp = middle - 1;
                while(temp >= 0 && A[temp] == target) {
                    location[0] = temp;
                    temp --;
                }
            }else{
                if(A[middle] > target)  findRange(A, target, location, begin, middle - 1);
                else    findRange(A, target, location, middle + 1, end);
            }
        }
    }
}