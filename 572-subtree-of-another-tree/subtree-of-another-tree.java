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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

  
    private boolean isSameTree(TreeNode r, TreeNode sub) {
        if (r == null && sub == null) {
            return true;
        }
        if (r == null || sub == null) {
            return false;
        }
        if (r.val != sub.val) {
            return false;
        }
        return isSameTree(r.left, sub.left) && isSameTree(r.right, sub.right);
    }
}