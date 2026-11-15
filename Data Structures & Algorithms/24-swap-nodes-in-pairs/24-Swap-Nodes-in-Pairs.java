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
    public ListNode swapPairs(ListNode head) {
      ListNode dummy =new ListNode(0);
      dummy.next =head;

      ListNode prev=dummy;

      while(prev.next!=null && prev.next.next !=null){

        ListNode p1=prev.next;
        ListNode p2=p1.next;

        p1.next=p2.next;
        p2.next=p1;
        prev.next=p2;

        prev=p1;

      }
        return dummy.next;
    }
}