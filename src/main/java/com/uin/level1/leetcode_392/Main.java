package com.uin.level1.leetcode_392;

/**
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * <p>
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * 输入：s = "abc", t = "ahbgdc"
 * 输出：true
 */
public class Main {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()) return true;
        if (s.length() > t.length()) return false;

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

//        for (int i = 0; i < tt.length; i++) {
//            for (int j = 0; j < ss.length; j++) {
//                if (tt[i] == ss[j]) {
//                    i++;
//                    j++;
//                } else {
//                    j++;
//                }
//            }
//        }

        int i = 0, j = 0;
        for (; i < ss.length && j < tt.length; ) {
            if (ss[i] == tt[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == ss.length) return true;

        return false;
    }
}
