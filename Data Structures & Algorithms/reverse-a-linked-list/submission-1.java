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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            // 1. Save the rest of the list
            ListNode nextNode = current.next;

            // 2. Reverse the current node's pointer to face backward
            current.next = prev;

            // 3. Shift pointers forward for the next iteration
            prev = current;
            current = nextNode;
        }

        // At the end, 'current' is null and 'prev' is pointing to the new head
        return prev;
    }
}
