public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        int length = num.length;
        if(length < 1) {
            return null;
        }
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(num[0]);
        result.add(new ArrayList<Integer>(first));
        for(int i = 1; i < length; i++) {
            ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> number_list: result) {
                for(int j = 0; j < i+1; j++) {
                    ArrayList<Integer> number_new = new ArrayList<Integer>(number_list);
                    number_new.add(j, num[i]);
                    temp.add(number_new);
                }
            }
            result = temp;
        }
        return result;
    }
}