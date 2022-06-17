package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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

    public List<Integer> preorderTraversal(TreeNode root) {
        // Solution by ilham surya 17/06/22
        // Iterative method

        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null)
            return list;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            list.add(tmp.val);

            if (tmp.right != null)
                stack.push(tmp.right);
            if (tmp.left != null)
                stack.push(tmp.left);
        }
        return list;
    }
}
// @lc code=end
