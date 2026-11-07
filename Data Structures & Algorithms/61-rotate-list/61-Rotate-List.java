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
  public ListNode rotateRight(ListNode head, int k) {

      if(head==null||head.next==null||k==0){
        return head;
      }

      ListNode tail=head;

      int length= 1;

      while(tail.next !=null){
        tail=tail.next;
        length++;
      }

//we made an circular list 
      tail.next=head;

      //optimizing k to prevent unnecessay massive rotations

      k=k% length;

      ListNode newTail=head;

      for(int i=0;i<length-k-1;i++){
        newTail=newTail.next;
      }

      ListNode newHead = newTail.next;

      newTail.next=null;

      return newHead;
        
    }
}