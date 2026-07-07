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
         if (head == null) return null;
        Node newHead = new Node(head.val);
        Node temp1 = head.next;
        Node temp2 = newHead;
        Map<Node,Node> m = new HashMap<>();
        m.put(head,newHead);

        while(temp1 != null){
            Node newNode = new Node(temp1.val);
            m.put(temp1, newNode);
            temp2.next = newNode;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        temp1 = head;
        temp2 = newHead;

        while(temp1 != null){
            temp2.random = m.get(temp1.random);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return newHead;
    }
}
