package dynamic_programming;

/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        // Solution by ilham surya 14/06/22
        // DP Approach
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0)
            return false;

        sum /= 2;

        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int j : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= j) {
                    dp[i] = dp[i] || dp[i - j];
                }
            }
        }

        return dp[sum];
    }
}
// @lc code=end
