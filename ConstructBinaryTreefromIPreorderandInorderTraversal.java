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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder == null) return null;
        if(inorder.length<1)    return null;
        int len = inorder.length;
        return generateTree(inorder, preorder, 0, 0, len);
    }
    public static TreeNode generateTree(int[] inorder, int[] preorder, int loc, int start, int len){
        if(loc<0 || loc>=inorder.length || start <0 || start >= inorder.length || len<=0){
            return null;
        }
        TreeNode curr = new TreeNode(preorder[loc]);
        int left_len = 0;
        int right_start = start;
        for(int i = start; i < start + len; i++) {
            if(inorder[i] == preorder[loc]){
                left_len = i - start;
                right_start = i+1;
            }
        }
        curr.left = generateTree(inorder, preorder, loc+1, start, left_len);
        curr.right = generateTree(inorder, preorder, loc+left_len + 1, right_start, len-1-left_len);
        return curr;
    }
}