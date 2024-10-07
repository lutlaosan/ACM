//在柠檬水摊上，每一杯柠檬水的售价为 5 美元。顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。 
//
// 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。 
//
// 注意，一开始你手头没有任何零钱。 
//
// 给你一个整数数组 bills ，其中 bills[i] 是第 i 位顾客付的账。如果你能给每位顾客正确找零，返回 true ，否则返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：bills = [5,5,5,10,20]
//输出：true
//解释：
//前 3 位顾客那里，我们按顺序收取 3 张 5 美元的钞票。
//第 4 位顾客那里，我们收取一张 10 美元的钞票，并返还 5 美元。
//第 5 位顾客那里，我们找还一张 10 美元的钞票和一张 5 美元的钞票。
//由于所有客户都得到了正确的找零，所以我们输出 true。
// 
//
// 示例 2： 
//
// 
//输入：bills = [5,5,10,10,20]
//输出：false
//解释：
//前 2 位顾客那里，我们按顺序收取 2 张 5 美元的钞票。
//对于接下来的 2 位顾客，我们收取一张 10 美元的钞票，然后返还 5 美元。
//对于最后一位顾客，我们无法退回 15 美元，因为我们现在只有两张 10 美元的钞票。
//由于不是每位顾客都得到了正确的找零，所以答案是 false。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= bills.length <= 10⁵ 
// bills[i] 不是 5 就是 10 或是 20 
// 
//
// Related Topics贪心 | 数组 
//
// 👍 622, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

/**
 * 柠檬水找零
 * @author ambrose
 * @date 2024-10-06 14:49:00
 */

public class P0860_LemonadeChange{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P0860_LemonadeChange().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean lemonadeChange(int[] bills) {
		int[] ans = new int[3];
		for (int i = 0; i < bills.length; i++) {
			if(bills[i] == 5)
				ans[0]++;
			else if(bills[i] == 10){
				ans[1]++;
				if (--ans[0] < 0)
					return false;
			}
			else if(bills[i] == 20){
				if (ans[1] >= 1 && ans[0] >= 1){
					ans[0]--; ans[1]--;
				}
				else if(ans[0] >= 3){
					ans[0] -= 3;
				}
				else return false;
			}
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}