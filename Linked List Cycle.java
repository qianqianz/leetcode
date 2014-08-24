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
    public boolean hasCycle(ListNode head) {
		while(head!= null && head.next != null) {
		    if(head == head.next) {
		        return true;
		    }
			head.next = head.next.next;
			head = head.next;
		}
		return false;
    }
}