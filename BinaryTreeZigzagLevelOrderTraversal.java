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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> numbers = new LinkedList<TreeNode>();
        numbers.offer(root);
        if(root == null) {
            return result;
        }else {
            return traversal(result, numbers,0,1);
        }
    }
    public static ArrayList<ArrayList<Integer>> traversal(ArrayList<ArrayList<Integer>> result, Queue<TreeNode> numbers, int index,int counter) {
        ArrayList<Integer> level = new ArrayList<Integer>();
        int temp_count = 0;
        while(counter > 0 ) {
            TreeNode root = numbers.poll();
            level.add(root.val);
            if(root.left != null) {
                numbers.offer(root.left);
                temp_count ++;
            }
            if(root.right != null) {
                numbers.offer(root.right);
                temp_count ++;
            }
            counter --;
        }
        if(index % 2 == 0) {
            result.add(level);
        }else {
            Collections.reverse(level);
            result.add(level);
        }
        counter = temp_count;
        if(numbers.peek()!= null) return traversal(result, numbers,index+1,counter);
        else return result;
    }
}