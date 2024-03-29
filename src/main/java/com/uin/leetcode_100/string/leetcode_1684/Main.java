package com.uin.leetcode_100.string.leetcode_1684;

/**
 * 1684. 统计一致字符串的数目
 * <p>
 * 给你一个由不同字符组成的字符串allowed和一个字符串数组words。如果一个字符串的每一个字符都在 allowed中，就称这个字符串是 一致字符串 。
 * <p>
 * 请你返回words数组中一致字符串 的数目。
 * <p>
 *
 * <p>
 * 示例 1：
 * <p>
 * 输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * 输出：2
 * 解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
 * 示例 2：
 * <p>
 * 输入：allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * 输出：7
 * 解释：所有字符串都是一致的。
 * 示例 3：
 * <p>
 * 输入：allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * 输出：4
 * 解释：字符串 "cc"，"acd"，"ac" 和 "d" 是一致字符串。
 *
 * <p>
 * 提示：
 * <p>
 * 1 <= words.length <= 104
 * 1 <= allowed.length <= 26
 * 1 <= words[i].length <= 10
 * allowed中的字符 互不相同。
 * words[i] 和allowed只包含小写英文字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/count-the-number-of-consistent-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        System.out.println(helper(allowed, words));
    }

//    public static int countConsistentStrings(String allowed, String[] words) {
//        int res = 0;
//        for (String word : words) {
//            if (allowed.contains(word)) {
//                ++res;
//            }
//        }
//        return res;
//    }

    // 暴力循环查看字母是否在允许的单词内
    public static int helper(String allowed, String[] words) {
        int ans = words.length;
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                // 如果又一个字符不想等 就退出
                if (!allowed.contains(String.valueOf(c))) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
