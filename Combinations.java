public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sub = new ArrayList<Integer>();
        if(n<k) return result;
        combine_kth(result, n, k, 1, sub);
        return result;
    }
    public static void combine_kth(ArrayList<ArrayList<Integer>> result, int n, int k, int start, ArrayList<Integer> sub){
        if(sub.size() == k){
            ArrayList<Integer> temp=new ArrayList<Integer>(sub);
            result.add(temp);
            return;
        }else {
            for(int i = start; i <= n; i ++) {
                sub.add(i);
                combine_kth(result, n, k, i + 1, sub);
                sub.remove(sub.size()-1);
            }
        }
    }
}