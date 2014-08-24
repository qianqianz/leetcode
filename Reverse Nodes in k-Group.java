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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k ==0 || k == 1 || head == null || head.next == null) {
            return head;
        }
        ListNode next = head;
        ListNode begin = head;
        ListNode before = new ListNode(0);
        before.next = head;
        ListNode before_temp = before;
        int i = 0;
        while(head != null) {
            i++;
            if(i%k == 0) {
                next = head.next;
                head = begin;
                while(head.next != next){
                    ListNode curr = head.next;
                    head.next = curr.next;
                    curr.next = begin;
                    before_temp.next = curr;
                    begin = curr;
                    curr = head.next;
                }
                before_temp = head;
                begin = next;
                head = next;
            }else{
                head = head.next;
            }
        }
        return before.next;
    }
}