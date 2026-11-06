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
    public void reorderList(ListNode head) {

      ListNode firstHead = head;
      ListNode getMid=middleNode(head);
      ListNode secondHead=reverseList(getMid.next);

      getMid.next=null;


     mergeTwoList(firstHead,secondHead);
  
    }
    
    public ListNode mergeTwoList(ListNode list1 ,ListNode list2){

      if(list1 == null){
        return list2;
      }if(list2 ==null){
        return list1;
      }
        ListNode dummy =new ListNode();
        ListNode curr=dummy;
      
      
      while(list1!=null && list2!=null){

        curr.next=list1;
        list1=list1.next;
        curr=curr.next;


        curr.next=list2;
        list2=list2.next;
        curr=curr.next;


      }

      if(list1==null){
        curr.next=list2;
      }else{
        curr.next=list1;
      }

      return dummy.next;

    }

    public ListNode middleNode(ListNode head){

      ListNode slow=head;
      ListNode fast=head;


      while(fast.next!=null && fast.next.next !=null){
        slow=slow.next;
        fast=fast.next.next;
      }

      return slow;
    }


    public ListNode reverseList(ListNode head){
      ListNode prev =null;
      ListNode curr=head;
      ListNode next=null;


      while(curr!=null){

        next =curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

      }

      return prev ;

    }
}