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
  public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // Phase 1: The Setup (The Dummy Node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode leftPrev = dummy;
        // Walk leftPrev forward until it stands exactly 1 step before 'left'
        for (int i = 0; i < left - 1; i++) {
            leftPrev = leftPrev.next;
        }

        // Phase 2: The Reversal
        ListNode curr = leftPrev.next; // The first node to be reversed
        ListNode prev = null;
        ListNode next = null;
        
        // Standard reversal, but ONLY run it (right - left + 1) times!
        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Phase 3: The Stitch-Up (The hardest part!)
        // Right now:
        // 'prev' is standing on the NEW start of the reversed sublist.
        // 'curr' is standing on the first node AFTER the reversed sublist.
        // 'leftPrev.next' is still pointing to the OLD start of the sublist (which is now the tail).
        
        leftPrev.next.next = curr; // Connect the end of our reversed sublist to the rest of the list
        leftPrev.next = prev;      // Connect the beginning of our reversed sublist to leftPrev

        return dummy.next;

  }
}