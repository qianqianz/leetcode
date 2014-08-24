/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null) return result;
        ArrayList<Integer> list = new ArrayList<Integer>();
        pathList(root, sum, result, list);
        return result;
    }
    public void pathList(TreeNode root, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if(root.val == sum && root.left == null && root.right == null){
            list.add(root.val);
            result.add(new ArrayList<Integer>(list));
            return;
        }else{
            list.add(root.val);
            ArrayList<Integer> list_new = new ArrayList<Integer>(list);
            if(root.left != null) {
                pathList(root.left, sum - root.val, result, list);
            }
            if(root.right != null) {
                pathList(root.right, sum - root.val, result, list_new);
            }
        }
    }
}