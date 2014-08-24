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
    ArrayList<Integer> result = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
		if(root != null){
			result.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		return result;
    }
}