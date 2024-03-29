package com.uin.leetcode_100.array.LeetCode_46;

import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) return res;
        Deque<Integer> path = new ArrayDeque<Integer>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    /**
     * 状态变量
     *
     * @param nums
     * @param len
     * @param depth 表示当前递归了那一层
     * @param path  已经选到了那些数
     * @param used
     * @param res
     * @author wanglufei
     * @date 2022/7/22 4:21 PM
     */
    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used,
                     List<List<Integer>> res) {
        //递归终止的条件
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (used[i]) continue;
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, path, used, res);
            //到上一层 回溯 逆操作
            path.removeLast();
            used[i] = false;
        }
    }
}
