/**
 *Two pointers, one is fast, the other is slow.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode faster = head;
		ListNode slower = head;
		while(faster != null && faster.next != null) {
			faster = faster.next.next;
			slower = slower.next;
			if(faster == slower) {
				return true;
			}
		}
		return false;
    }
}

/**
 * Follow up: Can you solve it without using extra space?
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