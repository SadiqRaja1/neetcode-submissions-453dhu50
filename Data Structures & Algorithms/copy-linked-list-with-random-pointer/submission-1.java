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
        Node temp = head.next;
        Node temp2 = newHead;
        Map<Node, Node> m = new HashMap<>();
        m.put(head, newHead);
        while(temp != null){
            Node newNode = new Node(temp.val);
            m.put(temp, newNode);
            temp2.next = newNode;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp = head;
        temp2 = newHead;

        while(temp2 != null) {
            temp2.random = m.get(temp.random);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return newHead;
    }
}
