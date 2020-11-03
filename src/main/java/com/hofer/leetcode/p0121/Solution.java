package com.hofer.leetcode.p0121;

/**
 * @author hofer.bhf
 * created on 2020/11/3 5:25 下午
 */
public class Solution {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(new Solution().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {

        }
        return 0;
    }
}
