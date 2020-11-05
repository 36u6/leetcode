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
        if(prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0], maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
