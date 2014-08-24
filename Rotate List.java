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
    public ListNode rotateRight(ListNode head, int n) {
        if(head == null || head.next == null || n == 0){
            return head;
        }
        int length = 1;
        ListNode begin = head;
        while(head.next!=null){
            length++;
            head = head.next;
        }
        head.next = begin;
        ListNode end = head;
        n =length - n%length;
        for(int i = 0; i < n; i ++) {
            end = end.next;
        }
        ListNode result = end.next;
        end.next = null;
        return result;
    }
}