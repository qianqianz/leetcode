/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    static ListNode list;
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        this.list = head;
        int count = 0;
        if(head == null)    return null;
        while(temp != null){
            temp = temp.next;
            count ++;
        }
        return convert(0, count - 1);
    }
    public static TreeNode convert(int begin, int end){
        if(begin > end) return null;
        int middle = (begin + end)/2;
        TreeNode left = convert( begin, middle - 1);
        TreeNode result = new TreeNode(list.val);
        result.left = left;
        list = list.next;
        result.right = convert(middle + 1, end);
        return result;
    }
}