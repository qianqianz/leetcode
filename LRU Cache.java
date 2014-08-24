public class LRUCache {
    HashMap<Integer, DoubleLinkedNode> map = new HashMap<Integer, DoubleLinkedNode>();
    DoubleLinkedNode head;
    DoubleLinkedNode end;
    int capacity = 0;
    int len = 0;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            DoubleLinkedNode temp = map.get(key);
            if(temp == head){
                end.next = temp;
                temp.next.pre = null;
                head = temp.next;
                temp.next = null;
                temp.pre = end;
                end = temp;
            }else if(temp != end) {
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
                end.next = temp;
                temp.next = null;
                temp.pre = end;
                end = temp;
            }
            return temp.val;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(get(key) != -1) {
            map.get(key).val = value;
            
        }else{
            DoubleLinkedNode temp = new DoubleLinkedNode(key,value);
            if(len == 0) {
                head = temp;
                end = temp;
                len ++;
                map.put(key,temp);
            }else{
                end.next = temp;
                temp.pre = end;
                end = temp;
                map.put(key,temp);
                if(len == capacity){
                    head.next.pre = null;
                    map.remove(head.key);
                    head = head.next;
                }else{
                    len++;
                }
            }
        }
    }
}

class DoubleLinkedNode{
    int val;
    int key;
    DoubleLinkedNode pre;
    DoubleLinkedNode next;
    public DoubleLinkedNode(int key, int value) {
        val = value;
        this.key = key;
        pre = null;
        next = null;
    }
}