# labuladong算法快速突击 力扣题目对照表

# 1.链表

## 1.1双指针

### 1.1.1 双指针技巧秒杀七道链表题目

- [双指针技巧秒杀七道链表题目](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/)

<img src="http://jason243.online/algorithm/labuladong_algo/111.png" />

> 2024.12.23 看完知识点和讲解
>
> 刷完第一次：2024.12.25
>
> **第二次刷题时间预计：2025.1.1 - 2025.1.3**



## 1.2 回文与反转

### 1.1.2 【强化练习】链表双指针经典习题

[【强化练习】链表双指针经典习题](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/)

| [82. 删除排序链表中的重复元素 II](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/#slug_remove-duplicates-from-sorted-list-ii) |
| ------------------------------------------------------------ |
| [1836. 从未排序的链表中移除重复元素](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/#slug_remove-duplicates-from-an-unsorted-linked-list) |
| [264. 丑数 II](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/#slug_ugly-number-ii) <br>额外补充：<br> -[1201. 丑数 III ](https://leetcode.cn/problems/ugly-number-iii)（这道题用多链表合并做int数组会越界，换long或者越界检查都会超时，评论区给的解法是二分查找，后续学了再做）<br>- [263. 丑数 ](https://leetcode.cn/problems/ugly-number)<br>- [313. 超级丑数 ](https://leetcode.cn/problems/super-ugly-number)（这道题有一样的问题，但是换long或者越界检查不会超时，官方的做法也是多链表合并，他们把这种思想叫做“动态规划”） |
| [378. 有序矩阵中第 K 小的元素](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/#slug_kth-smallest-element-in-a-sorted-matrix) |
| [373. 查找和最小的 K 对数字](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/#slug_find-k-pairs-with-smallest-sums) |
| [2. 两数相加](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/#slug_add-two-numbers)<br>额外补充：[67. 二进制求和 ](https://leetcode.cn/problems/add-binary) |
| [445. 两数相加 II](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/#slug_add-two-numbers-ii) |

> 2024.12.25 看完知识点和讲解
>
> 刷完第一次：2024.12.29
>
> **第二次刷题时间预计：2025.1.1 - 2025.1.3**



### 1.2.1 单链表的花式反转方法汇总

[单链表的花式反转方法汇总 | labuladong 的算法笔记](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/)

<img src="http://jason243.online/algorithm/labuladong_algo/121.png" />

> 2024.12.26 看完知识点和讲解
>
> **未刷题**



### 1.2.2 如何判断回文链表

[如何判断回文链表 | labuladong 的算法笔记](https://labuladong.online/algo/data-structure/palindrome-linked-list/)

<img src="http://jason243.online/algorithm/labuladong_algo/122.png" />

> 2024.12.27 看完知识点和讲解
>
> **未刷题**



# 2.数组

## 2.1 双指针

### 2.1.1 双指针技巧秒杀七道数组题目

> 主要分为快慢指针和左右指针

<img src="http://jason243.online/algorithm/labuladong_algo/211.png" />

> 2025.1.2 看完知识点和讲解
>
> **未刷题**



### 2.1.2 【强化练习】数组双指针经典习题

| 1    | [80. 删除有序数组中的重复项 II](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_remove-duplicates-from-sorted-array-ii) |
| ---- | ------------------------------------------------------------ |
| 2    | [125. 验证回文串](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_valid-palindrome) |
| 3    | [75. 颜色分类](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_sort-colors) |
| 4    | [88. 合并两个有序数组](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_merge-sorted-array) |
| 5    | [977. 有序数组的平方](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_squares-of-a-sorted-array) |
| 6    | [360. 有序转化数组](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_sort-transformed-array) |
| 7    | [1329. 将矩阵按对角线排序](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_sort-the-matrix-diagonally) |
| 8    | [1260. 二维网格迁移](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_shift-2d-grid) |
| 9    | [867. 转置矩阵](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_transpose-matrix) |
| 10   | [14. 最长公共前缀](https://labuladong.online/algo/problem-set/array-two-pointers/#slug_longest-common-prefix) |

> 2025.1.5 看完知识点和讲解
>
> **未刷题**



## 2.2滑动窗口

### 2.2.1 滑动窗口算法核心代码模板

<img src="http://jason243.online/algorithm/labuladong_algo/221.png" />

> 还没看



### 2.2.2 【强化练习】滑动窗口算法经典习题

| 1    | [1658. 将 x 减到 0 的最小操作数](https://labuladong.online/algo/problem-set/sliding-window/#slug_minimum-operations-to-reduce-x-to-zero) |
| ---- | ------------------------------------------------------------ |
| 2    | [713. 乘积小于 K 的子数组](https://labuladong.online/algo/problem-set/sliding-window/#slug_subarray-product-less-than-k) |
| 3    | [1004. 最大连续1的个数 III](https://labuladong.online/algo/problem-set/sliding-window/#slug_max-consecutive-ones-iii) |
| 4    | [340. 至多包含 K 个不同字符的最长子串](https://labuladong.online/algo/problem-set/sliding-window/#slug_longest-substring-with-at-most-k-distinct-characters) |
| 5    | [424. 替换后的最长重复字符](https://labuladong.online/algo/problem-set/sliding-window/#slug_longest-repeating-character-replacement) |
| 6    | [219. 存在重复元素 II](https://labuladong.online/algo/problem-set/sliding-window/#slug_contains-duplicate-ii) |
| 7    | [220. 存在重复元素 III](https://labuladong.online/algo/problem-set/sliding-window/#slug_contains-duplicate-iii) |
| 8    | [209. 长度最小的子数组](https://labuladong.online/algo/problem-set/sliding-window/#slug_minimum-size-subarray-sum) |
| 9    | [395. 至少有 K 个重复字符的最长子串](https://labuladong.online/algo/problem-set/sliding-window/#slug_longest-substring-with-at-least-k-repeating-characters) |

> 2025.1.5 看完知识点和讲解
>
> **未刷题**



## 2.3 二分搜索

### 2.3.1 二分搜索算法核心代码模板

<img src="http://jason243.online/algorithm/labuladong_algo/231.png" />

> 还没看



### 2.3.2 实际运用二分搜索时的思维框架

<img src="http://jason243.online/algorithm/labuladong_algo/232.png" />

> 还没看



## 2.4 小而美的算法技巧

### 2.4.1 小而美的算法技巧：前缀和数组

<img src="http://jason243.online/algorithm/labuladong_algo/241.png" />

> 还没看



### 2.4.2 小而美的算法技巧：差分数组

<img src="http://jason243.online/algorithm/labuladong_algo/242.png" />

> 还没看



### 2.4.3 二维数组的花式遍历技巧

<img src="http://jason243.online/algorithm/labuladong_algo/243.png" />

> 还没看