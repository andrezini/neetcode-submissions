/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node dummy = head;
        Node curr = head;

        while(dummy!=null){
            map.put(dummy, new Node(dummy.val));
            dummy = dummy.next;
        }

        while(curr!=null){
            Node n =map.get(curr);
            n.next = map.get(curr.next);
            n.random = map.get(curr.random);
 

            curr = curr.next;
        }

        return map.get(head);


    }
}
