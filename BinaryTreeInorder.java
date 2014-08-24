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
	ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        if(root != null) {
			inorderTraversal(root.left);
			list.add(root.val);
			inorderTraversal(root.right);
		}
		return list;
    }
}