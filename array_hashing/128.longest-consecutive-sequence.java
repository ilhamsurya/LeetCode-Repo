package array_hashing;

import java.util.HashSet;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        // Solution by ilham surya 14/06/22
        // HashSet Approach Time O(N), Space O(N)

        int max = 0;
        HashSet<Integer> set = new HashSet<>();

        // add number to set
        for (int i : nums) {
            set.add(i);
        }

        // start checking each number
        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            // the rule for subsequence, only has 1 diff each num
            // look for smaller
            int num = nums[i];
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }

            // look for bigger
            num = nums[i];
            while (set.contains(++num)) {
                count++;
                set.remove(num);
            }

            max = Math.max(max, count);
        }
        return max;
    }
}
// @lc code=end
