# 滑动窗口算法思想

滑动窗口算法思想是非常重要的一种思想，可以用来解决数组，字符串的子元素问题。它可以将嵌套循环的问题，转换为单层循环问题，降低时间复杂度，提高效率。

滑动窗口的思想非常简单，它将子数组（子字符串）理解成一个滑动的窗口，然后将这个窗口在数组上滑动，在窗口滑动的过程中，左边会出一个元素，右边会进一个元素，然后只需要计算当前窗口内的元素值即可。

可用滑动窗口思想解决的问题，一般有如下特点：

1. 窗口内元素是连续的。就是说，抽象出来的这个可滑动的窗口，在原数组或字符串上是连续的。
2. 窗口只能由左向右滑动，不能逆过来滑动。就是说，窗口的左右边界，只能从左到右增加，不能减少，即使局部也不可以。

## 算法思路

1. 使用双指针中的左右指针技巧，初始化 left = right = 0，把索引闭区间 [left, right] 称为一个「窗口」。
2. 先不断地增加 right 指针扩大窗口 [left, right]，直到窗口符合要求
3. 停止增加 right，转而不断增加 left 指针缩小窗口 [left, right]，直到窗口中的字符串不再符合要求。同时，每次增加 left，我们都要更新一轮结果。
4. 重复第 2 和第 3 步，直到 right 到达尽头。

代码模板：
```text
int left ,right=0 , 0;

//
```
