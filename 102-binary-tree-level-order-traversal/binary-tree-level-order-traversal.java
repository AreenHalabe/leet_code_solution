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
       List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;  // Return an empty list if root is null

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();  // Get number of nodes at current level
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();  // Dequeue the node
                currentLevel.add(currentNode.val);    // Add node's value to the current level

                if (currentNode.left != null) {
                    queue.add(currentNode.left);      // Add left child if it exists
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);     // Add right child if it exists
                }
            }

            result.add(currentLevel);  // Add the current level to the result
        }

        return result;
    }


}