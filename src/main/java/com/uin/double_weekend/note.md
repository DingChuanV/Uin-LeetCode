# Java中的三种移位运算符

- `<<` :左移运算符，num<<1 ,相当于num*2
- `>>` ：右移运算符，num>>1 ,相当于num/2
- `>>>` ：无符号右移，忽略符号位，空位都以0补齐

```java
public class Test {

  public static void main(String[] args) {
    int number = 10;
    //原始数二进制
    printInfo(number);
    number = number << 1;
    //左移一位
    printInfo(number);
    number = number >> 1;
    //右移一位
    printInfo(number);
  }

  /**
   * 输出一个int的二进制数
   * @param num
   */
  private static void printInfo(int num) {
    System.out.println(Integer.toBinaryString(num));
  }
}
```

```text
运行结果：
1010
10100
1010
```

```text
43210      位数
--------
 1010      十进制：10     原始数         number
10100      十进制：20     左移一位       number = number << 1;
 1010      十进制：10     右移一位       number = number >> 1;
``` 

# 位运算

计算机中的数在内存中都是以二进制形式进行存储的，用位运算就是直接对整数在内存中的二进制位进行操作，因此其执行效率非常高，在程序中尽量使用位运算进行操作，这会大大提高程序的性能。

https://www.zhihu.com/question/38206659

## & 与运算

与运算，两个位都是1的时候，才位1，否则为0

```text
 1 0 0 1 1
&1 1 0 0 1
-----------
 1 0 1 0 1
```

## | 或运算 两个位都是 0 时，结果才为 0，否则为 1，

1 0 0 1 1
| 1 1 0 0 1
------------------------------
1 1 0 1 1

## ^ 异或运算，两个位相同则为 0，不同则为 1，如

1 0 0 1 1
^ 1 1 0 0 1
-----------------------------
0 1 0 1 0

## ~ 取反运算，0 则变为 1，1 则变为 0，如

~ 1 0 0 1 1
-----------------------------
0 1 1 0 0

## << 左移运算，向左进行移位操作，高位丢弃，低位补 0，如

int a = 8;
a << 3;
移位前：0000 0000 0000 0000 0000 0000 0000 1000
移位后：0000 0000 0000 0000 0000 0000 0100 0000

## >> 右移运算，向右进行移位操作，对无符号数，高位补 0，对于有符号数，高位补符号位，如

unsigned int a = 8;
a >> 3;
移位前：0000 0000 0000 0000 0000 0000 0000 1000
移位后：0000 0000 0000 0000 0000 0000 0000 0001

int a = -8;
a >> 3;
移位前：1111 1111 1111 1111 1111 1111 1111 1000
移位前：1111 1111 1111 1111 1111 1111 1111 1111


# 常见位运算问题

## 1. 位操作实现乘除法

数 a 向右移一位，相当于将 a 除以 2；数 a 向左移一位，相当于将 a 乘以 2
```text
int a = 2;
a >> 1; ---> 1
a << 1; ---> 4
```
## 2. 位操作交换两数


