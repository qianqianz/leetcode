/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode *root) {
        if(root==NULL) {
            return 0;
        }
        if(root->left==NULL && root->right==NULL) return 1;
        int left = maxDepth(root->left);
        int right = maxDepth(root->right);
        int result = (left>right?left:right)+1;
        return result;
    }
};