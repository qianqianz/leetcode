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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0)  return head;
        ListNode before = new ListNode(0);
        before.next = head;
        ListNode temp = before;
        ListNode result = before;
        int count = 0;
        while((n - 1) >= 0){
            temp = temp.next;
            n--;
        }
        while(temp.next != null){
            temp = temp.next;
            before = before.next;
        }
        before.next = before.next.next;
        return result.next;
    }
}