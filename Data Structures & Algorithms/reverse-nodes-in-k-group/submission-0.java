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
    public ListNode reverseKGroup(ListNode head, int k) {

        // 1. THE INVENTORY CHECK
        // Send a scout pointer to see if we have at least k nodes left.
        ListNode scout = head;
        for (int i = 0; i < k; i++) {
            if (scout == null) {
                // We ran out of nodes before hitting k.
                // Leave the remaining nodes as they are!
                return head; 
            }
            scout = scout.next;
        }

        ListNode curr=head,next=null,prev=null;

        int count=0;

        while(curr!=null && count < k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }

        if(next!=null){
            ListNode rest_head=reverseKGroup(next,k);
            head.next=rest_head;
        }


        return prev;

        
    }
}
