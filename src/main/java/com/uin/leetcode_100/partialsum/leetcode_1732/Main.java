package main.java.com.uin.leetcode_100.partialsum.leetcode_1732;

/**
 * 1732. 找到最高海拔
 * 有一个自行车手打算进行一场公路骑行，这条路线总共由 n + 1 个不同海拔的点组成。自行车手从海拔为 0 的点 0 开始骑行。
 * 给你一个长度为 n 的整数数组 gain ，其中 gain[i] 是点 i 和点 i + 1 的 净海拔高度差（0 <= i < n）。请你返回 最高点的海拔 。
 * 示例 1：
 * <p>
 * 输入：gain = [-5,1,5,0,-7]
 * 输出：1
 * 解释：海拔高度依次为 [0,-5,-4,1,1,-6] 。最高海拔为 1 。
 * 示例 2：
 * <p>
 * 输入：gain = [-4,-3,-2,-1,4,3,2]
 * 输出：0
 * 解释：海拔高度依次为 [0,-4,-7,-9,-10,-6,-3,-1] 。最高海拔为 0 。
 * 提示：
 * <p>
 * n == gain.length
 * 1 <= n <= 100
 * -100 <= gain[i] <= 100
 */
public class Main {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int n = gain.length;
//        int[] ans = new int[n + 1];
//        // 自行车手从海拔为 0 的点 0 开始骑行。
//        ans[0] = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < ans.length; j++) {
//                ans[j] += ans[j] + gain[i];
//                i++;
//                j++;
//            }
//        }
//        int asInt = Arrays.stream(ans).max().getAsInt();
//        return asInt;

        int max = 0, sumMax = 0;
        for (int i = 0; i < n; i++) {
            sumMax += gain[i];
            max = Math.max(max, sumMax);
        }
        return max;
    }
}
