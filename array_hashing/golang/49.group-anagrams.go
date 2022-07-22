/*
 * @lc app=leetcode id=49 lang=golang
 *
 * [49] Group Anagrams
 */
// @lc code=start
func groupAnagrams(strs []string) [][]string {
    // Solution by ilham surya 20/07/22
    // HashMap Approach

    // Space : O(N)
	mp := map[[26]int][]string{}
	for _, s := range strs {
		k := [26]int{}
		for i := 0; i < len(s); i++ {
			k[s[i]-'a'] += 1
		}
		mp[k] = append(mp[k], s)
	}
	res := [][]string{}
	for _, v := range mp {
		res = append(res, v)
	}
	return res
}
// @lc code=end

