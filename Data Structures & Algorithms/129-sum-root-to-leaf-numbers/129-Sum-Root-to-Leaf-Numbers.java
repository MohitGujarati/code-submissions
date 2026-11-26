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
  public int sumNumbers(TreeNode root) {


      return counter(root,0);
    }

  private int counter(TreeNode root, int sum) {

    if (root == null) {
      return 0;
    }

    sum = sum * 10 + root.val;

    int left= counter(root.left,sum);
    int right=counter(root.right,sum);

    if(root.left==null && root.right==null){
      return sum;
    }


    return left+right;

  }
}