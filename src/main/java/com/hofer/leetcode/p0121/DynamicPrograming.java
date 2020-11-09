package com.hofer.leetcode.p0121;

/**
 * https://www.zhihu.com/question/23995189/answer/613096905
 *
 * @author hofer.bhf
 * created on 2020/11/9 4:45 下午
 */
public class DynamicPrograming {
    public static void main(String[] args) {
        int[] fn = new int[16];
        int n = 15;
        fn[0] = 0;
        for (int i = 1; i <= n; i++) {
            int cost = Integer.MAX_VALUE;
            if (i - 1 >= 0) {
                cost = Math.min(cost, fn[i - 1] + 1);
            }
            if (i - 5 >= 0) {
                cost = Math.min(cost, fn[i - 5] + 1);
            }
            if (i - 11 >= 0) {
                cost = Math.min(cost, fn[i - 11] + 1);
            }
            fn[i] = cost;
            System.out.println("fn[" + i + "]=" + fn[i]);
        }

    }
}
