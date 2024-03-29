package com.uin.jzoffer2.jz03;

import java.util.HashSet;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class Main {
    public int findRepeatNumber(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean add = set.add(num);
            if (add == false) {
                ans = num;
            }
        }
        return ans;
    }
}
