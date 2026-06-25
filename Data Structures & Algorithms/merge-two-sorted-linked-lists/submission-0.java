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
    class LinkedList {
        ListNode head = null;
        void insert(int data){
            ListNode newNode = new ListNode(data);
            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }   

        void print(){
            ListNode temp = head;
            while (temp != null){
                System.out.print(temp.val+"->");
                temp = temp.next;
            }
            System.out.print("null");
        }

        void reverse(){
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = null;

            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        LinkedList ans = new LinkedList();

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                ans.insert(temp1.val);
                temp1 = temp1.next;
            }else {
                ans.insert(temp2.val);
                temp2 = temp2.next;
            }
        }

        while(temp1 != null){
            ans.insert(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            ans.insert(temp2.val);
            temp2 = temp2.next;
        }
        
        ans.reverse();

        return ans.head;
    }
}