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

  int maxDiameter = 0;

  public int diameterOfBinaryTree(TreeNode root) {

    height(root);
    return maxDiameter;
  }

  private int height(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = height(root.left);
    int right = height(root.right);

    maxDiameter = Math.max(maxDiameter, left + right);

    return 1 + Math.max(left, right);
  }
}

/*
Think of it this way:
- left + right measures the longest path passing through the current node.
- 1 + Math.max(left, right) finds the height to return to the parent.
*/