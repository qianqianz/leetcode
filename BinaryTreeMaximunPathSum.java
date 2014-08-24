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
    public static int maxPathSum(TreeNode root) {
        int[] result = new int[1];
        result[0] = Integer.MIN_VALUE;
        sum(root, result);
        return result[0];
    }
    public static int sum(TreeNode root,int[] result) {
        if(root == null)    return 0;
        int right = sum(root.right,result);
        int left = sum(root.left,result);
        int total = root.val;
        int max = Math.max(left, right);
        max = Math.max(0, max);
        result[0] = Math.max(result[0], total + max);
        result[0] = Math.max(result[0], total + left + right);
        
        if(max > 0) {
            return total + max;
        }else   return total;
    }
}