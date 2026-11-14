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
  public List<List<Integer>> levelOrder(TreeNode root) {

    // Store the final level-by-level result
    List<List<Integer>> result = new ArrayList<>();

    // Return an empty list if the tree is empty
    if (root == null) {
      return result;
    }

    // Create a queue to perform BFS
    Queue<TreeNode> queue = new LinkedList<>();

    // Add the root node to start BFS
    queue.offer(root);

    // Continue until all nodes are processed
    while (!queue.isEmpty()) {

      // Get the number of nodes in the current level
      int levelSize = queue.size();

      // Store values of nodes at the current level
      List<Integer> level = new ArrayList<>();

      // Process only the nodes of the current level
      for (int i = 0; i < levelSize; i++) {

        // Remove the front node from the queue
        TreeNode curr = queue.poll();

        // Add the current node's value to this level
        level.add(curr.val);

        // Add the left child to the queue if it exists
        if (curr.left != null) {
          queue.offer(curr.left);
        }

        // Add the right child to the queue if it exists
        if (curr.right != null) {
          queue.offer(curr.right);
        }
      }

      // Add the completed level to the final result
      result.add(level);
    }

    // Return all levels of the binary tree
    return result;
  }
}