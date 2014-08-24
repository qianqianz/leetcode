public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        if(m==0) {
            int i = 0;
            for(int ele: B) {
                A[i++] = ele;
            }
            return;
        }
        if(n==0) return;
        int length = m+n;
        int index_a = m-1;
        int index_b = n-1;
        while(index_a!=-1||index_b!=-1) {
            if(index_a!= -1 && index_b!=-1 &&B[index_b]<A[index_a]) {
                A[index_a+index_b+1] = A[index_a--];
            }else if(index_a!= -1 && index_b!=-1 &&B[index_b]>=A[index_a]) {
                A[index_a+index_b+1] = B[index_b--];
            } else if(index_a == -1) {
                A[index_a+index_b+1] = B[index_b--];
            } else if(index_b == -1) {
                A[index_a+index_b+1] = A[index_a--];
            }
        }
    }
}