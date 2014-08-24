public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i = 0; i < num.length; i ++) {
            for(int j = i+1; j < num.length; j ++) {
                int begin = j + 1;
                int end = num.length - 1;
                while(begin < end) {
                    int sum = num[i] + num[j] + num[begin] + num[end];
                    if(sum == target){
                        ArrayList<Integer> elem = new ArrayList<Integer>();
                        elem.add(num[i]);
                        elem.add(num[j]);
                        elem.add(num[begin]);
                        elem.add(num[end]);
                        if(!set.contains(elem)){
                            result.add(elem);
                            set.add(elem);
                        }
                        begin ++;
                        end --;
                        continue;
                    }if(sum < target){
                        begin ++;
                    }else{
                        end --;
                    }
                }
            }
        }
        return result;
    }
}