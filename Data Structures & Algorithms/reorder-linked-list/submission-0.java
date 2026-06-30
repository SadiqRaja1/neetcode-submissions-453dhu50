/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; 
        this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        List<ListNode> node = new ArrayList<>();

        ListNode curr = head;
        while(curr != null){
            node.add(curr);
            curr = curr.next;
        }

        int i = 0;
        int j = node.size()-1;

        System.out.print(j);

        while(i < j){
            node.get(i).next = node.get(j);
            i++;
            if(i >= j) break;
            node.get(j).next = node.get(i);
            j--;
        }

        node.get(i).next = null;
    }
}
