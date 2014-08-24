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
    public void flatten(TreeNode root) {
        if(root == null)    return;
        flattenTree(root);
    }
    
    public void flattenTree(TreeNode root) {
        if(root == null)    return;
        if(root.left == null)    flattenTree(root.right);
        else {
            flattenTree(root.left);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            while(root.right != null) {
                root = root.right;
            }
            root.right = temp;
            flattenTree(temp);
        } 
    }
}