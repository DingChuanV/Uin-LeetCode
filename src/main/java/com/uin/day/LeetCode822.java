package com.uin.day;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dingchuan
 */
public class LeetCode822 {

  public int flipgame(int[] fronts, int[] backs) {
    // 其中, fronts[i] 和 backs[i] 分别代表第 i 张卡片的正面和背面的数字。

    // 在桌子上有 n 张卡片，每张卡片的正面和背面都写着一个正数（正面与背面上的数有可能不一样）。
    // 我们可以先翻转任意张卡片，然后选择其中一张卡片。
    // 如果选中的那张卡片 背面 的数字 x 与任意一张卡片的 正面 的数字都不同，那么这个数字是我们想要的数字。
    // 哪个数是这些想要的数字中最小的数（找到这些数中的最小值）呢？如果没有一个数字符合要求的，输出 0
    // 如果我们通过翻转卡片来交换正面与背面上的数，那么当初在正面的数就变成背面的数，背面的数就变成正面的数。

    /*
    输入：fronts = [1,2,4,4,7], backs = [1,3,4,1,3]
    输出：2
    解释：假设我们翻转第二张卡片，那么在正面的数变成了 [1,3,4,4,7] ， 背面的数变成了 [1,2,4,1,3]。
    接着我们选择第二张卡片，因为现在该卡片的背面的数是 2，2 与任意卡片上正面的数都不同，所以 2 就是我们想要的数字。
    */

    // 对于 fronts[i]和backs[i] 正面和背面 元素相同 一定是不符合条件的
    // 可以先将 正面和背面 相同的元素 存储在哈希表

    Set<Integer> s = new HashSet<>();
    int n = fronts.length;
    for (int i = 0; i < n; i++) {
      if (fronts[i] == backs[i]) {
        s.add(fronts[i]);
      }
    }

    int ans = 10000;
    for (int front : fronts) {
      if (!s.contains(front)) {
        ans = Math.min(ans, front);
      }
    }
    for (int back : backs) {
      if (!s.contains(back)) {
        ans = Math.min(ans, back);
      }
    }
    return ans % 10000;
  }
}