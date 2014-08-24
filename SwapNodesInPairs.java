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
    public ListNode swapPairs(ListNode head) {
        ListNode before = new ListNode(0);
        before.next = head;
        ListNode result = before;
        while(before.next != null && before.next.next != null) {
            ListNode next = before.next;
            before.next = next.next;
            before = before.next;
            next.next = before.next;
            before.next = next;
            before = before.next;
        }
        return result.next;
    }
}