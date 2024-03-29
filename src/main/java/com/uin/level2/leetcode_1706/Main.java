package com.uin.level2.leetcode_1706;

/**
 * 1706. 球会落何处
 * 用一个大小为 m x n 的二维网格 grid 表示一个箱子。你有 n 颗球。箱子的顶部和底部都是开着的。
 * <p>
 * 箱子中的每个单元格都有一个对角线挡板，跨过单元格的两个角，可以将球导向左侧或者右侧。
 * <p>
 * 将球导向右侧的挡板跨过左上角和右下角，在网格中用 1 表示。
 * 将球导向左侧的挡板跨过右上角和左下角，在网格中用 -1 表示。
 * 在箱子每一列的顶端各放一颗球。每颗球都可能卡在箱子里或从底部掉出来。如果球恰好卡在两块挡板之间的 "V" 形图案，或者被一块挡导向到箱子的任意一侧边上，就会卡住。
 * <p>
 * 返回一个大小为 n 的数组 answer ，其中 answer[i] 是球放在顶部的第 i 列后从底部掉出来的那一列对应的下标，如果球卡在盒子里，则返回 -1 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/where-will-the-ball-fall
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main {
    public int[] findBall(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] ans = new int[n];

        for (int j = 0; j < n; j++) {
            ans[j] = findExeit(grid, 0, j);
        }
        return ans;
    }

    private int findExeit(int[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i == m) {
            return j;
        }
        if (grid[i][j] == 1) {
            if (j == n - 1 || grid[i][j + 1] == -1) {
                return -1;
            }
            return findExeit(grid, i + 1, j + 1);
        } else {
            if (j == 0 || grid[i][j - 1] == 1) {
                return -1;
            }
            return findExeit(grid, i + 1, j - 1);
        }
    }
}
