package tree;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        // Solution by ilham surya 15/06/22
        // DFS, Recursion approach

        // edge case if root null
        if (root == null)
            return null;

        // replace the left and right of root node
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // do recursively for any subtree available
        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
// @lc code=end
