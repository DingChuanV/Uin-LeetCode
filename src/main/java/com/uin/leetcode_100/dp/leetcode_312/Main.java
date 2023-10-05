package main.java.com.uin.leetcode_100.dp.leetcode_312;

public class Main {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int len = n + 2;
        int[] a = new int[len];
        System.arraycopy(nums, 0, a, 1, n);
        a[0] = 1;
        a[len - 1] = 1;

        int[][] dp = new int[len][len];
        /**
         for (int l = 1; l <= n; l++) {
         for (int i = 1; i <= n - l + 1; i++) {
         int j = i + l - 1;
         for (int k = i; k <= j; k++) {
         dp[i][j] = Math.max(dp[i][j], dp[i][k - 1] + dp[k + 1][j] + nums[i - 1] * nums[k] * nums[j + 1]);
         }
         }
         }*/

        for (int gap = 2; gap < len; gap++) {
            for (int left = 0; left < len - gap; left++) {
                int right = left + gap;
                int cur = 0;
                for (int i = left + 1; i < right; i++) {
                    cur = Math.max(cur, dp[left][i] + dp[i][right] + a[i] * a[left] * a[right]);
                }
                dp[left][right] = cur;
            }
        }
        return dp[0][len - 1];
    }
}
