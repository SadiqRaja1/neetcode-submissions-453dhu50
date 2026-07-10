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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> node = new ArrayList<>();
        for(ListNode lst : lists){
            while(lst != null){
                node.add(lst.val);
                lst = lst.next;
            }
        }

        Collections.sort(node);
        System.out.print(node);

        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        for(int i : node){
            ListNode newNode = new ListNode(i);
            dummy.next = newNode;
            dummy = dummy.next;
        }

        return ans.next;
    }
}
