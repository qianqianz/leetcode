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
    public TreeNode sortedArrayToBST(int[] num) {
        return buildTree(num, 0, num.length-1);
        
    }
    
    public TreeNode buildTree(int[] num, int low, int high) {
        if(low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = buildTree(num, low, mid-1);
        root.right = buildTree(num, mid+1,high);
        return root;
    }
}