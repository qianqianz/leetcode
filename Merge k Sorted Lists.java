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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        return divide(lists, 0, lists.size()-1);
    }
    public static ListNode divide(ArrayList<ListNode> list, int begin, int end) {
        if(begin > end) return null;
        if(begin == end) return list.get(begin);
        else{
            int middle =  (begin + end) / 2;
            ListNode left = divide(list, begin, middle);
            ListNode right = divide(list, middle + 1, end);
            return merge2Lists(left, right);
        }
    }
    public static ListNode merge2Lists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(list1 != null && list2 != null) {
            if(list1.val >= list2.val) {
                temp.next = list2;
                list2 = list2.next;
            }else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null) {
            temp.next = list2;
        }
        return head.next;
    }
}