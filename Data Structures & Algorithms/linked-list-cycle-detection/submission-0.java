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
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> s= new HashSet<ListNode>();

        for(ListNode curr=head;curr!=null;curr=curr.next){

            if(s.contains(curr)){
                return true;
            }else{
                s.add(curr);
            }
        }
        return false;
    }
}
