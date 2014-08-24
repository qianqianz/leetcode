/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null)   return head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next =null;
        slow = sortList(head);
        fast = sortList(fast);
        return merge(slow, fast);
    }
    
    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null) {
            temp.next = l1;
        }
        if(l2 != null) {
            temp.next = l2;   
        }
        return result.next;
    }
    
}