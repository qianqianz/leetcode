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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode temp_before = result;
        ListNode current = head;
        for(int i = 0; i < m-1; i ++) {
            temp_before = temp_before.next;
            current = current.next;
        }
        for(int i = 0; i < (n-m); i ++) {
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = temp_before.next;
            temp_before.next = temp;
        }
        return result.next;
    }
}