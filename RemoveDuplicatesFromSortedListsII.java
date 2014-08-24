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
    public ListNode deleteDuplicates(ListNode head) {
        if(head  == null || head.next == null)  return head;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        boolean isSingle = true;
        int number = head.val;
        while(head != null) {
            if(head.next == null) {
                if(isSingle) {
                    temp.next = new ListNode(number);
                    temp = temp.next;
                }
                break;
            }else {
                if(number == head.next.val) {
                    isSingle = false;
                }else {
                    if(isSingle) {
                        temp.next = new ListNode(number);
                        temp = temp.next;
                    }
                    number = head.next.val;
                    isSingle = true;
                }
            }
            head = head.next;
        }
        return result.next;
    }
}