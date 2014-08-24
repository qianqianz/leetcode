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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> numbers = new LinkedList<TreeNode>();
        numbers.add(root);
        return traversal(numbers, 1, result);
    }
    
    public static ArrayList<ArrayList<Integer>> traversal(Queue<TreeNode> numbers, int counter, ArrayList<ArrayList<Integer>> result){
        if(counter == 0)    return result;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int temp_counter = 0;
        for(int i = 0; i < counter; i ++) {
            TreeNode root = numbers.remove();
            int value = root.val;
            temp.add(value);
            if(root.left != null) {
                numbers.add(root.left);
                temp_counter ++;
            }
            if(root.right != null){
                numbers.add(root.right);
                temp_counter ++;
            }
        }
        counter = temp_counter;
        result.add(0,temp);
        return traversal(numbers,counter,result);
    }
}