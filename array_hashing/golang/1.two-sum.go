/*
 * @lc app=leetcode id=1 lang=golang
 *
 * [1] Two Sum
 */

// @lc code=start
func twoSum(nums []int, target int) []int {
    // HashMap Approach
    // Solution by ilham surya 20/07/22

    // Space: O(n)
    hashMap := make(map[int]int)
	
	// Time: O(n)
    for index, num := range nums {
        desired := target - num
        if value, exists := hashMap[desired]; exists {
            return []int{value, index}
        }
        hashMap[num] = index
    }
    return []int{}
}
// @lc code=end

