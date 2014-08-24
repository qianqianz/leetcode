public class Solution {
    public int longestConsecutive(int[] num) {
        if(num.length < 1)  return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : num){
            set.add(i);
        }
        int max = 1;
        for(int i : num){
            int left = i - 1;
            int right = i + 1;
            int count = 1;
            while(set.contains(left)){
                set.remove(left);
                count ++;
                left --;
            }
            while(set.contains(right)){
                set.remove(right);
                count ++;
                right ++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}