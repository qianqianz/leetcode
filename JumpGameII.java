public class Solution {
    public int jump(int[] A) {
        int temp = 0;
        int max = 0;
        int count = 0;
        for(int i = 0; i < A.length;){
            if(temp>=A.length - 1) break;
            while(i<=temp){
                max = Math.max(max, i + A[i]);
                i++;
            }
            count ++;
            temp = max;
        }
        return count;
    }
}