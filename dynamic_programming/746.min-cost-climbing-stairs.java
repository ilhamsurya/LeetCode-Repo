package dynamic_programming;

/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Solution by ilham surya 10/06/22
        int n = cost.length;
        int f1 = 0, f2 = 0;
        for (int i = 2; i <= n; ++i) {
            int tmp = Math.min(f1 + cost[i - 2], f2 + cost[i - 1]);
            f1 = f2;
            f2 = tmp;
        }
        return f2;
    }
}
// @lc code=end
