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
    public void reorderList(ListNode head) {
        if(head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;

        ListNode curr = second;
        ListNode slowPrev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = slowPrev;
            slowPrev = curr;
            curr = next;
        }

        ListNode temp = head;
        while (slowPrev != null){
            ListNode next = temp.next;
            temp.next = slowPrev;
            slowPrev = slowPrev.next;
            temp.next.next = next;
            temp = temp.next.next;
        }

    }
}
