/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tortoies = head;
        ListNode rabbit = head;

        while(rabbit != null && rabbit.next != null){
            tortoies = tortoies.next;
            rabbit = rabbit.next.next;
            if(tortoies == rabbit) return true;
        }

        return false;
    }
}
