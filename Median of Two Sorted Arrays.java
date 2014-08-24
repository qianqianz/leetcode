public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int index = A.length + B.length;
        int index1 = index / 2;
        int index2 = index - index1 - 1;
        if(A.length == 0)   return (B[index1] + B[index2]) / 2.0;
        if(B.length == 0)   return (A[index1] + A[index2]) / 2.0;
        int i = 0, j = 0;
        int count = -1;
        double result = 0;
        while(i < A.length && j < B.length){
            if(A[i] < B[j]){
                count ++;
                if(count == index1 || count == index2){
                    result += A[i];
                }
                i ++;
            }else{
                count ++;
                if(count == index1 || count == index2){
                    result += B[j];
                }
                j++;
            }
        }
        while(i < A.length){
            count ++;
            if(count == index1 || count == index2){
                result += A[i];
            }
            i++;
        }
        while(j < B.length){
            count ++;
            if(count == index1 || count == index2){
                result += B[j];
            }
            j++;
        }
        if(index1 == index2)    return result;
        else    return result/2.0;
    }
}