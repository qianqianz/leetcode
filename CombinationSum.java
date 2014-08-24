public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subset = new ArrayList<Integer>();
        Arrays.sort(candidates);
        sum(0,result, subset, candidates, 0, target);
        return result;
    }
    public static void sum(int start,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> subset, int[] candidates, int total, int target){
        if(total == target){
            result.add(new ArrayList<Integer>(subset));
            return;
        }else if(total>target){
            return;
        }else{
            for(int i = start; i < candidates.length; i++) {
                subset.add(candidates[i]);
                sum(i,result, subset, candidates, total + candidates[i], target);
                subset.remove(subset.size()-1);
            }
        }
    }
}