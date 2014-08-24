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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        int first = l1.val + l2.val;
        int carry = first/10;
        ListNode temp = new ListNode(first%10);
        ListNode result = temp;
        while(l1.next != null || l2.next != null){
            int val1 = 0, val2 = 0;
            if(l1.next != null){
                l1 = l1.next;
                val1 = l1.val;
            }
            if(l2.next != null){
                l2 = l2.next;
                val2 = l2.val;
            }
            int value = val1 + val2 + carry;
            temp.next = new ListNode(value%10);
            carry = value/10;
            temp = temp.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        return result;
    }
}