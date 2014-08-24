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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)   return null;
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        map.put(head,1);
        while(head.next != null){
            if(map.containsKey(head.next)){
                return head.next;
            }else {
                head = head.next;
                map.put(head,1);
            }
        }
        return null;
    }
}