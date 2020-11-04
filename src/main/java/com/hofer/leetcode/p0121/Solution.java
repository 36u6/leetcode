package com.hofer.leetcode.p0121;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/solution/wu-chong-shi-xian-xiang-xi-tu-jie-121-mai-mai-gu-p/
 *
 * @author hofer.bhf
 * created on 2020/11/3 5:25 下午
 */
public class Solution {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(new Solution().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        //创建两个数组，一个记录每次卖出的最大收益，一个记录每次买入最大收益
        int[] sell = new int[n];
        int[] buy = new int[n];
        //初始化第一天收益
        sell[0] = 0;
        buy[0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            //第i天卖出收益 = max(第i-1天卖出收益，第i-1天买入收益+当天股价)
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
            //第i天买入收益 = max(第i-1天买入收益，-当天股价)
            buy[i] = Math.max(buy[i - 1], -prices[i]);
        }
        return Math.max(sell[n - 1], buy[n - 1]);
    }
}
