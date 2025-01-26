# labuladong算法快速突击 力扣题目对照表

# 1. [链表](https://labuladong.online/algo/intro/quick-learning-plan/#链表)

## 1.1双指针

链表相关的题目套路比较固定，主要是双指针技巧。

### 1.1.1 双指针技巧秒杀七道链表题目

> 核心框架，建议用时 1 天
>
> - [双指针技巧秒杀七道链表题目](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/)

<img src="http://jason243.online/algorithm/labuladong_algo/111.png" />

> 2024.12.23 看完知识点和讲解
>
> 刷完第一次：2024.12.25
>
> **第二次刷题时间预计：2025.1.1 - 2025.1.3**



### 1.1.2 【强化练习】链表双指针经典习题

> 习题，建议用时 1 天
>
> - [【强化练习】链表双指针经典习题](https://labuladong.online/algo/problem-set/linkedlist-two-pointers/)

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



## 1.2 回文与反转

单链表的一个进阶技巧是递归操作单链表，不过这种思路一般用于面试时说一下就行，笔试时就用标准的指针操作即可。

> 核心框架，建议用时 1 天
>
> - [如何判断回文链表](https://labuladong.online/algo/data-structure/palindrome-linked-list/)
> - [单链表的花式反转方法汇总](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/)

### 1.2.1 单链表的花式反转方法汇总

<img src="http://jason243.online/algorithm/labuladong_algo/121.png" />

> 2024.12.26 看完知识点和讲解
>
> **未刷题**



### 1.2.2 如何判断回文链表

<img src="http://jason243.online/algorithm/labuladong_algo/122.png" />

> 2024.12.27 看完知识点和讲解
>
> **未刷题**



# 2. [数组](https://labuladong.online/algo/intro/quick-learning-plan/#数组)

## 2.1 双指针

数组相关的技巧也主要是双指针，只不过可以分为快慢指针、左右指针几种不同的类型。经典的数组双指针算法有二分搜索、滑动窗口。

有些读者问我为什么不出字符串算法的专题，因为字符串就是字符数组，字符串算法本质上还是数组算法。



### 2.1.1 双指针技巧秒杀七道数组题目

**主要分为快慢指针和左右指针**

> 核心框架，建议用时 0.5 天
>
> - [双指针技巧秒杀七道数组题目](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/)

<img src="http://jason243.online/algorithm/labuladong_algo/211.png" />

> 2025.1.2 看完知识点和讲解
>
> **未刷题**



### 2.1.2 二维数组的花式遍历技巧

> 习题，建议用时 1~2 天
>
> - [二维数组的花式遍历技巧](https://labuladong.online/algo/practice-in-action/2d-array-traversal-summary/)

<img src="http://jason243.online/algorithm/labuladong_algo/243.png" />

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



### 2.1.3 【强化练习】数组双指针经典习题

> 习题，建议用时 1~2 天
>
> - [【强化练习】数组双指针经典习题](https://labuladong.online/algo/problem-set/array-two-pointers/)

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

#### 2.2.1.1 模板跳转链接

> 核心框架，建议用时 1 天
>
> - [滑动窗口算法核心代码模板](https://labuladong.online/algo/essential-technique/sliding-window-framework/)
>
>   [滑动窗口代码模板（伪码）]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#数组))

<img src="http://jason243.online/algorithm/labuladong_algo/221.png" />

> 2025.1.9 看完知识点和讲解
>
> **未刷题**



### 2.2.2 【强化练习】滑动窗口算法经典习题

> 习题，建议用时 1 天
>
> - [【强化练习】滑动窗口算法经典习题](https://labuladong.online/algo/problem-set/sliding-window/)

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

> 2025.1.9 看完知识点和讲解
>
> **未刷题**



## 2.3 二分搜索

> 核心框架，建议用时 1~2 天
>
> - [二分搜索算法核心代码模板](https://labuladong.online/algo/essential-technique/binary-search-framework/)
>
> - [实际运用二分搜索时的思维框架](https://labuladong.online/algo/frequency-interview/binary-search-in-action/)
>
>   [二分搜索三种代码模板]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#数组))

#### 2.3.0.1 模板跳转链接

### 2.3.1 二分搜索算法核心代码模板

<img src="http://jason243.online/algorithm/labuladong_algo/231.png" />

> 代码模板总结笔记见同级目录下文件 "labuladong-数组二分查找代码模板.md"
>
> 2025.1.8 看完知识点和讲解
>
> **未刷题**



### 2.3.2 实际运用二分搜索时的思维框架

<img src="http://jason243.online/algorithm/labuladong_algo/232.png" />

> 代码模板总结笔记见同级目录下文件 "labuladong-数组二分查找代码模板.md"
>
> 2025.1.8 看完知识点和讲解
>
> **未刷题**







## 2.4 小而美的算法技巧

> 核心框架，建议用时 1~2 天
>
> - [小而美的算法技巧：前缀和数组](https://labuladong.online/algo/data-structure/prefix-sum/)
>
> - [小而美的算法技巧：差分数组](https://labuladong.online/algo/data-structure/diff-array/)
>
>   [前缀和数组代码模板]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#数组))
>
>   [差分数组代码模板]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#数组))

#### 2.4.0.1 模板跳转链接

### 2.4.1 小而美的算法技巧：前缀和数组

<img src="http://jason243.online/algorithm/labuladong_algo/241.png" />

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



### 2.4.2 小而美的算法技巧：差分数组

<img src="http://jason243.online/algorithm/labuladong_algo/242.png" />

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



# 3. [队列/栈](https://labuladong.online/algo/intro/quick-learning-plan/#队列-栈)

队列和栈本身是比较简单的数据结构，但是它们在算法题中的运用需要专门练习。

## 3.1 简单的队列与栈

### 3.1.1 队列实现栈以及栈实现队列

> 核心框架，建议用时 0.5 天
>
> - [队列实现栈以及栈实现队列](https://labuladong.online/algo/data-structure/stack-queue/)

<img src="http://jason243.online/algorithm/labuladong_algo/311.png" />

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



### 3.1.2 【强化练习】栈的经典习题

> 习题，建议用时 1 天
>
> - [【强化练习】栈的经典习题](https://labuladong.online/algo/problem-set/stack/)

| 1    | [71. 简化路径](https://labuladong.online/algo/problem-set/stack/#slug_simplify-path) |
| ---- | ------------------------------------------------------------ |
| 2    | [143. 重排链表](https://labuladong.online/algo/problem-set/stack/#slug_reorder-list)<br>类似题目：[剑指 Offer II 026. 重排链表](https://leetcode.cn/problems/LGjMqU) |
| 3    | [20. 有效的括号](https://labuladong.online/algo/problem-set/stack/#slug_valid-parentheses) |
| 4    | [150. 逆波兰表达式求值](https://labuladong.online/algo/problem-set/stack/#slug_evaluate-reverse-polish-notation)<br>类似题目：[剑指 Offer II 036. 后缀表达式](https://leetcode.cn/problems/8Zf90G) |
| 5    | [225. 用队列实现栈](https://labuladong.online/algo/problem-set/stack/#slug_implement-stack-using-queues)<br>类似题目：<br>[232. 用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks)<br>[剑指 Offer 09. 用两个栈实现队列](https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof) |
| 6    | [388. 文件的最长绝对路径](https://labuladong.online/algo/problem-set/stack/#slug_longest-absolute-file-path) |
| 7    | [155. 最小栈](https://labuladong.online/algo/problem-set/stack/#slug_min-stack)<br/>类似题目：<br/>[239. 滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum)<br>[剑指 Offer 59 - I. 滑动窗口的最大值](https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof)<br>[剑指 Offer 30. 包含min函数的栈](https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof) |
| 8    | [895. 最大频率栈](https://labuladong.online/algo/problem-set/stack/#slug_maximum-frequency-stack) |

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



### 3.1.3 【强化练习】队列的经典习题

> 习题，建议用时 1 天
>
> - [【强化练习】栈的经典习题](https://labuladong.online/algo/problem-set/stack/)
> - [【强化练习】队列的经典习题](https://labuladong.online/algo/problem-set/queue/)

| 1    | [362. 敲击计数器](https://labuladong.online/algo/problem-set/queue/#slug_design-hit-counter) |
| ---- | ------------------------------------------------------------ |
| 2    | [933. 最近的请求次数](https://labuladong.online/algo/problem-set/queue/#slug_number-of-recent-calls)<br/>类似题目：[剑指 Offer II 042. 最近请求次数](https://leetcode.cn/problems/H8086Q) |
| 3    | [346. 数据流中的移动平均值](https://labuladong.online/algo/problem-set/queue/#slug_moving-average-from-data-stream)<br/>相似题目：[剑指 Offer II 041. 滑动窗口的平均值](https://leetcode.cn/problems/qIsx9U) |
| 4    | [622. 设计循环队列](https://labuladong.online/algo/problem-set/queue/#slug_design-circular-queue) |
| 5    | [641. 设计循环双端队列](https://labuladong.online/algo/problem-set/queue/#slug_design-circular-deque) |
| 6    | [1670. 设计前中后队列](https://labuladong.online/algo/problem-set/queue/#slug_design-front-middle-back-queue) |
| 7    | [2073. 买票需要的时间](https://labuladong.online/algo/problem-set/queue/#slug_time-needed-to-buy-tickets) |

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



## 3.2 单调栈与单调队列 （1天）

单调栈和单调队列是基于栈和队列的两种变体，它们能够解决一些特殊的问题，需要掌握。

### 3.2.1 单调栈算法模板解决三道例题

### 3.2.2 【强化练习】单调栈的几种变体及经典习题

> 核心框架，建议用时 1~2 天
>
> - [单调栈算法模板解决三道例题](https://labuladong.online/algo/data-structure/monotonic-stack/)
> - [单调队列结构解决滑动窗口问题](https://labuladong.online/algo/data-structure/monotonic-queue/)

①解决三道例题

<img src="http://jason243.online/algorithm/labuladong_algo/321.png" />

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



②解决滑动窗口问题

<img src="http://jason243.online/algorithm/labuladong_algo/323.png" />

> 2025.1.15 看完知识点和讲解
>
> **未刷题**



### 3.2.3 单调队列结构解决滑动窗口问题

### 3.2.4 【强化练习】单调队列的通用实现及经典习题

> 习题，建议用时 1~2 天
>
> - [【强化练习】单调栈的几种变体及经典习题](https://labuladong.online/algo/problem-set/monotonic-stack/)
> - [【强化练习】单调队列的通用实现及经典习题](https://labuladong.online/algo/problem-set/monotonic-queue/)



①单调栈几种变体

| 1    | [单调栈模板的变体](https://labuladong.online/algo/problem-set/monotonic-stack/#单调栈模板的变体) |
| ---- | ------------------------------------------------------------ |
| 2    | [1019. 链表中的下一个更大节点](https://labuladong.online/algo/problem-set/monotonic-stack/#slug_next-greater-node-in-linked-list) |
| 3    | [1944. 队列中可以看到的人数](https://labuladong.online/algo/problem-set/monotonic-stack/#slug_number-of-visible-people-in-a-queue) |
| 4    | [1475. 商品折扣后的最终价格](https://labuladong.online/algo/problem-set/monotonic-stack/#slug_final-prices-with-a-special-discount-in-a-shop) |
| 5    | [901. 股票价格跨度](https://labuladong.online/algo/problem-set/monotonic-stack/#slug_online-stock-span) |
| 6    | [402. 移掉 K 位数字](https://labuladong.online/algo/problem-set/monotonic-stack/#slug_remove-k-digits) |
| 7    | [853. 车队](https://labuladong.online/algo/problem-set/monotonic-stack/#slug_car-fleet) |
| 8    | [581. 最短无序连续子数组](https://labuladong.online/algo/problem-set/monotonic-stack/#slug_shortest-unsorted-continuous-subarray) |

> 2025.1.16 看完知识点和讲解
>
> **未刷题**



②单调队列通用实现

| 1    | [通用实现](https://labuladong.online/algo/problem-set/monotonic-queue/#通用实现) |
| ---- | ------------------------------------------------------------ |
| 2    | [单调队列 + 滑动窗口](https://labuladong.online/algo/problem-set/monotonic-queue/#单调队列-滑动窗口) |
| 3    | [1438. 绝对差不超过限制的最长连续子数组](https://labuladong.online/algo/problem-set/monotonic-queue/#slug_longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |
| 4    | [862. 和至少为 K 的最短子数组](https://labuladong.online/algo/problem-set/monotonic-queue/#slug_shortest-subarray-with-sum-at-least-k) |
| 5    | [918. 环形子数组的最大和](https://labuladong.online/algo/problem-set/monotonic-queue/#slug_maximum-sum-circular-subarray) |
| 6    | [单调队列 + 动态规划（选学）](https://labuladong.online/algo/problem-set/monotonic-queue/#单调队列-动态规划-选学) |
| 7    | [1696. 跳跃游戏 VI](https://labuladong.online/algo/problem-set/monotonic-queue/#slug_jump-game-vi) |
| 8    | [1425. 带限制的子序列和](https://labuladong.online/algo/problem-set/monotonic-queue/#slug_constrained-subsequence-sum)<br/>类似题目：<br>[1696. 跳跃游戏 VI ](https://leetcode.cn/problems/jump-game-vi)<br>[209. 长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum)<br>[剑指 Offer II 008. 和大于等于 target 的最短子数组](https://leetcode.cn/problems/2VG8Kg) |
| 9    | [1429. 第一个唯一数字](https://labuladong.online/algo/problem-set/monotonic-queue/#slug_first-unique-number) |

> 2025.1.16 后三题选学所以还没看
>
> **未刷题**





# 4. [二叉树](https://labuladong.online/algo/intro/quick-learning-plan/#二叉树-1) （2天）

所有递归算法的本质上都是二叉树的遍历，而且二叉树算法经常出现在面试/笔试中，所以二叉树章节我多放几篇文章，希望大家认真学习理解，亲自动手实践。

## 4.1 二叉树核心框架1：核心纲领

> 核心框架，建议用时 1 天
>
> 这篇核心纲领是一个总纲，主要有两部分内容：第一部分是如何在实际的算法题中理解二叉树的前中后序位置；第二部分是从二叉树的角度介绍回溯/动态规划等算法。
>
> 现在你已经给了解二叉树遍历算法，所以请认真学习第一部分。第二部分降到的高级算法目前还没有学习，你只要有个印象就行了，等到后面学习了回溯/动态规划再回来看就会有更深的理解。
>
> - [二叉树系列算法核心纲领](https://labuladong.online/algo/essential-technique/binary-tree-summary/)

<img src="http://jason243.online/algorithm/labuladong_algo/411.png" />

> 2025.1.17 看完知识点和讲解
>
> **未刷题**



## 4.2 二叉树核心框架2：心法

> 核心框架，建议用时 2~3 天
>
> 这几篇教程中的例题是必知必会的二叉树经典考题，需要学习掌握。
>
> - [二叉树心法（思路篇）](https://labuladong.online/algo/data-structure/binary-tree-part1/)
> - [二叉树心法（构造篇）](https://labuladong.online/algo/data-structure/binary-tree-part2/)
> - [二叉树心法（序列化篇）](https://labuladong.online/algo/data-structure/serialize-and-deserialize-binary-tree/)

### 4.2.1 思路篇

<img src="http://jason243.online/algorithm/labuladong_algo/421.png" />

> 2025.1.23 看完知识点和讲解
>
> **未刷题**



### 4.2.2 构造篇

<img src="http://jason243.online/algorithm/labuladong_algo/422.png" />

> 2025.1.23 看完知识点和讲解
>
> **未刷题**



### 4.2.3 序列化篇

<img src="http://jason243.online/algorithm/labuladong_algo/423.png" />

> 2025.1.23 看完知识点和讲解
>
> **未刷题**



## 4.3 二叉树解题方法拓展

> 习题，建议用时 1 天
>
> - [拓展：最近公共祖先系列解题框架](https://labuladong.online/algo/practice-in-action/lowest-common-ancestor-summary/)
> - [拓展：如何计算完全二叉树的节点数](https://labuladong.online/algo/data-structure/count-complete-tree-nodes/)

### 4.3.1 最近公共祖先阶梯框架

<img src="http://jason243.online/algorithm/labuladong_algo/431.png" />

> 2025.1.23 看完知识点和讲解
>
> **未刷题**



### 4.3.2 计算完全二叉树节点数

<img src="http://jason243.online/algorithm/labuladong_algo/432.png" />

> 2025.1.23 看完知识点和讲解
>
> **未刷题**



## 4.4 二叉树习题集

> 习题，建议用时 2 天
>
> 我非常强调二叉树相关算法题的重要性，因为算法的本质是穷举，树结构是所有暴力穷举算法的核心抽象。你把二叉树玩明白了，后面的高级算法都能很容易理解。
>
> 本站的 [二叉树算法习题集](https://labuladong.online/algo/intro/binary-tree-practice/) 专门用一整个章节近 100 道题来练习二叉树算法，依照 [二叉树算法（纲领篇）](https://labuladong.online/algo/essential-technique/binary-tree-summary/) 的分类，把二叉树的习题分为三大部分：
>
> 1、递归，用「遍历」的思维模式解题。
>
> 2、递归，用「分级问题」的思维模式解题。
>
> 3、非递归，用「层序遍历」的思维模式解题。
>
> 其中「遍历」的思维模式就是后面讲的 DFS 算法、回溯算法的原型，「分解问题」的思维模式就是后面讲的动态规划、分治算法的原型，「层序遍历」就是后面讲的 BFS 算法的原型。
>
> 所以这里必须要对这几种二叉树算法进行练习。[二叉树算法习题集](https://labuladong.online/algo/intro/binary-tree-practice/) 总量比较多，下面仅为速成读者列出难度适中且考察频率高的习题：
>
> - [【强化练习】用「遍历」思维解题 I](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/)
> - [【强化练习】用「分解问题」思维解题 I](https://labuladong.online/algo/problem-set/binary-tree-divide-i/)
> - [【强化练习】运用层序遍历解题 I](https://labuladong.online/algo/problem-set/binary-tree-level-i/)
>
> 如果你有时间和兴趣，可以自行查看其他习题章节进行练习。

### 4.4.1 遍历思维解题

| 1    | [257. 二叉树的所有路径](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_binary-tree-paths) |
| ---- | ------------------------------------------------------------ |
| 2    | [129. 求根节点到叶节点数字之和](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_sum-root-to-leaf-numbers)<br>类似题目：[剑指 Offer II 049. 从根节点到叶节点的路径数字之和](https://leetcode.cn/problems/3Etpl5) |
| 3    | [199. 二叉树的右视图](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_binary-tree-right-side-view)<br/>类似题目：<br>[662. 二叉树最大宽度 ](https://leetcode.cn/problems/maximum-width-of-binary-tree)<br>[剑指 Offer II 046. 二叉树的右侧视图](https://leetcode.cn/problems/WNC0Lk) |
| 4    | [298. 二叉树最长连续序列](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_binary-tree-longest-consecutive-sequence) |
| 5    | [988. 从叶结点开始的最小字符串](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_smallest-string-starting-from-leaf) |
| 6    | [1022. 从根到叶的二进制数之和](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_sum-of-root-to-leaf-binary-numbers) |
| 7    | [1457. 二叉树中的伪回文路径](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_pseudo-palindromic-paths-in-a-binary-tree) |
| 8    | [1740. 找到二叉树中的距离](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_find-distance-in-a-binary-tree) |
| 9    | [1257. 最小公共区域](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/#slug_smallest-common-region) |

> 2025.1.25 看完知识点和讲解
>
> **未刷题**



### 4.4.2 分解思维解题

| 1    | [105. 从前序与中序遍历序列构造二叉树](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_construct-binary-tree-from-preorder-and-inorder-traversal) |
| ---- | ------------------------------------------------------------ |
| 2    | [106. 从中序与后序遍历序列构造二叉树](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_construct-binary-tree-from-inorder-and-postorder-traversal) |
| 3    | [889. 根据前序和后序遍历构造二叉树](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_construct-binary-tree-from-preorder-and-postorder-traversal) |
| 4    | [331. 验证二叉树的前序序列化](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_verify-preorder-serialization-of-a-binary-tree) |
| 5    | [426. 将二叉搜索树转化为排序的双向链表](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_convert-binary-search-tree-to-sorted-doubly-linked-list) |
| 6    | [894. 所有可能的满二叉树](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_all-possible-full-binary-trees) |
| 7    | [998. 最大二叉树 II](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_maximum-binary-tree-ii) |
| 8    | [1110. 删点成林](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_delete-nodes-and-return-forest) |
| 9    | [1485. 克隆含随机指针的二叉树](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_clone-binary-tree-with-random-pointer) |
| 10   | [1660. 纠正二叉树](https://labuladong.online/algo/problem-set/binary-tree-divide-i/#slug_correct-a-binary-tree) |

> 2025.1.27 看完知识点和讲解
>
> **未刷题**



### 4.4.3  层序遍历方法解题

| 1    | [102. 二叉树的层序遍历](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_binary-tree-level-order-traversal) |
| ---- | ------------------------------------------------------------ |
| 2    | [107. 二叉树的层序遍历 II](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_binary-tree-level-order-traversal-ii) |
| 3    | [103. 二叉树的锯齿形层序遍历](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_binary-tree-zigzag-level-order-traversal) |
| 4    | [117. 填充每个节点的下一个右侧节点指针 II](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_populating-next-right-pointers-in-each-node-ii) |
| 5    | [662. 二叉树最大宽度](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_maximum-width-of-binary-tree) |
| 6    | [515. 在每个树行中找最大值](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_find-largest-value-in-each-tree-row) |
| 7    | [637. 二叉树的层平均值](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_average-of-levels-in-binary-tree) |
| 8    | [958. 二叉树的完全性检验](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_check-completeness-of-a-binary-tree) |
| 9    | [1161. 最大层内元素和](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_maximum-level-sum-of-a-binary-tree) |
| 10   | [1302. 层数最深叶子节点的和](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_deepest-leaves-sum) |
| 11   | [1609. 奇偶树](https://labuladong.online/algo/problem-set/binary-tree-level-i/#slug_even-odd-tree) |

> 2025.1.27 看完知识点和讲解
>
> **未刷题**



# 5. [二叉搜索树](https://labuladong.online/algo/intro/quick-learning-plan/#二叉搜索树-1)（1天）

二叉搜索树是特殊的二叉树，你就记住它的特点是「左小右大」，好好利用这个特点，来优化二叉树的遍历过程。

> 核心框架，建议用时 1~2 天
>
> - [二叉搜索树心法（特性篇）](https://labuladong.online/algo/data-structure/bst-part1/)
> - [二叉搜索树心法（基操篇）](https://labuladong.online/algo/data-structure/bst-part2/)

> 核心框架，建议用时 1 天
>
> - [二叉搜索树心法（构造篇）](https://labuladong.online/algo/data-structure/bst-part3/)





# 6. [数据结构设计](https://labuladong.online/algo/intro/quick-learning-plan/#数据结构设计-1)（1天）

LRU 是经典的数据结构设计问题，必须掌握；LFU 难度更大一些，可以作为选学。

> 习题，建议用时 1 天
>
> - [算法就像搭乐高：手撸 LRU 算法](https://labuladong.online/algo/data-structure/lru-cache/)
> - [算法就像搭乐高：手撸 LFU 算法（选学）](https://labuladong.online/algo/frequency-interview/lfu/)

> 习题，建议用时 1 天
>
> 实现计算器是一个经典的数据结构设计题目，没时间的话可以把最后给出的计算器代码保存下来，如果笔试遇到字符串计算相关的题目，可以直接复制粘贴拿去用。
>
> - [拓展：如何实现一个计算器](https://labuladong.online/algo/data-structure/implement-calculator/)
>
>   [模板：通用计算器代码实现（跳转到原网址查看）]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#数据结构设计-1))

> 习题，建议用时 1 天
>
> - [【强化练习】更多经典设计习题](https://labuladong.online/algo/problem-set/ds-design/)





# 7. [图算法](https://labuladong.online/algo/intro/quick-learning-plan/#图算法)（2天）

环检测、拓扑排序、二分图判定是经典的图算法，本质上就是对图的遍历，并不难掌握。

> 核心框架，建议用时 1~2 天
>
> - [环检测及拓扑排序算法](https://labuladong.online/algo/data-structure/topological-sort/)
> - [二分图判定算法](https://labuladong.online/algo/data-structure/bipartite-graph/)

Union Find 算法是比较实用的图算法，你需要大致了解它的原理和 API。如果没有时间仔细阅读，可以把最后给出的 `UF` 类保存下来，笔试时可以直接拿去用。

> 核心框架，建议用时 1 天
>
> - [Union Find 并查集原理](https://labuladong.online/algo/data-structure-basic/union-find-basic/)
>
> - [Union-Find 并查集算法](https://labuladong.online/algo/data-structure/union-find/)
>
>   [Union Find 代码模板]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#图算法))



你需要知道最小生成树的定义。Kruskal 和 Prim 是两种经典的最小生成树算法，可以了解下 Kruskal 算法，因为它其实就是 Union Find 算法 + 排序，比较简单。

> 核心框架，建议用时 1 天
>
> - [Kruskal 最小生成树算法](https://labuladong.online/algo/data-structure/kruskal/)

Dijkstra 最短路径算法属于经典图论算法，需要掌握。它的本质就经过改良的二叉树 BFS 算法，你可以把模板保存下来，以便笔试时快速运用。

> 核心框架，建议用时 1 天
>
> - [Dijkstra 算法模板](https://labuladong.online/algo/data-structure/dijkstra/)
>
> - [Dijkstra 算法习题](https://labuladong.online/algo/problem-set/dijkstra/)
>
>   [Dijkstra 算法模板（伪码）]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#图算法))





# 8. [DFS/回溯算法](https://labuladong.online/algo/intro/quick-learning-plan/#dfs-回溯算法-1)（2天）

回溯算法是一种纯粹的暴力穷举算法，必须掌握。

因为笔试时是按照通过的测试用例数量来算分的，如果有些题目你实在写不出最优解，写一个回溯算法暴力穷举一下，虽然过不了所有测试用例，但是能过一部分，也能捞到一点分数。

下面列举的文章中的例题都是经典的回溯算法题目，必知必会，一定要透彻地掌握。

> 核心框架，建议用时 1~2 天
>
> - [回溯算法解题套路框架](https://labuladong.online/algo/essential-technique/backtrack-framework/)
> - [回溯算法实践：数独和 N 皇后问题](https://labuladong.online/algo/practice-in-action/sudoku-nqueue/)

> 核心框架，建议用时 1~2 天
>
> - [回溯算法秒杀所有排列/组合/子集问题](https://labuladong.online/algo/essential-technique/permutation-combination-subset-all-in-one/)

> 核心框架，建议用时 1 天
>
> 这篇文章讲的是 DFS 算法：
>
> - [一文秒杀所有岛屿题目](https://labuladong.online/algo/frequency-interview/island-dfs-summary/)
>
> DFS 算法和回溯算法有一点点区别，这篇文章介绍，并给出一些代码风格的建议：
>
> - [回答 DFS 和回溯算法的若干疑问](https://labuladong.online/algo/essential-technique/backtrack-vs-dfs/)

> 习题，建议用时 2 天
>
> 大部分回溯算法的本质就是排列组合，你把 [回溯算法秒杀所有排列/组合/子集问题](https://labuladong.online/algo/essential-technique/permutation-combination-subset-all-in-one/) 想明白，很多回溯题目都可以直接秒。
>
> 本站的回溯算法习题章节如下：
>
> - [【强化练习】回溯算法经典习题 I](https://labuladong.online/algo/problem-set/backtrack-i/)
> - [【强化练习】回溯算法经典习题 II](https://labuladong.online/algo/problem-set/backtrack-ii/)
> - [【强化练习】回溯算法经典习题 III](https://labuladong.online/algo/problem-set/backtrack-iii/)
>
> 不过习题章节的题目比较多，如果你有时间可以都看一看，时间紧的话我帮你精选几道。建议安装 [Chrome 插件](https://labuladong.online/algo/intro/chrome/)，在题目页面可以查看本站的思路和解法代码：
>
> |                           LeetCode                           |                             力扣                             | 难度 |
> | :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
> | [967. Numbers With Same Consecutive Differences](https://leetcode.com/problems/numbers-with-same-consecutive-differences/?show=1) | [967. 连续差相同的数字](https://leetcode.cn/problems/numbers-with-same-consecutive-differences/?show=1) |  中  |
> | [491. Non-decreasing Subsequences](https://leetcode.com/problems/non-decreasing-subsequences/?show=1) | [491. 递增子序列](https://leetcode.cn/problems/non-decreasing-subsequences/?show=1) |  中  |
> | [980. Unique Paths III](https://leetcode.com/problems/unique-paths-iii/?show=1) | [980. 不同路径 III](https://leetcode.cn/problems/unique-paths-iii/?show=1) |  难  |
> | [131. Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/?show=1) | [131. 分割回文串](https://leetcode.cn/problems/palindrome-partitioning/?show=1) |  中  |
> | [93. Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/?show=1) | [93. 复原 IP 地址](https://leetcode.cn/problems/restore-ip-addresses/?show=1) |  中  |
> | [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/?show=1) | [17. 电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/?show=1) |  中  |
> | [79. Word Search](https://leetcode.com/problems/word-search/?show=1) | [79. 单词搜索](https://leetcode.cn/problems/word-search/?show=1) |  中  |





# 9. [BFS 算法](https://labuladong.online/algo/intro/quick-learning-plan/#bfs-算法-1)（1天）

BFS 也是一种暴力穷举算法，必须掌握。它的本质就是二叉树的层序遍历，适合解决最短路径问题。

> 核心框架，建议用时 1 天
>
> - [BFS 算法解题套路框架](https://labuladong.online/algo/essential-technique/bfs-framework/)

> 习题，建议用时 2 天
>
> 本站的 BFS 习题章节如下：
>
> - [【强化练习】BFS 经典习题 I](https://labuladong.online/algo/problem-set/bfs/)
> - [【强化练习】BFS 经典习题 II](https://labuladong.online/algo/problem-set/bfs-ii/)
>
> 不过这两章习题比较多，如果你有时间可以都刷完，时间紧的话我帮你精选几道做一做。建议安装 [Chrome 插件](https://labuladong.online/algo/intro/chrome/)，在题目页面可以查看本站的思路和解法代码：
>
> |                           LeetCode                           |                             力扣                             | 难度 |
> | :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
> | [919. Complete Binary Tree Inserter](https://leetcode.com/problems/complete-binary-tree-inserter/?show=1) | [919. 完全二叉树插入器](https://leetcode.cn/problems/complete-binary-tree-inserter/?show=1) |  中  |
> | [841. Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/?show=1) | [841. 钥匙和房间](https://leetcode.cn/problems/keys-and-rooms/?show=1) |  中  |
> | [433. Minimum Genetic Mutation](https://leetcode.com/problems/minimum-genetic-mutation/?show=1) | [433. 最小基因变化](https://leetcode.cn/problems/minimum-genetic-mutation/?show=1) |  中  |
> | [1926. Nearest Exit from Entrance in Maze](https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/?show=1) | [1926. 迷宫中离入口最近的出口](https://leetcode.cn/problems/nearest-exit-from-entrance-in-maze/?show=1) |  中  |
> | [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/?show=1) | [1091. 二进制矩阵中的最短路径](https://leetcode.cn/problems/shortest-path-in-binary-matrix/?show=1) |  中  |
> | [994. Rotting Oranges](https://leetcode.com/problems/rotting-oranges/?show=1) | [994. 腐烂的橘子](https://leetcode.cn/problems/rotting-oranges/?show=1) |  中  |
> | [721. Accounts Merge](https://leetcode.com/problems/accounts-merge/?show=1) | [721. 账户合并](https://leetcode.cn/problems/accounts-merge/?show=1) |  中  |
> | [127. Word Ladder](https://leetcode.com/problems/word-ladder/?show=1) | [127. 单词接龙](https://leetcode.cn/problems/word-ladder/?show=1) |  难  |
> | [365. Water and Jug Problem](https://leetcode.com/problems/water-and-jug-problem/?show=1) | [365. 水壶问题](https://leetcode.cn/problems/water-and-jug-problem/?show=1) |  中  |





# 10. [动态规划](https://labuladong.online/algo/intro/quick-learning-plan/#动态规划-1)（2天）

动态规划本质上也是暴力穷举，只不过有些问题的穷举过程中存在重叠子问题，所以可以通过备忘录进行优化，对于这类算法，我们通常称为动态规划算法。

动态规划的暴力穷举解法一般是递归形式，优化方法非常固定，要么就是添加备忘录，要么就是改写成迭代形式。

动态规划的难点在于那个暴力解（状态转移方程）怎么写，请你阅读下面的文章，尤其注意得到状态转移方程的思维过程。

> 核心框架，建议用时 1~2 天
>
> - [动态规划解题套路框架](https://labuladong.online/algo/essential-technique/dynamic-programming-framework/)
> - [动态规划设计：最长递增子序列](https://labuladong.online/algo/dynamic-programming/longest-increasing-subsequence/)

> 核心框架，建议用时 1~2 天
>
> - [base case 和备忘录的初始值怎么定？](https://labuladong.online/algo/dynamic-programming/memo-fundamental/)
> - [最优子结构原理和 dp 数组遍历方向](https://labuladong.online/algo/dynamic-programming/faq-summary/)

> 习题，建议用时 1~2 天
>
> - [经典动态规划：编辑距离](https://labuladong.online/algo/dynamic-programming/edit-distance/)
> - [动态规划设计：最大子数组](https://labuladong.online/algo/dynamic-programming/maximum-subarray/)
> - [经典动态规划：最长公共子序列](https://labuladong.online/algo/dynamic-programming/longest-common-subsequence/)

> 习题，建议用时 1~2 天
>
> - [经典动态规划：0-1 背包问题](https://labuladong.online/algo/dynamic-programming/knapsack1/)
> - [经典动态规划：子集背包问题](https://labuladong.online/algo/dynamic-programming/knapsack2/)
> - [经典动态规划：完全背包问题](https://labuladong.online/algo/dynamic-programming/knapsack3/)





# 11. [贪心算法](https://labuladong.online/algo/intro/quick-learning-plan/#贪心算法-1)（0.5天）

一般的算法问题，需要暴力穷举所有解，从中找到最优解。

而有些算法问题，如果你充分利用信息，不需要用暴力穷举所有解，就能找到最优解，这就叫贪心选择性质，这种算法叫贪心算法。

所以贪心算法没有固定的套路，它的关键在于细心观察，看看是否能够充分利用信息，提前排除一些不可能是最优解的情况。

> 核心框架，建议用时 1 天
>
> - [贪心算法原理及应用](https://labuladong.online/algo/essential-technique/greedy/)
> - [扫描线技巧：安排会议室](https://labuladong.online/algo/frequency-interview/scan-line-technique/)





# 12. [分治算法](https://labuladong.online/algo/intro/quick-learning-plan/#分治算法-1)（0.5天）

有一部分算法问题，分而治之会有更高的效率，下面这篇分治算法教程所讲的例题是前面讲过的一道链表题目。

> 核心框架，建议用时 1 天
>
> - [分治算法详解](https://labuladong.online/algo/essential-technique/divide-and-conquer/)





# 13. [数学](https://labuladong.online/algo/intro/quick-learning-plan/#数学)（1天）

一般笔试中数学相关算法比较少，不过一些经典的技巧还是有必要掌握。

> 习题，建议用时 1~2 天
>
> - [一行代码就能解决的算法题](https://labuladong.online/algo/frequency-interview/one-line-solutions/)
> - [谈谈游戏中的随机算法](https://labuladong.online/algo/frequency-interview/random-algorithm/)

> 习题，建议用时 1 天
>
> - [如何高效寻找素数](https://labuladong.online/algo/frequency-interview/print-prime-number/)
> - [如何高效进行模幂运算](https://labuladong.online/algo/frequency-interview/quick-power/)





# 14. [其他经典面试题](https://labuladong.online/algo/intro/quick-learning-plan/#其他经典面试题-1)（1天）

这里列出一些经典算法题，它们本质上都是上面介绍的算法的运用。掌握了上面的所有算法后，一般难度的面试题你应该都能够解决了。

> 习题，建议用时 1~2 天
>
> - [如何高效解决接雨水问题](https://labuladong.online/algo/frequency-interview/trapping-rain-water/)
> - [一文秒杀所有丑数系列问题](https://labuladong.online/algo/frequency-interview/ugly-number-summary/)

> 习题，建议用时 1~2 天
>
> - [带权重的随机选择算法](https://labuladong.online/algo/frequency-interview/random-pick-with-weight/)
>
> - [一个方法团灭 nSum 问题](https://labuladong.online/algo/practice-in-action/nsum/)
>
>   [nSum 万能函数]([速成学习规划 | labuladong 的算法笔记](https://labuladong.online/algo/intro/quick-learning-plan/#其他经典面试题-1))