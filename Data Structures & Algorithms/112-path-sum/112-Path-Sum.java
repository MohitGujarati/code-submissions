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
  public boolean hasPathSum(TreeNode root, int targetSum) {

      if(root==null){
        return false;
      }

      if(root.left==null && root.right==null){
        // hasPathSum(2,2)
        return targetSum==root.val;
      }

    return  hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);

/*
          5
         / \
        4   8
       /
      11
     /  \
    7   2


hasPathSum(5, 22)
    |
    v
hasPathSum(4, 17)
    |
    v
hasPathSum(11, 13)
    |
    v
hasPathSum(2, 2)
    |
    v
return true

// 
         11
        /  \
       7    2
       ↓    ↓
     false  true
      


*/
      
        
    }
}