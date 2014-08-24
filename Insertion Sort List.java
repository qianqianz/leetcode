/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        if(head == null)    return null;
        else temp.next = new ListNode(head.val);
        
        while(head.next != null){
            temp = result;
            while(temp.next != null && head.next != null && temp.next.val < head.next.val){
                temp = temp.next;
            }
            ListNode temp_node = temp.next;
            temp.next = new ListNode(head.next.val);
            temp.next.next = temp_node;
            head = head.next;
        }
        return result.next;
    }
}