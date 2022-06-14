package array_hashing;

/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // Solution by ilham surya 14/06/22
        // Arr Approach, Time O(N), Space O(1)
        int max = 1;
        int currMax = 1;
        // edge case if array empty
        if (nums.length == 0)
            return 0;

        // check for longest increasing
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currMax = currMax + 1;
            } else {
                // reset if its smaller
                currMax = 1;
            }
            max = Math.max(max, currMax);
        }
        return max;

    }
}
// @lc code=end
