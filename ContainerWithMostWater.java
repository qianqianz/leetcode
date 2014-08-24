public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int begin = 0;
        int end = height.length - 1;
        while(begin < end) {
            int temp = Math.min(height[begin], height[end]) * (end - begin);
            max = Math.max(temp, max);
            if(height[begin] > height[end]) {
                end --;
            }else{
                begin ++;
            }
        }
        return max;
    }
}