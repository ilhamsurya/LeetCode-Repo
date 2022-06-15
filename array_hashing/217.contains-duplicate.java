package array_hashing;

import java.util.HashSet;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Solution By ILham SUrya 15/06/22
        // HashSet Approach Time O(N), Space O(N)
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i))
                return true;
        }
        return false;
    }
}
// @lc code=end
