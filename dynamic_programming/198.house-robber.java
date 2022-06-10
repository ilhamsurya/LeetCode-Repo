package dynamic_programming;
/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        // Solution by ilham surya 02/06/22
        // DynamicProgramming approach Time O(n), Space O(n)
        int rob = 0;
        int notRob = 0;

        for (int i = 0; i < nums.length; i++) {
            int currRob = notRob + nums[i];
            notRob = Math.max(notRob, rob);
            rob = currRob;
        }
        return Math.max(rob, notRob);
    }
}
// @lc code=end
