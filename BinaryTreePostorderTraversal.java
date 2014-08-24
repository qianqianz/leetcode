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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
           ArrayList<Integer> result = new ArrayList<Integer>();
           if(root == null) return result;
           else return traversal(result,root);
    }
    public static ArrayList<Integer> traversal(ArrayList<Integer> result, TreeNode root){
        if(root.left != null) {
            traversal(result, root.left);
        }
        if(root.right != null) {
            traversal(result, root.right);
        }
        result.add(root.val);
        return result;
    }
}