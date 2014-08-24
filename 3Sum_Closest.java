public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        int len = num.length;
        Arrays.sort(num);
        for(int i = 0; i < len; i ++) {
            int begin = i+1;
            int end = len-1;
            while(begin < end){
                int sum = num[begin] + num[end] + num[i];
                int comp = Math.abs(target - sum);
                if(min>comp){
                    min = comp;
                    result = sum;
                }
                if(sum > target){
                    end --;
                }else{
                    begin ++;
                }
            }
        }
        return result;
    }
}