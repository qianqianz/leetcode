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
    public void reorderList(ListNode head) {
        if(head==null || head.next == null)  return;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode before = new ListNode(0);
        before.next = slow.next;
        slow.next = null;
        ListNode start = before.next;
        fast = start;
        while(start != null && start.next != null) {
            fast = start.next;
            start.next = fast.next;
            fast.next = before.next;
            before.next = fast;
        }
        slow = head;
        while(before.next!=null) {
            start = before.next.next;
            before.next.next= slow.next;
            slow.next = before.next;
            before.next = start;
            slow = slow.next.next;
        }
    }
}