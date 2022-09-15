package com.uin.leetcode_100.array.leetcode_1619;

import java.util.Arrays;

/**
 * 1619.删除某些元素后的数组均值
 * 给你一个整数数组 arr ，请你删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。
 * 与 标准答案 误差在 10-5 的结果都被视为正确结果。
 * 输入：arr = [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]
 * 输出：2.00000
 * 解释：删除数组中最大和最小的元素后，所有元素都等于 2，所以平均值为 2 。
 */
public class Main {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int sum = 0;
        for (int i = n / 20; i < 19 * n / 20; i++) {
            sum += arr[i];
        }
        return sum / (n * 0.9);
    }
}