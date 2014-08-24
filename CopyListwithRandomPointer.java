/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode result = new RandomListNode(0);
        RandomListNode temp = result;
        RandomListNode head_temp = head;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        while(head_temp != null) {
            RandomListNode new_node = new RandomListNode(head_temp.label);
            map.put(head_temp, new_node);
            temp.next = new_node;
            head_temp = head_temp.next;
            temp = temp.next;
        }
        head_temp = head;
        temp = result.next;
        while(head_temp != null) {
            if(head_temp.random == null) {
                temp.random = null;
            }else{
                temp.random = map.get(head_temp.random);
            }
            temp = temp.next;
            head_temp = head_temp.next;
        }
        return result.next;
    }
}