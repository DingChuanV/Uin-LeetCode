package com.uin.leetcode_100.partialsum.a3;

import java.util.Scanner;

/**
 * 流水潺潺
 * 最近，小七发现了一处干涸的河道。
 * 河道不同的位置高度也不相同，从河道起点到终点有n个位置，这些位置编号为1~n。每一个位置i的高度可以表示为hi(1、n是河道的两端，因此1左边、n右边的高度可以视为无穷大)。
 * 本着环保的精神，小七希望在恰好一个位置注入水源，使得这个位置是有水的。自然地，水会从高处向低处流动，但原来的位置仍然有水。
 * 具体地来说，如果当前一个位置i是有水的，并且有某一个相邻的格子j高度严格小于i(hj < hi)，那么j也会成为有水的，并且i仍然是有水的。对于j相邻的格子也是如此。
 * 现在小七想知道，通过一次注入水源最多可以使得多少个位置变成有水的
 * <p>
 * 第一行一个正整数n(1<=n<=5000)，表示河道有n个位置
 * 第二行n个正整数，第i个表示位置i的高度hi(0<=hi<=1000000000)
 * <p>
 * 5
 * 5 1 2 1 5
 * <p>
 * 3
 * <p>
 * 这道题实际上就是要我们求在哪一个下标处注水会使该下标周围的递减序列最长。类似于雨水问题。
 * 所以，通过从左向右的前缀和计算当前下标处前边连续递减的序列长度，然后通过从右向左的前缀和计算当前下标处后边连续递减的序列长度，然后遍历各个下标，计算最长的长度（长度=左边长度+右边长度-重复计算的自身的长度1）。
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (h[i] > h[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (h[i] > h[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }
        int max = 1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, left[i] + right[i] - 1);
        }
        System.out.println(max);
    }


//    public static void Main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = in.nextInt();
//        }
//        System.out.println(helper(nums));
//    }
//
//    public static int helper(int[] nums) {
//        int len = 1, n = nums.length;
//        if (n == 0) {
//            return 0;
//        }
//
//        int[] d = new int[n + 1];
//        d[len] = nums[0];
//
//        for (int i = 1; i < n; i++) {
//            if (nums[i] < d[len]) {
//                d[len++] = nums[i];
//            } else {
//                int left = 1, right = len, pos = 0;
//                while (left <= right) {
//                    int mid = (left + right) / 2;
//                    if (d[mid] < nums[i]) {
//                        left = mid + 1;
//                    } else {
//                        pos = mid;
//                        right = mid - 1;
//                    }
//                }
//                d[pos + 1] = nums[i];
//            }
//        }
//        return len;
//    }
}
