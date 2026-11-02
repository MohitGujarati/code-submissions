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
    public ListNode sortList(ListNode head) {

//Merge sort in using LinkedList 

      if(head == null || head.next==null){
        return head;
      }
//assing them 

      ListNode start =head;
      ListNode mid =getMid(head);

      ListNode end = mid.next;

      mid.next=null; //Link

//sorts halves recursively 
      start=sortList(start);
      end=sortList(end);

//then we return by merging

      return mergeTwoList(start,end);
        
    }

    //get Mid -876 same code 
    private ListNode getMid(ListNode head){
      ListNode slow =head;
      ListNode fast = head.next;

      while(fast !=null && fast.next !=null){
        slow =slow.next;
        fast=fast.next.next;
      }

      return slow;

    }

    //Merge two lists - 21 same code

    public ListNode mergeTwoList(ListNode list1 ,ListNode list2){

      if(list1==null){
        return list2;
      }
      if(list2==null){
        return list1;
      }

      ListNode dummy =new ListNode();
      ListNode curr = dummy;

      while(list1!=null && list2!=null){

        if(list1.val<list2.val){
          curr.next=list1;
         list1= list1.next;
        }else{
          curr.next=list2;
          list2=list2.next;
        }

        curr=curr.next;
      }

      if(list1==null){
        curr.next=list2;
      }else{
        curr.next=list1;
      }

      return dummy.next;
    }
}

