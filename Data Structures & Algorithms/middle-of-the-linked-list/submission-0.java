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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Fast pointer must check itself and its next node 
    
        while (fast != null && fast.next != null) {
            slow = slow.next;         // moves 1 step
            fast = fast.next.next;    // moves 2 steps
        }
        
        return slow;
        
    }
}