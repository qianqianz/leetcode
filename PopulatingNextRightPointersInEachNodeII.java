/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null)    return;
        Queue<TreeLinkNode> numbers = new LinkedList<TreeLinkNode>();
        numbers.offer(root);
        traversal(numbers,1);
    }
    public static void traversal(Queue<TreeLinkNode> numbers, int counter){
        int counter_temp = 0;
        TreeLinkNode root = new TreeLinkNode(0);
        for(int i = 0; i < counter; i ++) {
            if(i == 0) {
                root = numbers.poll();
            } else {
                TreeLinkNode temp = numbers.poll();
                root.next = temp;
                root = root.next;
            }
            if(root.left != null) {
                numbers.offer(root.left);
                counter_temp ++;
            }
            if(root.right != null) {
                numbers.offer(root.right);
                counter_temp ++;
            }
        }
        root.next = null;
        counter = counter_temp;
        if(counter > 0) {
            traversal(numbers,counter);
        }
    }
}