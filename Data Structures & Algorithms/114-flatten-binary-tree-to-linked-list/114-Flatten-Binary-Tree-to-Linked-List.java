/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  TreeNode prev=null;
    public void flatten(TreeNode root) {

      if(root==null){
        return;
      }

//save original children 

      TreeNode left =root.left;
      TreeNode right =root.right;

//connect the previous node to current 
      if(prev!=null){
        prev.right=root;
        prev.left=null;
      }

//remeber the current node 
      prev=root;
      root.left=null;

//traversal
      flatten(left);
      flatten(right);
        
    }
}