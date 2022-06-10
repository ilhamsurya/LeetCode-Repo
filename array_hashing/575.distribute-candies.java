package array_hashing;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candyType) {
        // Solution by ilham surya 5/06/2022
        // Hash Set Approach Time O(N),Space O(1)
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        return Math.min(candyType.length / 2, set.size());
    }
}
// @lc code=end
