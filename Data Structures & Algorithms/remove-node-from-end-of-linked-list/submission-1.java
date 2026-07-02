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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        System.out.println(size);
        int indexRemove = size-n-1;
        if(size == n){
            return head.next;
        }
        System.out.println(indexRemove);

        temp = head;
        int i = 0;

        while(temp !=null){
            if(i == indexRemove) {
                temp.next = temp.next.next;
            }
            i++;
            temp = temp.next;
        }
        return head;
    }
}
