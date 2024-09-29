//给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。 
//
// 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那
//么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,5,4,7]
//输出：3
//解释：最长连续递增序列是 [1,3,5], 长度为3。
//尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为 5 和 7 在原数组里被 4 隔开。 
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,2,2,2,2]
//输出：1
//解释：最长连续递增序列是 [2], 长度为1。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// Related Topics数组 
//
// 👍 463, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 最长连续递增序列
 * @author ambrose
 * @date 2024-09-29 21:04:46
 */

public class P0674_LongestContinuousIncreasingSubsequence{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0674_LongestContinuousIncreasingSubsequence().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLengthOfLCIS(int[] nums) {
		int ans = 1, len = 0, left = 0;
		for (int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] > nums[i - 1])
				ans = Math.max(ans, i - left + 1);
			else left = i;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}