package tree;

/*
 * @lc app=leetcode id=1448 lang=java
 *
 * [1448] Count Good Nodes in Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int count = 0;

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

    public int goodNodes(TreeNode root) {
        // Solution by ilham surya 17/06/22
        // Preorder Traversal Approach Time O(N), Space O(logn)
        dfs(root, root.val);
        return count;
    }

    void dfs(TreeNode node, int maxVal) {
        if (node == null)
            return;
        if (node.val >= maxVal)
            count++;

        maxVal = Math.max(maxVal, node.val);
        dfs(node.left, maxVal);
        dfs(node.right, maxVal);
    }
}
// @lc code=end
