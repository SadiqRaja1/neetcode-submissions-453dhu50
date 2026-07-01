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

    void print(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void reorderList(ListNode head) {
        ListNode tortoies = head;
        ListNode rabbit = head;

        while(rabbit != null && rabbit.next != null) {
            tortoies = tortoies.next;
            rabbit = rabbit.next.next;
        }

        ListNode second = tortoies.next;
        tortoies.next = null;

        ListNode prev = null;
        ListNode curr = second;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp = head;
        while(temp != null && prev != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = prev.next;
            temp.next.next = next;
            temp = temp.next.next;
        }

    }
}
