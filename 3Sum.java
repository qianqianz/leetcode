public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Set set = new HashSet();
        for(int i = 0; i < num.length - 2; i++) {
            if(num[i] > 0) break;
            int target = -num[i];
            int begin = i + 1;
            int end = num.length - 1;
            while (begin < end) {
                if(num[begin] + num[end] == target) {
                    ArrayList<Integer> element = new ArrayList<Integer>();
                    element.add(num[i]);
                    element.add(num[begin]);
                    element.add(num[end]);
                    if(!set.contains(element)){
                        result.add(element);
                        set.add(element);
                    }
                }if(num[begin] + num[end] > target) {
                    end --;
                }else{
                    begin ++;
                }
            }
        }
        return result;
    }
}