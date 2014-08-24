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
    public int minDepth(TreeNode root) {
        if(root == null)    return 0;
        else return calDepth(root);
    }
    public int calDepth(TreeNode root) {
        if(root.right == null && root.left == null) return 1;
        else if(root.right == null) return 1 + calDepth(root.left);
        else if(root.left == null)  return 1 + calDepth(root.right);
        else return 1 + (calDepth(root.right)<calDepth(root.left)?calDepth(root.right):calDepth(root.left));
    }
}