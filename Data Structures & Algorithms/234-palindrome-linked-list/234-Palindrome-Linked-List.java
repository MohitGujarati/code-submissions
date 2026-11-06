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
  public ListNode  middleNode(ListNode head){
      ListNode slow =head;
      ListNode fast=head;


      while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }

      return slow ;
    }

  public ListNode reverseList(ListNode head) {

    ListNode prev = null;
    ListNode curr = head;
    ListNode next = null;

    while (curr != null) {
      next = curr.next;
      curr.next=prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }

  public boolean isPalindrome(ListNode head) {

    if(head==null || head.next==null){
      return true;
    }

      ListNode middle=middleNode(head);
      ListNode secondHead=reverseList(middle);

      ListNode restoredHead=secondHead;

      boolean isPlain=true;

      //compare botht the halfs

      while(head!=null && secondHead != null){
        if(head.val != secondHead.val){
          isPlain=false;
          break;
      }
      head=head.next;
      secondHead=secondHead.next;
      }

       return isPlain;


      }
   



}