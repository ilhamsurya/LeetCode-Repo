package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Solution by ilham surya 17/06/22
        // Depth First Search Time O(n), Space O(n)

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resList = new LinkedList<List<Integer>>();

        if (root == null)
            return resList;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int currLevel = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < currLevel; i++) {
                if (queue.peek().left != null)
                    queue.add(queue.peek().left);
                if (queue.peek().right != null)
                    queue.add(queue.peek().right);
                list.add(queue.poll().val);
            }
            resList.add(0, list);
        }
        return resList;
    }
}
// @lc code=end
