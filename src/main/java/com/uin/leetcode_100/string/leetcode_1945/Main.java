package com.uin.leetcode_100.string.leetcode_1945;

/**
 * 1945. 字符串转化后的各位数字之和
 * 给你一个由小写字母组成的字符串 s ，以及一个整数 k 。
 * <p>
 * 首先，用字母在字母表中的位置替换该字母，将 s 转化 为一个整数（也就是，'a' 用 1 替换，'b' 用 2 替换，... 'z' 用 26 替换）。接着，将整数 转换 为其 各位数字之和 。共重复 转换 操作 k 次 。
 * <p>
 * 例如，如果 s = "zbax" 且 k = 2 ，那么执行下述步骤后得到的结果是整数 8 ：
 * <p>
 * 转化："zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
 * 转换 #1：262124➝ 2 + 6 + 2 + 1 + 2 + 4➝ 17
 * 转换 #2：17 ➝ 1 + 7 ➝ 8
 * 返回执行上述操作后得到的结果整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "iiii", k = 1
 * 输出：36
 * 解释：操作如下：
 * - 转化："iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
 * - 转换 #1：9999 ➝ 9 + 9 + 9 + 9 ➝ 36
 * 因此，结果整数为 36 。
 * 示例 2：
 * <p>
 * 输入：s = "leetcode", k = 2
 * 输出：6
 * 解释：操作如下：
 * - 转化："leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
 * - 转换 #1：12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
 * - 转换 #2：33 ➝ 3 + 3 ➝ 6
 * 因此，结果整数为 6 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 100
 * 1 <= k <= 10
 * s 由小写英文字母组成
 */
public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(getLucky(s, 2));
    }

    // leetcode
    // 12 5 5 20 3 15 4 5
    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }
        s = sb.toString();
        while (k-- > 0) {
            int t = 0;
            for (char c : s.toCharArray()) {
                t += c - '0';
            }
            s = String.valueOf(t);
        }
        return Integer.parseInt(s);
    }
}
