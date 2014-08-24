/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
  * check: input root == null return null
  * initial: root != null push root.left and right into stack counter + 1 or + 2
  * recursion: pop counter members and push left and right subnode and temp_counter ++; counter = temp_counter
  */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        // ArrayList<Integer> first = new ArrayList<Integer>();
        // first.add(root.val);
        // result.add(first);
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
        result.add(temp);
        return traversal(numbers,counter,result);
    }
}