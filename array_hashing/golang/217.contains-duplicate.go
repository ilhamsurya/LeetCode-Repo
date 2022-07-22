/*
 * @lc app=leetcode id=217 lang=golang
 *
 * [217] Contains Duplicate
 */

// @lc code=start
func containsDuplicate(nums []int) bool {
    // HashMap Approach
    // Solution by ilham surya

    // Space: O(n)
	set := make(map[int]bool)

    // Time: O(n)
	for _, num := range nums {
		if _, ok := set[num]; ok {
			return true
		}
		set[num] = true
	}
	return false
}
// @lc code=end

