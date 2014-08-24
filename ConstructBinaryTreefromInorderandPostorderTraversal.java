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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null) return null;
        if(inorder.length<1)    return null;
        int len = inorder.length;
        return generateTree(inorder, postorder, postorder.length-1, 0, len);
    }
    public static TreeNode generateTree(int[] inorder, int[] postorder, int loc, int start, int len){
        if(loc<0 || loc>=inorder.length || start <0 || start >= inorder.length || len<=0){
            return null;
        }
        TreeNode curr = new TreeNode(postorder[loc]);
        int left_len = 0;
        int right_start = start;
        for(int i = start; i < start + len; i++) {
            if(inorder[i] == postorder[loc]){
                left_len = i-start;
                right_start = i+1;
            }
        }
        int right_len = len- left_len -1;
        curr.left = generateTree(inorder, postorder, loc-1-right_len, start, left_len);
        curr.right = generateTree(inorder, postorder, loc - 1, right_start, right_len);
        return curr;
    }
}