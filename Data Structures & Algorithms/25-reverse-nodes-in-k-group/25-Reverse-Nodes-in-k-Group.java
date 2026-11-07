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

    if (head == null || k <= 1) {
      return head;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prevGrpTail = dummy;
    ListNode curr = head;

    while (curr != null) {
      ListNode check = curr;

      //check if K nodes are available
      for (int i = 0; i < k; i++) {
        if (check == null) {
          return dummy.next;
        }
        check = check.next;
      }

      //Reverse K nodes

      ListNode newLast = curr;
      ListNode prev = null;

      for (int i = 0; i < k; i++) {

        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;

      }
      //Connect reversed group
      prevGrpTail.next = prev;
      newLast.next = curr;

      //update the previous group tail
      prevGrpTail = newLast;
    }

    return dummy.next;
  }
}