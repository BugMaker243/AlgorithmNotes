# labuladong的算法笔记框架

# 1、链表

## 1.1 双指针技巧秒杀七道链表题目

此页内容

- [合并两个有序链表](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#合并两个有序链表)
- [单链表的分解](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#单链表的分解)
- [合并 k 个有序链表](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#合并-k-个有序链表)
- [单链表的倒数第 k 个节点](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#单链表的倒数第-k-个节点)
- [单链表的中点](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#单链表的中点)
- [判断链表是否包含环](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#判断链表是否包含环)
- [两个链表是否相交](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#两个链表是否相交)

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | [141. 环形链表](https://leetcode.cn/problems/linked-list-cycle/) |  🟢   |
| [142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | [142. 环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/) |  🟠   |
| [160. Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | [160. 相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/) |  🟢   |
| [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | [19. 删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) |  🟠   |
| [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | [21. 合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/) |  🟢   |
| [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [23. 合并K个升序链表](https://leetcode.cn/problems/merge-k-sorted-lists/) |  🔴   |
| [86. Partition List](https://leetcode.com/problems/partition-list/) | [86. 分隔链表](https://leetcode.cn/problems/partition-list/) |  🟠   |
| [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | [876. 链表的中间结点](https://leetcode.cn/problems/middle-of-the-linked-list/) |  🟢   |
|                              -                               | [剑指 Offer 22. 链表中倒数第k个节点](https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/) |  🟢   |

前置知识

阅读本文前，你需要先学习：

- [链表基础](https://labuladong.online/algo/data-structure-basic/linkedlist-basic/)

### [合并两个有序链表](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#合并两个有序链表)

这是最基本的链表技巧，力扣第 21 题「[合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/)」就是这个问题，给你输入两个有序链表，请你把他俩合并成一个新的有序链表：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">21. 合并两个有序链表</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/merge-two-sorted-lists/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/merge-two-sorted-lists/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟢</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">将两个升序链表合并为一个新的<span>&nbsp;</span><strong style="font-weight: 600;">升序</strong><span>&nbsp;</span>链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2020/10/03/merge_ex1.jpg" style="max-width: 100%; width: 662px; height: 302px;"><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>l1 = [1,2,4], l2 = [1,3,4]
<strong style="font-weight: 600;">输出：</strong>[1,1,2,3,4,4]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>l1 = [], l2 = []
<strong style="font-weight: 600;">输出：</strong>[]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 3：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>l1 = [], l2 = [0]
<strong style="font-weight: 600;">输出：</strong>[0]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>两个链表的节点数目范围是<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">[0, 50]</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-100 &lt;= Node.val &lt;= 100</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">l1</code><span>&nbsp;</span>和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">l2</code><span>&nbsp;</span>均按<span>&nbsp;</span><strong style="font-weight: 600;">非递减顺序</strong><span>&nbsp;</span>排列</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/merge-two-sorted-lists/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 21. 合并两个有序链表</a>。</strong></details>

```java
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 虚拟头结点
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = l1, p2 = l2;
        
        while (p1 != null && p2 != null) {
            // 比较 p1 和 p2 两个指针
            // 将值较小的的节点接到 p 指针
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指针不断前进
            p = p.next;
        }
        
        if (p1 != null) {
            p.next = p1;
        }
        
        if (p2 != null) {
            p.next = p2;
        }
        
        return dummy.next;
    }
}
```



### [单链表的分解](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#单链表的分解)

直接看下力扣第 86 题「[分隔链表](https://leetcode.cn/problems/partition-list/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">86. 分隔链表</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/partition-list/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/partition-list/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个链表的头节点<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">head</code><span>&nbsp;</span>和一个特定值<em><span>&nbsp;</span></em><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">x</code><span>&nbsp;</span>，请你对链表进行分隔，使得所有<span>&nbsp;</span><strong style="font-weight: 600;">小于</strong><span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">x</code><span>&nbsp;</span>的节点都出现在<span>&nbsp;</span><strong style="font-weight: 600;">大于或等于</strong><span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">x</code><span>&nbsp;</span>的节点之前。</p><p style="line-height: 1.6; overflow-wrap: break-word;">你应当<span>&nbsp;</span><strong style="font-weight: 600;">保留</strong><span>&nbsp;</span>两个分区中每个节点的初始相对位置。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2021/01/04/partition.jpg" style="max-width: 100%; width: 662px; height: 222px;"><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,4,3,2,5,2], x = 3
<strong style="font-weight: 600;">输出</strong>：[1,2,2,4,3,5]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [2,1], x = 2
<strong style="font-weight: 600;">输出</strong>：[1,2]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>链表中节点的数目在范围<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">[0, 200]</code><span>&nbsp;</span>内</li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-100 &lt;= Node.val &lt;= 100</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-200 &lt;= x &lt;= 200</code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/partition-list/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 86. 分隔链表</a>。</strong></details>

```java
class Solution {
    public ListNode partition(ListNode head, int x) {
        // 存放小于 x 的链表的虚拟头结点
        ListNode dummy1 = new ListNode(-1);
        // 存放大于等于 x 的链表的虚拟头结点
        ListNode dummy2 = new ListNode(-1);
        // p1, p2 指针负责生成结果链表
        ListNode p1 = dummy1, p2 = dummy2;
        // p 负责遍历原链表，类似合并两个有序链表的逻辑
        // 这里是将一个链表分解成两个链表
        ListNode p = head;
        while (p != null) {
            if (p.val >= x) {
                p2.next = p;
                p2 = p2.next;
            } else {
                p1.next = p;
                p1 = p1.next;
            }
            // 不能直接让 p 指针前进，
            // p = p.next
            // 断开原链表中的每个节点的 next 指针
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        // 连接两个链表
        p1.next = dummy2.next;

        return dummy1.next;
    }
}
```



### [合并 `k` 个有序链表](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#合并-k-个有序链表)

看下力扣第 23 题「[合并K个升序链表](https://leetcode.cn/problems/merge-k-sorted-lists/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">23. 合并 K 个升序链表</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/merge-k-sorted-lists/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/merge-k-sorted-lists/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🔴</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个链表数组，每个链表都已经按升序排列。</p><p style="line-height: 1.6; overflow-wrap: break-word;">请你将所有链表合并到一个升序链表中，返回合并后的链表。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>lists = [[1,4,5],[1,3,4],[2,6]]
<strong style="font-weight: 600;">输出：</strong>[1,1,2,3,4,4,5,6]
<strong style="font-weight: 600;">解释：</strong>链表数组如下：
[
  1-&gt;4-&gt;5,
  1-&gt;3-&gt;4,
  2-&gt;6
]
将它们合并到一个有序链表中得到。
1-&gt;1-&gt;2-&gt;3-&gt;4-&gt;4-&gt;5-&gt;6
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>lists = []
<strong style="font-weight: 600;">输出：</strong>[]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 3：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>lists = [[]]
<strong style="font-weight: 600;">输出：</strong>[]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k == lists.length</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= k &lt;= 10^4</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= lists[i].length &lt;= 500</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-10^4 &lt;= lists[i][j] &lt;= 10^4</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">lists[i]</code><span>&nbsp;</span>按<span>&nbsp;</span><strong style="font-weight: 600;">升序</strong><span>&nbsp;</span>排列</li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">lists[i].length</code><span>&nbsp;</span>的总和不超过<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">10^4</code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/merge-k-sorted-lists/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 23. 合并 K 个升序链表</a>。</strong></details>

这里我们就要用到优先级队列这种数据结构，把链表节点放入一个最小堆，就可以每次获得 `k` 个节点中的最小节点。关于优先级队列可以参考 [优先级队列（二叉堆）原理及实现](https://labuladong.online/algo/data-structure-basic/binary-heap-implement/)，本文不展开。

```java
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        // 虚拟头结点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            lists.length, (a, b)->(a.val - b.val));
        // 将 k 个链表的头结点加入最小堆
        for (ListNode head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }

        while (!pq.isEmpty()) {
            // 获取最小节点，接到结果链表中
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            // p 指针不断前进
            p = p.next;
        }
        return dummy.next;
    }
}
```

这道题还有一个经典的解法，在 [分治算法核心框架](https://labuladong.online/algo/essential-technique/divide-and-conquer/) 中详细讲解，这里不展开。

### [单链表的倒数第 `k` 个节点](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#单链表的倒数第-k-个节点)

```java
// 返回链表的倒数第 k 个节点
ListNode findFromEnd(ListNode head, int k) {
    ListNode p1 = head;
    // p1 先走 k 步
    for (int i = 0; i < k; i++) {
        p1 = p1.next;
    }
    ListNode p2 = head;
    // p1 和 p2 同时走 n - k 步
    while (p1 != null) {
        p2 = p2.next;
        p1 = p1.next;
    }
    // p2 现在指向第 n - k + 1 个节点，即倒数第 k 个节点
    return p2;
}
```



<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">19. 删除链表的倒数第 N 个结点</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/remove-nth-node-from-end-of-list/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个链表，删除链表的倒数第&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n</code><em>&nbsp;</em>个结点，并且返回链表的头结点。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2020/10/03/remove_ex1.jpg" style="max-width: 100%; width: 542px; height: 222px;"><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,2,3,4,5], n = 2
<strong style="font-weight: 600;">输出：</strong>[1,2,3,5]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1], n = 1
<strong style="font-weight: 600;">输出：</strong>[]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 3：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,2], n = 1
<strong style="font-weight: 600;">输出：</strong>[1]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>链表中结点的数目为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">sz</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= sz &lt;= 30</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= Node.val &lt;= 100</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= n &lt;= sz</code></li></ul><p style="line-height: 1.6; overflow-wrap: break-word; margin-bottom: 0px; padding-bottom: 0px;"><strong style="font-weight: 600;">进阶：</strong>你能尝试使用一趟扫描实现吗？</p></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/remove-nth-node-from-end-of-list/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 19. 删除链表的倒数第 N 个结点</a>。</strong></details>

```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 虚拟头结点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 删除倒数第 n 个，要先找倒数第 n + 1 个节点
        ListNode x = findFromEnd(dummy, n + 1);
        // 删掉倒数第 n 个节点
        x.next = x.next.next;
        return dummy.next;
    }
        
    private ListNode findFromEnd(ListNode head, int k) {
        // 代码见上文
    }
}
```



### [单链表的中点](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#单链表的中点)

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        // 快慢指针初始化指向 head
        ListNode slow = head, fast = head;
        // 快指针走到末尾时停止
        while (fast != null && fast.next != null) {
            // 慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
        }
        // 慢指针指向中点
        return slow;
    }
}
```



### [判断链表是否包含环](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#判断链表是否包含环)

```java
class Solution {
    public boolean hasCycle(ListNode head) {
        // 快慢指针初始化指向 head
        ListNode slow = head, fast = head;
        // 快指针走到末尾时停止
        while (fast != null && fast.next != null) {
            // 慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
            // 快慢指针相遇，说明含有环
            if (slow == fast) {
                return true;
            }
        }
        // 不包含环
        return false;
    }
}
```



这个问题还有进阶版，也是力扣第 142 题「[环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/)」：如果链表中含有环，如何计算这个环的起点？

举个例子，环的起点是指下面这幅图中的节点 2：

![img](https://labuladong.online/algo/images/linked-list-two-pointer/circularlinkedlist.png)

```java
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        // 上面的代码类似 hasCycle 函数
        if (fast == null || fast.next == null) {
            // fast 遇到空指针说明没有环
            return null;
        }

        // 重新指向头结点
        slow = head;
        // 快慢指针同步前进，相交点就是环起点
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
```

当快慢指针相遇时，让其中任一个指针指向头节点，然后让它俩以相同速度前进，再次相遇时所在的节点位置就是环开始的位置。

为什么要这样呢？这里简单说一下其中的原理。

我们假设快慢指针相遇时，慢指针 `slow` 走了 `k` 步，那么快指针 `fast` 一定走了 `2k` 步：

![img](https://labuladong.online/algo/images/linked-two-pointer/3.jpeg)

`fast` 一定比 `slow` 多走了 `k` 步，这多走的 `k` 步其实就是 `fast` 指针在环里转圈圈，所以 `k` 的值就是环长度的「整数倍」。

假设相遇点距环的起点的距离为 `m`，那么结合上图的 `slow` 指针，环的起点距头结点 `head` 的距离为 `k - m`，也就是说如果从 `head` 前进 `k - m` 步就能到达环起点。

巧的是，如果从相遇点继续前进 `k - m` 步，也恰好到达环起点。因为结合上图的 `fast` 指针，从相遇点开始走k步可以转回到相遇点，那走 `k - m` 步肯定就走到环起点了：

![img](https://labuladong.online/algo/images/linked-two-pointer/2.jpeg)

所以，只要我们把快慢指针中的任一个重新指向 `head`，然后两个指针同速前进，`k - m` 步后一定会相遇，相遇之处就是环的起点了。



### [两个链表是否相交](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/#两个链表是否相交)

这个问题有意思，也是力扣第 160 题「[相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/)」

![img](https://labuladong.online/algo/images/linked-list-two-pointer/4.png)

解法

![img](https://labuladong.online/algo/images/linked-list-two-pointer/6.jpeg)

```java
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // p1 指向 A 链表头结点，p2 指向 B 链表头结点
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            // p1 走一步，如果走到 A 链表末尾，转到 B 链表
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            // p2 走一步，如果走到 B 链表末尾，转到 A 链表
            if (p2 == null) {
                p2 = headA;
            } else{
                p2 = p2.next;
            }
        }
        return p1;
    }
}
```



**2022/1/24 更新**：

如果把两条链表首尾相连，那么「寻找两条链表的交点」的问题转换成了前面讲的「寻找环起点」的问题：

![img](https://labuladong.online/algo/images/linked-list-two-pointer/7.png)

不过需要注意的是，这道题说不让你改变原始链表的结构，所以你把题目输入的链表转化成环形链表求解之后记得还要改回来，否则无法通过。

另外，还有读者提到，既然「寻找两条链表的交点」的核心在于让 `p1` 和 `p2` 两个指针能够同时到达相交节点 `c1`，那么可以通过预先计算两条链表的长度来做到这一点，具体代码如下：

```java
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        // 计算两条链表的长度
        for (ListNode p1 = headA; p1 != null; p1 = p1.next) {
            lenA++;
        }
        for (ListNode p2 = headB; p2 != null; p2 = p2.next) {
            lenB++;
        }
        // 让 p1 和 p2 到达尾部的距离相同
        ListNode p1 = headA, p2 = headB;
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                p1 = p1.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                p2 = p2.next;
            }
        }
        // 看两个指针是否会相同，p1 == p2 时有两种情况：
        // 1、要么是两条链表不相交，他俩同时走到尾部空指针
        // 2、要么是两条链表相交，他俩走到两条链表的相交点
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
```

虽然代码多一些，但是时间复杂度是还是 O(N)，而且会更容易理解一些。



## 1.2 判断回文链表

### 如何判断回文链表

内容

- [一、判断回文单链表](https://labuladong.online/algo/data-structure/palindrome-linked-list/#一、判断回文单链表)
- [二、优化空间复杂度](https://labuladong.online/algo/data-structure/palindrome-linked-list/#二、优化空间复杂度)
- [三、最后总结](https://labuladong.online/algo/data-structure/palindrome-linked-list/#三、最后总结)

本文讲解的例题

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | [234. 回文链表](https://leetcode.cn/problems/palindrome-linked-list/) |  🟢   |

前置知识

阅读本文前，你需要先学习：

- [链表基础](https://labuladong.online/algo/data-structure-basic/linkedlist-basic/)
- [链表双指针技巧](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/)
- [数组双指针技巧汇总](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/)



**寻找**回文串的核心思想是从中心向两端扩展：

```java
// 在 s 中寻找以 s[left] 和 s[right] 为中心的最长回文串
String palindrome(String s, int left, int right) {
    // 防止索引越界
    while (left >= 0 && right < s.length()
            && s.charAt(left) == s.charAt(right)) {
        // 双指针，向两边展开
        left--;
        right++;
    }
    // 返回以 s[left] 和 s[right] 为中心的最长回文串
    return s.substring(left + 1, right);
}
```

因为回文串长度可能为奇数也可能是偶数，长度为奇数时只存在一个中心点，而长度为偶数时存在两个中心点，所以上面这个函数需要传入 `l` 和 `r`。

而**判断**一个字符串是不是回文串就简单很多，不需要考虑奇偶情况，只需要[双指针技巧](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/)，从两端向中间逼近即可：

```java
boolean isPalindrome(String s) {
    // 一左一右两个指针相向而行
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```

**因为回文串是对称的，所以正着读和倒着读应该是一样的，这一特点是解决回文串问题的关键**。



### [一、判断回文单链表](https://labuladong.online/algo/data-structure/palindrome-linked-list/#一、判断回文单链表)

看下力扣第 234 题「[回文链表](https://leetcode.cn/problems/palindrome-linked-list/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">234. 回文链表</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/palindrome-linked-list/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/palindrome-linked-list/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟢</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个单链表的头节点<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">head</code><span>&nbsp;</span>，请你判断该链表是否为<span data-keyword="palindrome-sequence">回文链表</span>。如果是，返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">true</code><span>&nbsp;</span>；否则，返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">false</code><span>&nbsp;</span>。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2021/03/03/pal1linked-list.jpg" style="max-width: 100%; width: 422px; height: 62px;"><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,2,2,1]
<strong style="font-weight: 600;">输出：</strong>true
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2021/03/03/pal2linked-list.jpg" style="max-width: 100%; width: 182px; height: 62px;"><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,2]
<strong style="font-weight: 600;">输出：</strong>false
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>链表中节点数目在范围<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">[1, 10<sup>5</sup>]</code><span>&nbsp;</span>内</li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= Node.val &lt;= 9</code></li></ul><p style="line-height: 1.6; overflow-wrap: break-word; margin-bottom: 0px; padding-bottom: 0px;"><strong style="font-weight: 600;">进阶：</strong>你能否用&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">O(n)</code><span>&nbsp;</span>时间复杂度和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">O(1)</code><span>&nbsp;</span>空间复杂度解决此题？</p></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/palindrome-linked-list/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 234. 回文链表</a>。</strong></details>

```java
class Solution {
    // 从左向右移动的指针
    ListNode left;
    // 从右向左移动的指针
    ListNode right;

    // 记录链表是否为回文
    boolean res = true;

    boolean isPalindrome(ListNode head) {
        left = head;
        traverse(head);
        return res;
    }

    void traverse(ListNode right) {
        if (right == null) {
            return;
        }

        // 利用递归，走到链表尾部
        traverse(right.next);

        // 后序遍历位置，此时的 right 指针指向链表右侧尾部
        // 所以可以和 left 指针比较，判断是否是回文链表
        if (left.val != right.val) {
            res = false;
        }
        left = left.next;
    }
}
```



### [二、优化空间复杂度](https://labuladong.online/algo/data-structure/palindrome-linked-list/#二、优化空间复杂度)

**1、先通过 [链表双指针技巧](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/) 中的快慢指针来找到链表的中点**：

```java
ListNode slow, fast;
slow = fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
// slow 指针现在指向链表中点
```

![img](https://labuladong.online/algo/images/palindrome-list/1.jpg)

**2、如果`fast`指针没有指向`null`，说明链表长度为奇数，`slow`还要再前进一步**：

```java
if (fast != null)
    slow = slow.next;
```

![img](https://labuladong.online/algo/images/palindrome-list/2.jpg)

**3、从`slow`开始反转后面的链表，现在就可以开始比较回文串了**：

```java
ListNode left = head;
ListNode right = reverse(slow);

while (right != null) {
    if (left.val != right.val)
        return false;
    left = left.next;
    right = right.next;
}
return true;
```

![img](https://labuladong.online/algo/images/palindrome-list/3.jpg)

```java
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (fast != null)
            slow = slow.next;
        
        ListNode left = head;
        ListNode right = reverse(slow);
        while (right != null) {
            if (left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }
        
        return true;
    }

    ListNode reverse(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
```



## 1.3 单链表的花式反转方法汇总

此页内容

- [反转整个单链表](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#反转整个单链表)
- - [迭代解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#迭代解法)
  - [递归解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#递归解法)
- [反转链表前 N 个节点](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#反转链表前-n-个节点)
- - [迭代解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#迭代解法-1)
  - [递归解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#递归解法-1)
- [反转链表的一部分](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#反转链表的一部分)
- - [迭代解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#迭代解法-2)
  - [递归解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#递归解法-2)
- [K 个一组反转链表](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#k-个一组反转链表)
- - [思路分析](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#思路分析)
  - [代码实现](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#代码实现)
- [最后总结](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#最后总结)

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | [206. 反转链表](https://leetcode.cn/problems/reverse-linked-list/) |  🟢   |
| [25. Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | [25. K 个一组翻转链表](https://leetcode.cn/problems/reverse-nodes-in-k-group/) |  🔴   |
| [92. Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | [92. 反转链表 II](https://leetcode.cn/problems/reverse-linked-list-ii/) |  🟠   |



### [反转整个单链表](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#反转整个单链表)

```java
// 单链表节点的结构
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
```

单链表反转是一个比较基础的算法题，力扣第 206 题「[反转链表](https://leetcode.cn/problems/reverse-linked-list/)」就是这个问题：



#### [迭代解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#迭代解法)

```java
class Solution {
    // 反转以 head 为起点的单链表
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 由于单链表的结构，至少要用三个指针才能完成迭代反转
        // cur 是当前遍历的节点，pre 是 cur 的前驱结点，nxt 是 cur 的后继结点
        ListNode pre, cur, nxt;
        pre = null; cur = head; nxt = head.next;
        while (cur != null) {
            // 逐个结点反转
            cur.next = pre;
            // 更新指针位置
            pre = cur;
            cur = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }
        }
        // 返回反转后的头结点
        return pre;
    }
}
```



#### [递归解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#递归解法)

```java
class Solution {
    // 定义：输入一个单链表头结点，将该链表反转，返回新的头结点
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
```



### [反转链表前 N 个节点](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#反转链表前-n-个节点)

```java
// 将链表的前 n 个节点反转（n <= 链表长度）
ListNode reverseN(ListNode head, int n)
```

比如说对于下图链表，执行 `reverseN(head, 3)`：

![img](https://labuladong.online/algo/images/reverse-linked-list/6.jpg)

#### [迭代解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#迭代解法)

```java
ListNode reverseN(ListNode head, int n) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode pre, cur, nxt;
    pre = null; cur = head; nxt = head.next;
    while (n > 0) {
        cur.next = pre;
        pre = cur;
        cur = nxt;
        if (nxt != null) {
            nxt = nxt.next;
        }
        n--;
    }
    // 此时的 cur 是第 n + 1 个节点，head 是反转后的尾结点
    head.next = cur;
    // 此时的 pre 是反转后的头结点
    return pre;
}
```



#### [递归解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#递归解法)

```java
// 后驱节点
ListNode successor = null;

// 反转以 head 为起点的 n 个节点，返回新的头结点
ListNode reverseN(ListNode head, int n) {
    if (n == 1) {
        // 记录第 n + 1 个节点
        successor = head.next;
        return head;
    }
    // 以 head.next 为起点，需要反转前 n - 1 个节点
    ListNode last = reverseN(head.next, n - 1);

    head.next.next = head;
    // 让反转之后的 head 节点和后面的节点连起来
    head.next = successor;
    return last;
}
```



### [反转链表的一部分](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#反转链表的一部分)

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem; color: rgb(60, 60, 67); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, STHeiti, &quot;Microsoft YaHei&quot;, SimSun, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">92. 反转链表 II</strong>&nbsp;|<span>&nbsp;</span><span><a href="https://leetcode.cn/problems/reverse-linked-list-ii/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣</a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a href="https://leetcode.com/problems/reverse-linked-list-ii/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode</a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div>给你单链表的头指针<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">head</code><span>&nbsp;</span>和两个整数<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left</code><span>&nbsp;</span>和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">right</code><span>&nbsp;</span>，其中<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left &lt;= right</code><span>&nbsp;</span>。请你反转从位置<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left</code><span>&nbsp;</span>到位置<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">right</code><span>&nbsp;</span>的链表节点，返回<span>&nbsp;</span><strong style="font-weight: 600;">反转后的链表</strong><span>&nbsp;</span>。<p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2021/02/19/rev2ex2.jpg" style="max-width: 100%; width: 542px; height: 222px;"><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,2,3,4,5], left = 2, right = 4
<strong style="font-weight: 600;">输出：</strong>[1,4,3,2,5]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [5], left = 1, right = 1
<strong style="font-weight: 600;">输出：</strong>[5]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>链表中节点数目为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= n &lt;= 500</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-500 &lt;= Node.val &lt;= 500</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= left &lt;= right &lt;= n</code></li></ul><p style="line-height: 1.6; overflow-wrap: break-word; margin-bottom: 0px; padding-bottom: 0px;"><strong style="font-weight: 600;">进阶：</strong><span>&nbsp;</span>你可以使用一趟扫描完成反转吗？</p></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/reverse-linked-list-ii/" class="" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 92. 反转链表 II</a>。</strong></details>

#### [迭代解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#迭代解法-1)

```java
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseN(head, n);
        }
        // 找到第 m 个节点的前驱
        ListNode pre = head;
        for (int i = 1; i < m - 1; i++) {
            pre = pre.next;
        }
        // 从第 m 个节点开始反转
        pre.next = reverseN(pre.next, n - m + 1);
        return head;
    }

    ListNode reverseN(ListNode head, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre, cur, nxt;
        pre = null; cur = head; nxt = head.next;
        while (n > 0) {
            cur.next = pre;
            pre = cur;
            cur = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }
            n--;
        }
        // 此时的 cur 是第 n + 1 个节点，head 是反转后的尾结点
        head.next = cur;
        // 此时的 pre 是反转后的头结点
        return pre;
    }
}
```



#### [递归解法](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#递归解法-1)

```java
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // base case
        if (m == 1) {
            return reverseN(head, n);
        }
        // 前进到反转的起点触发 base case
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }

    // 后驱节点
    ListNode successor = null;

    // 反转以 head 为起点的 n 个节点，返回新的头结点
    ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            // 记录第 n + 1 个节点
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);

        head.next.next = head;
        head.next = successor;
        return last;
    }
}
```



### [K 个一组反转链表](https://labuladong.online/algo/data-structure/reverse-linked-list-recursion/#k-个一组反转链表)

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem; color: rgb(60, 60, 67); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, STHeiti, &quot;Microsoft YaHei&quot;, SimSun, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">25. K 个一组翻转链表</strong>&nbsp;|<span>&nbsp;</span><span><a href="https://leetcode.cn/problems/reverse-nodes-in-k-group/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣</a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a href="https://leetcode.com/problems/reverse-nodes-in-k-group/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode</a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🔴</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你链表的头节点<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">head</code><span>&nbsp;</span>，每&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><em>&nbsp;</em>个节点一组进行翻转，请你返回修改后的链表。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>是一个正整数，它的值小于或等于链表的长度。如果节点总数不是&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><em>&nbsp;</em>的整数倍，那么请将最后剩余的节点保持原有顺序。</p><p style="line-height: 1.6; overflow-wrap: break-word;">你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2020/10/03/reverse_ex1.jpg" style="max-width: 100%; width: 542px; height: 222px;"><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,2,3,4,5], k = 2
<strong style="font-weight: 600;">输出：</strong>[2,1,4,3,5]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><p style="line-height: 1.6; overflow-wrap: break-word;"><img alt="" src="https://labuladong.online/algo/images/lc/uploads/2020/10/03/reverse_ex2.jpg" style="max-width: 100%; width: 542px; height: 222px;"></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>head = [1,2,3,4,5], k = 3
<strong style="font-weight: 600;">输出：</strong>[3,2,1,4,5]
</pre><strong style="font-weight: 600;">提示：</strong><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>链表中的节点数目为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= k &lt;= n &lt;= 5000</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= Node.val &lt;= 1000</code></li></ul><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">进阶：</strong>你可以设计一个只用<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">O(1)</code><span>&nbsp;</span>额外内存空间的算法解决此问题吗？</p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/reverse-nodes-in-k-group/" class="" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 25. K 个一组翻转链表</a>。</strong></details>

```java
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        // 区间 [a, b) 包含 k 个待反转元素
        ListNode a, b;
        a = b = head;
        for (int i = 0; i < k; i++) {
            // 不足 k 个，不需要反转了
            if (b == null) return head;
            b = b.next;
        }
        // 反转前 k 个元素
        ListNode newHead = reverseN(a, k);
        // 此时 b 指向下一组待反转的头结点
        // 递归反转后续链表并连接起来
        a.next = reverseKGroup(b, k);
        return newHead;
    }

    // 上文实现的反转前 N 个节点的函数
    ListNode reverseN(ListNode head, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre, cur, nxt;
        pre = null; cur = head; nxt = head.next;
        while (n > 0) {
            cur.next = pre;
            pre = cur;
            cur = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }
            n--;
        }
        head.next = cur;
        return pre;
    }
}
```



# 2、数组

## 2.1 双指针技巧秒杀七道数组题目

此页内容

- [一、快慢指针技巧](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#一、快慢指针技巧)
- - [原地修改](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#原地修改)
  - [滑动窗口](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#滑动窗口)
- [二、左右指针的常用算法](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#二、左右指针的常用算法)
- - [二分查找](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#二分查找)
  - [n 数之和](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#n-数之和)
  - [反转数组](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#反转数组)
  - [回文串判断](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#回文串判断)

本文讲解的例题

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | [167. 两数之和 II - 输入有序数组](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/) |  🟠   |
| [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) |  🟢   |
| [27. Remove Element](https://leetcode.com/problems/remove-element/) | [27. 移除元素](https://leetcode.cn/problems/remove-element/) |  🟢   |
| [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/) |   [283. 移动零](https://leetcode.cn/problems/move-zeroes/)   |  🟢   |
| [344. Reverse String](https://leetcode.com/problems/reverse-string/) | [344. 反转字符串](https://leetcode.cn/problems/reverse-string/) |  🟢   |
| [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | [5. 最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/) |  🟠   |
| [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [83. 删除排序链表中的重复元素](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/) |  🟢   |
|                              -                               | [剑指 Offer II 006. 排序数组中两个数字之和](https://leetcode.cn/problems/kLl5u1/) |  🟢   |
|                              -                               | [剑指 Offer 57. 和为s的两个数字](https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/) |  🟢   |

前置知识

阅读本文前，你需要先学习：

- [数组基础](https://labuladong.online/algo/data-structure-basic/array-basic/)
- [单链表的六大解题套路](https://labuladong.online/algo/essential-technique/linked-list-skills-summary/)



### [一、快慢指针技巧](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#一、快慢指针技巧)

#### [原地修改](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#原地修改)

**数组问题中比较常见的快慢指针技巧，是让你原地修改数组**。

比如说看下力扣第 26 题「[删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)」，让你在有序数组去重：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">26. 删除有序数组中的重复项</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟢</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个<span>&nbsp;</span><strong style="font-weight: 600;">非严格递增排列</strong><span>&nbsp;</span>的数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>，请你<strong style="font-weight: 600;"><a href="http://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;"><span>&nbsp;</span>原地</a></strong><span>&nbsp;</span>删除重复出现的元素，使每个元素<span>&nbsp;</span><strong style="font-weight: 600;">只出现一次</strong><span>&nbsp;</span>，返回删除后数组的新长度。元素的<span>&nbsp;</span><strong style="font-weight: 600;">相对顺序</strong><span>&nbsp;</span>应该保持<span>&nbsp;</span><strong style="font-weight: 600;">一致</strong><span>&nbsp;</span>。然后返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>中唯一元素的个数。</p><p style="line-height: 1.6; overflow-wrap: break-word;">考虑<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>的唯一元素的数量为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>，你需要做以下事情确保你的题解可以被通过：</p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>更改数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>，使<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>的前<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>个元素包含唯一元素，并按照它们最初在<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>中出现的顺序排列。<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code>&nbsp;的其余元素与<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>的大小不重要。</li><li>返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code>&nbsp;。</li></ul><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">判题标准:</strong></p><p style="line-height: 1.6; overflow-wrap: break-word;">系统会用下面的代码来测试你的题解:</p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;">int[] nums = [...]; // 输入数组
int[] expectedNums = [...]; // 长度正确的期望答案

int k = removeDuplicates(nums); // 调用

assert k == expectedNums.length;
for (int i = 0; i &lt; k; i++) {
    assert nums[i] == expectedNums[i];
}</pre><p style="line-height: 1.6; overflow-wrap: break-word;">如果所有断言都通过，那么您的题解将被<span>&nbsp;</span><strong style="font-weight: 600;">通过</strong>。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>nums = [1,1,2]
<strong style="font-weight: 600;">输出：</strong>2, nums = [1,2,_]
<strong style="font-weight: 600;">解释：</strong>函数应该返回新的长度 <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">2</code></strong> ，并且原数组 <em>nums </em>的前两个元素被修改为 <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1</code></strong>, <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">2 </code></strong><code style="font-family: var(--vp-font-mono); padding: 0px; border-radius: 0px;">。</code>不需要考虑数组中超出新长度后面的元素。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>nums = [0,0,1,1,1,2,2,3,3,4]
<strong style="font-weight: 600;">输出：</strong>5, nums = [0,1,2,3,4]
<strong style="font-weight: 600;">解释：</strong>函数应该返回新的长度 <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">5</code></strong> ， 并且原数组 <em>nums </em>的前五个元素被修改为 <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0</code></strong>, <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1</code></strong>, <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">2</code></strong>, <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">3</code></strong>, <strong style="font-weight: 600;"><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 0px; border-radius: 0px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">4</code></strong> 。不需要考虑数组中超出新长度后面的元素。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-10<sup>4</sup><span>&nbsp;</span>&lt;= nums[i] &lt;= 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>已按<span>&nbsp;</span><strong style="font-weight: 600;">非严格递增</strong>&nbsp;排列</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 26. 删除有序数组中的重复项</a>。</strong></details>

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                // 维护 nums[0..slow] 无重复
                nums[slow] = nums[fast];
            }
            fast++;
        }
        // 数组长度为索引 + 1
        return slow + 1;
    }
}
```



再简单扩展一下，看看力扣第 83 题「[删除排序链表中的重复元素](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/)」，如果给你一个有序的单链表，如何去重呢？

```java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                // nums[slow] = nums[fast];
                slow.next = fast;
                // slow++;
                slow = slow.next;
            }
            // fast++
            fast = fast.next;
        }
        // 断开与后面重复元素的连接
        slow.next = null;
        return head;
    }
}
```



**除了让你在有序数组/链表中去重，题目还可能让你对数组中的某些元素进行「原地删除」**。

比如力扣第 27 题「[移除元素](https://leetcode.cn/problems/remove-element/)」，看下题目：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">27. 移除元素</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/remove-element/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/remove-element/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟢</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><em>&nbsp;</em>和一个值<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">val</code>，你需要<span>&nbsp;</span><strong style="font-weight: 600;"><a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">原地</a></strong><span>&nbsp;</span>移除所有数值等于&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">val</code><em>&nbsp;</em>的元素。元素的顺序可能发生改变。然后返回&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code>&nbsp;中与&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">val</code>&nbsp;不同的元素的数量。</p><p style="line-height: 1.6; overflow-wrap: break-word;">假设<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>中不等于<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">val</code><span>&nbsp;</span>的元素数量为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code>，要通过此题，您需要执行以下操作：</p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>更改<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>数组，使<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>的前<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>个元素包含不等于<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">val</code><span>&nbsp;</span>的元素。<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>的其余元素和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>的大小并不重要。</li><li>返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code>。</li></ul><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">用户评测：</strong></p><p style="line-height: 1.6; overflow-wrap: break-word;">评测机将使用以下代码测试您的解决方案：</p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;">int[] nums = [...]; // 输入数组
int val = ...; // 要移除的值
int[] expectedNums = [...]; // 长度正确的预期答案。
                            // 它以不等于 val 的值排序。

int k = removeElement(nums, val); // 调用你的实现

assert k == expectedNums.length;
sort(nums, 0, k); // 排序 nums 的前 k 个元素
for (int i = 0; i &lt; actualLength; i++) {
    assert nums[i] == expectedNums[i];
}</pre><p style="line-height: 1.6; overflow-wrap: break-word;">如果所有的断言都通过，你的解决方案将会<span>&nbsp;</span><strong style="font-weight: 600;">通过</strong>。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>nums = [3,2,2,3], val = 3
<strong style="font-weight: 600;">输出：</strong>2, nums = [2,2,_,_]
<strong style="font-weight: 600;">解释：</strong>你的函数函数应该返回 k = 2, 并且 nums<em> </em>中的前两个元素均为 2。
你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>nums = [0,1,2,2,3,0,4,2], val = 2
<strong style="font-weight: 600;">输出：</strong>5, nums = [0,1,4,0,3,_,_,_]
<strong style="font-weight: 600;">解释：</strong>你的函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
注意这五个元素可以任意顺序返回。
你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= nums.length &lt;= 100</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= nums[i] &lt;= 50</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= val &lt;= 100</code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/remove-element/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 27. 移除元素</a>。</strong></details>

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
```



实现了这个 `removeElement` 函数，接下来看看力扣第 283 题「[移动零](https://leetcode.cn/problems/move-zeroes/)」：

给你输入一个数组 `nums`，请你**原地修改**，将数组中的所有值为 0 的元素移到数组末尾，函数签名如下：

```java
class Solution {
    public void moveZeroes(int[] nums) {
        // 去除 nums 中的所有 0，返回不含 0 的数组长度
        int p = removeElement(nums, 0);
        // 将 nums[p..] 的元素赋值为 0
        for (; p < nums.length; p++) {
            nums[p] = 0;
        }
    }

    public int removeElement(int[] nums, int val) {
        // 见上文代码实现
    }
}
```



#### [滑动窗口](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#滑动窗口)

```java
// 滑动窗口算法框架伪码
int left = 0, right = 0;

while (right < nums.size()) {
    // 增大窗口
    window.addLast(nums[right]);
    right++;
    
    while (window needs shrink) {
        // 缩小窗口
        window.removeFirst(nums[left]);
        left++;
    }
}
```

具体的题目本文就不重复了，这里只强调滑动窗口算法的快慢指针特性：

`left` 指针在后，`right` 指针在前，两个指针中间的部分就是「窗口」，算法通过扩大和缩小「窗口」来解决某些问题。

### [二、左右指针的常用算法](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#二、左右指针的常用算法)

#### [二分查找](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#二分查找)

我在另一篇文章 [二分查找框架详解](https://labuladong.online/algo/essential-technique/binary-search-framework/) 中有详细探讨二分搜索代码的细节问题，这里只写最简单的二分算法，旨在突出它的双指针特性：

```java
int binarySearch(int[] nums, int target) {
    // 一左一右两个指针相向而行
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = (right + left) / 2;
        if(nums[mid] == target)
            return mid; 
        else if (nums[mid] < target)
            left = mid + 1; 
        else if (nums[mid] > target)
            right = mid - 1;
    }
    return -1;
}
```

#### [`n` 数之和](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#n-数之和)

看下力扣第 167 题「[两数之和 II](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">167. 两数之和 II - 输入有序数组</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个下标从<span>&nbsp;</span><strong style="font-weight: 600;">1</strong><span>&nbsp;</span>开始的整数数组&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">numbers</code><span>&nbsp;</span>，该数组已按<strong style="font-weight: 600;"><em><span>&nbsp;</span></em>非递减顺序排列&nbsp;<span>&nbsp;</span></strong>，请你从数组中找出满足相加之和等于目标数&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">target</code><span>&nbsp;</span>的两个数。如果设这两个数分别是<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">numbers[index<sub>1</sub>]</code><span>&nbsp;</span>和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">numbers[index<sub>2</sub>]</code><span>&nbsp;</span>，则<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= index<sub>1</sub><span>&nbsp;</span>&lt; index<sub>2</sub><span>&nbsp;</span>&lt;= numbers.length</code><span>&nbsp;</span>。</p><p style="line-height: 1.6; overflow-wrap: break-word;">以长度为 2 的整数数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">[index<sub>1</sub>, index<sub>2</sub>]</code><span>&nbsp;</span>的形式返回这两个整数的下标<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">index<sub>1</sub></code><em><span>&nbsp;</span></em>和<em><span>&nbsp;</span></em><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">index<sub>2</sub></code>。</p><p style="line-height: 1.6; overflow-wrap: break-word;">你可以假设每个输入<span>&nbsp;</span><strong style="font-weight: 600;">只对应唯一的答案</strong><span>&nbsp;</span>，而且你<span>&nbsp;</span><strong style="font-weight: 600;">不可以</strong><span>&nbsp;</span>重复使用相同的元素。</p><p style="line-height: 1.6; overflow-wrap: break-word;">你所设计的解决方案必须只使用常量级的额外空间。</p>&nbsp;<p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>numbers = [<strong style="font-weight: 600;"><em>2</em></strong>,<strong style="font-weight: 600;"><em>7</em></strong>,11,15], target = 9
<strong style="font-weight: 600;">输出：</strong>[1,2]
<strong style="font-weight: 600;">解释：</strong>2 与 7 之和等于目标数 9 。因此 index<sub>1</sub> = 1, index<sub>2</sub> = 2 。返回 [1, 2] 。</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>numbers = [<strong style="font-weight: 600;"><em>2</em></strong>,3,<strong style="font-weight: 600;"><em>4</em></strong>], target = 6
<strong style="font-weight: 600;">输出：</strong>[1,3]
<strong style="font-weight: 600;">解释：</strong>2 与 4 之和等于目标数 6 。因此 index<sub>1</sub> = 1, index<sub>2</sub> = 3 。返回 [1, 3] 。</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 3：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>numbers = [<strong style="font-weight: 600;"><em>-1</em></strong>,<strong style="font-weight: 600;"><em>0</em></strong>], target = -1
<strong style="font-weight: 600;">输出：</strong>[1,2]
<strong style="font-weight: 600;">解释：</strong>-1 与 0 之和等于目标数 -1 。因此 index<sub>1</sub> = 1, index<sub>2</sub> = 2 。返回 [1, 2] 。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">2 &lt;= numbers.length &lt;= 3 * 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-1000 &lt;= numbers[i] &lt;= 1000</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">numbers</code><span>&nbsp;</span>按<span>&nbsp;</span><strong style="font-weight: 600;">非递减顺序</strong><span>&nbsp;</span>排列</li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-1000 &lt;= target &lt;= 1000</code></li><li><strong style="font-weight: 600;">仅存在一个有效答案</strong></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 167. 两数之和 II - 输入有序数组</a>。</strong></details>

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 一左一右两个指针相向而行
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // 题目要求的索引是从 1 开始的
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                // 让 sum 大一点
                left++;
            } else if (sum > target) {
                // 让 sum 小一点
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
```

我在另一篇文章 [一个函数秒杀所有 nSum 问题](https://labuladong.online/algo/practice-in-action/nsum/) 中也运用类似的左右指针技巧给出了 `nSum` 问题的一种通用思路，本质上利用的也是双指针技巧。



#### [反转数组](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#反转数组)

```java
void reverseString(char[] s) {
    // 一左一右两个指针相向而行
    int left = 0, right = s.length - 1;
    while (left < right) {
        // 交换 s[left] 和 s[right]
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }
}
```



#### [回文串判断](https://labuladong.online/algo/essential-technique/array-two-pointers-summary/#回文串判断)

```java
boolean isPalindrome(String s) {
    // 一左一右两个指针相向而行
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```



那接下来我提升一点难度，给你一个字符串，让你用双指针技巧从中找出最长的回文串，你会做吗？

这就是力扣第 5 题「[最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">5. 最长回文子串</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/longest-palindromic-substring/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/longest-palindromic-substring/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个字符串<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code>，找到<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>中最长的<span>&nbsp;</span><span data-keyword="palindromic-string">回文</span><span>&nbsp;</span><span data-keyword="substring-nonempty">子串</span>。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>s = "babad"
<strong style="font-weight: 600;">输出：</strong>"bab"
<strong style="font-weight: 600;">解释：</strong>"aba" 同样是符合题意的答案。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>s = "cbbd"
<strong style="font-weight: 600;">输出：</strong>"bb"
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= s.length &lt;= 1000</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>仅由数字和英文字母组成</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/longest-palindromic-substring/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 5. 最长回文子串</a>。</strong></details>

```java
String longestPalindrome(String s) {
    String res = "";
    for (int i = 0; i < s.length(); i++) {
        // 以 s[i] 为中心的最长回文子串
        String s1 = palindrome(s, i, i);
        // 以 s[i] 和 s[i+1] 为中心的最长回文子串
        String s2 = palindrome(s, i, i + 1);
        // res = longest(res, s1, s2)
        res = res.length() > s1.length() ? res : s1;
        res = res.length() > s2.length() ? res : s2;
    }
    return res;
}
```



## 2.2 滑动窗口算法核心代码模板

此页内容

- [滑动窗口框架概览](https://labuladong.online/algo/essential-technique/sliding-window-framework/#滑动窗口框架概览)
- [一、最小覆盖子串](https://labuladong.online/algo/essential-technique/sliding-window-framework/#一、最小覆盖子串)
- [二、字符串排列](https://labuladong.online/algo/essential-technique/sliding-window-framework/#二、字符串排列)
- [三、找所有字母异位词](https://labuladong.online/algo/essential-technique/sliding-window-framework/#三、找所有字母异位词)
- [四、最长无重复子串](https://labuladong.online/algo/essential-technique/sliding-window-framework/#四、最长无重复子串)

本文讲解的例题

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [3. 无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) |  🟠   |
| [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | [438. 找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/) |  🟠   |
| [567. Permutation in String](https://leetcode.com/problems/permutation-in-string/) | [567. 字符串的排列](https://leetcode.cn/problems/permutation-in-string/) |  🟠   |
| [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | [76. 最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/) |  🔴   |

前置知识

阅读本文前，你需要先学习：

- [数组基础](https://labuladong.online/algo/data-structure-basic/array-basic/)



### [滑动窗口框架概览](https://labuladong.online/algo/essential-technique/sliding-window-framework/#滑动窗口框架概览)

```java
// 滑动窗口算法伪码框架
void slidingWindow(String s) {
    // 用合适的数据结构记录窗口中的数据，根据具体场景变通
    // 比如说，我想记录窗口中元素出现的次数，就用 map
    // 如果我想记录窗口中的元素和，就可以只用一个 int
    Object window = ...
    
    int left = 0, right = 0;
    while (right < s.length()) {
        // c 是将移入窗口的字符
        char c = s[right];
        window.add(c)
        // 增大窗口
        right++;
        // 进行窗口内数据的一系列更新
        ...

        // *** debug 输出的位置 ***
        // 注意在最终的解法代码中不要 print
        // 因为 IO 操作很耗时，可能导致超时
        printf("window: [%d, %d)\n", left, right);
        // ***********************

        // 判断左侧窗口是否要收缩
        while (left < right && window needs shrink) {
            // d 是将移出窗口的字符
            char d = s[left];
            window.remove(d)
            // 缩小窗口
            left++;
            // 进行窗口内数据的一系列更新
            ...
        }
    }
}
```

**框架中两处 `...` 表示的更新窗口数据的地方，在具体的题目中，你需要做的就是往这里面填代码逻辑**。而且，这两个 `...` 处的操作分别是扩大和缩小窗口的更新操作，等会你会发现它们操作是完全对称的。



### [一、最小覆盖子串](https://labuladong.online/algo/essential-technique/sliding-window-framework/#一、最小覆盖子串)

先来看看力扣第 76 题「[最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/)」难度 Hard：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">76. 最小覆盖子串</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/minimum-window-substring/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/minimum-window-substring/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🔴</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你一个字符串<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>、一个字符串<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">t</code><span>&nbsp;</span>。返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>中涵盖<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">t</code><span>&nbsp;</span>所有字符的最小子串。如果<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>中不存在涵盖<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">t</code><span>&nbsp;</span>所有字符的子串，则返回空字符串<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">""</code><span>&nbsp;</span>。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">注意：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>对于<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">t</code><span>&nbsp;</span>中重复字符，我们寻找的子字符串中该字符数量必须不少于<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">t</code><span>&nbsp;</span>中该字符数量。</li><li>如果<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>中存在这样的子串，我们保证它是唯一的答案。</li></ul><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>s = "ADOBECODEBANC", t = "ABC"
<strong style="font-weight: 600;">输出：</strong>"BANC"
<strong style="font-weight: 600;">解释：</strong>最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>s = "a", t = "a"
<strong style="font-weight: 600;">输出：</strong>"a"
<strong style="font-weight: 600;">解释：</strong>整个字符串 s 是最小覆盖子串。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 3:</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入:</strong> s = "a", t = "aa"
<strong style="font-weight: 600;">输出:</strong> ""
<strong style="font-weight: 600;">解释:</strong> t 中两个字符 'a' 均应包含在 s 的子串中，
因此没有符合条件的子字符串，返回空字符串。</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);"><sup>m == s.length</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);"><sup>n == t.length</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= m, n &lt;= 10<sup>5</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">t</code><span>&nbsp;</span>由英文字母组成</li></ul><strong style="font-weight: 600;">进阶：</strong>你能设计一个在<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">o(m+n)</code><span>&nbsp;</span>时间内解决此问题的算法吗？</div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/minimum-window-substring/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 76. 最小覆盖子串</a>。</strong></details>

```java
class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 扩大窗口
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            // 判断左侧窗口是否要收缩
            while (valid == need.size()) {
                // 在这里更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 缩小窗口
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d, window.get(d) - 1);
                }                    
            }
        }
        // 返回最小覆盖子串
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
```

使用 Java 的读者请注意

对 Java 包装类进行比较时要尤为小心，`Integer`，`String` 等类型应该用 `equals` 方法判定相等，而不能直接用等号 `==`，否则会出错。所以在缩小窗口更新数据的时候，不能直接写为 `window.get(d) == need.get(d)`，而要用 `window.get(d).equals(need.get(d))`，之后的题目代码同理。

上面的代码中，当我们发现某个字符在 `window` 的数量满足了 `need` 的需要，就要更新 `valid`，表示有一个字符已经满足要求。而且，你能发现，两次对窗口内数据的更新操作是完全对称的。

当 `valid == need.size()` 时，说明 `T` 中所有字符已经被覆盖，已经得到一个可行的覆盖子串，现在应该开始收缩窗口了，以便得到「最小覆盖子串」。

移动 `left` 收缩窗口时，窗口内的字符都是可行解，所以应该在收缩窗口的阶段进行最小覆盖子串的更新，以便从可行解中找到长度最短的最终结果。

至此，应该可以完全理解这套框架了，滑动窗口算法又不难，就是细节问题让人烦得很。**以后遇到滑动窗口算法，你就按照这框架写代码，保准没有 bug，还省事儿**。



### [二、字符串排列](https://labuladong.online/algo/essential-technique/sliding-window-framework/#二、字符串排列)

这是力扣第 567 题「[字符串的排列](https://leetcode.cn/problems/permutation-in-string/)」，难度中等：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">567. 字符串的排列</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/permutation-in-string/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/permutation-in-string/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给你两个字符串&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s1</code>&nbsp;和&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s2</code><span>&nbsp;</span>，写一个函数来判断<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s2</code><span>&nbsp;</span>是否包含<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s1</code><strong style="font-weight: 600;">&nbsp;</strong>的排列。如果是，返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">true</code><span>&nbsp;</span>；否则，返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">false</code><span>&nbsp;</span>。</p><p style="line-height: 1.6; overflow-wrap: break-word;">换句话说，<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s1</code><span>&nbsp;</span>的排列之一是<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s2</code><span>&nbsp;</span>的<span>&nbsp;</span><strong style="font-weight: 600;">子串</strong><span>&nbsp;</span>。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>s1 = "ab" s2 = "eidbaooo"
<strong style="font-weight: 600;">输出：</strong>true
<strong style="font-weight: 600;">解释：</strong>s2 包含 s1 的排列之一 ("ba").
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>s1= "ab" s2 = "eidboaoo"
<strong style="font-weight: 600;">输出：</strong>false
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= s1.length, s2.length &lt;= 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s1</code><span>&nbsp;</span>和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s2</code><span>&nbsp;</span>仅包含小写字母</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/permutation-in-string/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 567. 字符串的排列</a>。</strong></details>

```java
class Solution {
    // 判断 s 中是否存在 t 的排列
    public boolean checkInclusion(String t, String s) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).intValue() == need.get(c).intValue())
                    valid++;
            }

            // 判断左侧窗口是否要收缩
            while (right - left >= t.length()) {
                // 在这里判断是否找到了合法的子串
                if (valid == need.size())
                    return true;
                char d = s.charAt(left);
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue())
                        valid--;
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        // 未找到符合条件的子串
        return false;
    }
}
```



### [三、找所有字母异位词](https://labuladong.online/algo/essential-technique/sliding-window-framework/#三、找所有字母异位词)

这是力扣第 438 题「[找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/)」，难度中等：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">438. 找到字符串中所有字母异位词</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/find-all-anagrams-in-a-string/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/find-all-anagrams-in-a-string/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给定两个字符串&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code>&nbsp;和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">p</code>，找到&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><strong style="font-weight: 600;">&nbsp;</strong>中所有&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">p</code><strong style="font-weight: 600;">&nbsp;</strong>的&nbsp;<strong style="font-weight: 600;">异位词&nbsp;</strong>的子串，返回这些子串的起始索引。不考虑答案输出的顺序。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">异位词<span>&nbsp;</span></strong>指由相同字母重排列形成的字符串（包括相同的字符串）。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例&nbsp;1:</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入: </strong>s = "cbaebabacd", p = "abc"
<strong style="font-weight: 600;">输出: </strong>[0,6]
<strong style="font-weight: 600;">解释:</strong>
起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">&nbsp;示例 2:</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入: </strong>s = "abab", p = "ab"
<strong style="font-weight: 600;">输出: </strong>[0,1,2]
<strong style="font-weight: 600;">解释:</strong>
起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示:</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= s.length, p.length &lt;= 3 * 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code>&nbsp;和&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">p</code>&nbsp;仅包含小写字母</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/find-all-anagrams-in-a-string/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 438. 找到字符串中所有字母异位词</a>。</strong></details>



```java
class Solution {
    public List<Integer> findAnagrams(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        // 记录结果
        List<Integer> res = new ArrayList<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            // 判断左侧窗口是否要收缩
            while (right - left >= t.length()) {
                // 当窗口符合条件时，把起始索引加入 res
                if (valid == need.size())
                    res.add(left);
                char d = s.charAt(left);
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return res;
    }
}
```



### [四、最长无重复子串](https://labuladong.online/algo/essential-technique/sliding-window-framework/#四、最长无重复子串)

这是力扣第 3 题「[无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/)」，难度中等：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">3. 无重复字符的最长子串</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/longest-substring-without-repeating-characters/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给定一个字符串<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code><span>&nbsp;</span>，请你找出其中不含有重复字符的&nbsp;<strong style="font-weight: 600;">最长<span>&nbsp;</span><span data-keyword="substring-nonempty">子串</span></strong><strong style="font-weight: 600;">&nbsp;</strong>的长度。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例&nbsp;1:</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入: </strong>s = "abcabcbb"
<strong style="font-weight: 600;">输出: </strong>3 
<strong style="font-weight: 600;">解释:</strong> 因为无重复字符的最长子串是 <code style="font-family: var(--vp-font-mono); padding: 0px; border-radius: 0px;">"abc"</code>，所以其长度为 3。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2:</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入: </strong>s = "bbbbb"
<strong style="font-weight: 600;">输出: </strong>1
<strong style="font-weight: 600;">解释: </strong>因为无重复字符的最长子串是 <code style="font-family: var(--vp-font-mono); padding: 0px; border-radius: 0px;">"b"</code>，所以其长度为 1。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 3:</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入: </strong>s = "pwwkew"
<strong style="font-weight: 600;">输出: </strong>3
<strong style="font-weight: 600;">解释: </strong>因为无重复字符的最长子串是&nbsp;<code style="font-family: var(--vp-font-mono); padding: 0px; border-radius: 0px;">"wke"</code>，所以其长度为 3。
&nbsp;    请注意，你的答案必须是 <strong style="font-weight: 600;">子串 </strong>的长度，<code style="font-family: var(--vp-font-mono); padding: 0px; border-radius: 0px;">"pwke"</code>&nbsp;是一个<em>子序列，</em>不是子串。
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">s</code>&nbsp;由英文字母、数字、符号和空格组成</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 3. 无重复字符的最长子串</a>。</strong></details>



```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        // 记录结果
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 进行窗口内数据的一系列更新
            window.put(c, window.getOrDefault(c, 0) + 1);
            // 判断左侧窗口是否要收缩
            while (window.get(c) > 1) {
                char d = s.charAt(left);
                left++;
                // 进行窗口内数据的一系列更新
                window.put(d, window.get(d) - 1);
            }
            // 在这里更新答案
            res = Math.max(res, right - left);
        }
        return res;
    }
}
```



## 2.3 二分搜索算法核心代码模板

> 写在前面：分析二分查找代码时，不要出现 else，全部展开成 else if 方便理解。把逻辑写对之后再合并分支，提升运行效率。

二分查找主要分三种情况：

- 普通的二分查找，一般数组里面只有一个目标值或者没有，找到就直接返回，查完了没找到就return -1

- 左边界查找：数组中的目标值有多个，返回最左边的那个

- 右边界查找：数组中的目标值有多个，返回最右边的那个

  > 注意：左边界查找和右边界查找一定要注意没找到的情况，此时不能直接return索引，因为所以其实指向了某个特定的值，根据不同的写法，所返回的索引`left`、`right`可能指向小于目标值的最大值或者大于目标值的最小值，所以此时return结果的时候要判断到底是不是目标值，用一个三目运算符，具体见代码

```java
/**
*	二分搜索代码模板
*/

int binary_search(int[] nums, int target) {
        // 统一闭区间
    	int left = 0;
    	int right = nums.length - 1;

    	// 闭区间所以执行条件要包含 left == right
        while (left <= right) {
            // 这种mid求法更安全，相对“(left + right)/2”来说更不容易溢出
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 1、普通二分查找：直接返回
                return mid;

				// 2、左边界查找：别返回，锁定左侧边界
                right = mid - 1;

				// 3、右边界查找：别返回，锁定右侧边界
                left = mid - 1;
            }
        }

        // 1、直接返回
        return -1;
    
    	// 2、左边界查找
    	// 判断 target 是否存在于 nums 中（边界检查）
        if (left < 0 || left >= nums.length) {
            return -1;
        }
        // 判断一下 nums[left] 是不是 target
        return nums[left] == target ? left : -1;
    
    	// 3、右边界查找
    	// 由于 while 的结束条件是 right == left - 1，且现在在求右边界
        // 所以用 right 替代 left - 1 更好记
        // 如果要统一也可以写成 left - 1 ，原理很好理解，我们左右都是闭区间，找到mid之后left = mid + 1 看看后面还有没有，所以最后找到的话 left 是会在 target 右边一位的
        if (right < 0 || right >= nums.length) {
            return -1;
        }
        return nums[right] == target ? right : -1;
    }
```



## 2.4 实际运用二分搜索时的思维框架

此页内容

- [原始的二分搜索代码](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#原始的二分搜索代码)
- [运用二分搜索的套路框架](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#运用二分搜索的套路框架)
- [例题一、珂珂吃香蕉](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#例题一、珂珂吃香蕉)
- [例题二、运送货物](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#例题二、运送货物)
- [例题三、分割数组](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#例题三、分割数组)

本文讲解的例题

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [1011. Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | [1011. 在 D 天内送达包裹的能力](https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/) |  🟠   |
| [410. Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) | [410. 分割数组的最大值](https://leetcode.cn/problems/split-array-largest-sum/) |  🔴   |
| [875. Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | [875. 爱吃香蕉的珂珂](https://leetcode.cn/problems/koko-eating-bananas/) |  🟠   |



### [原始的二分搜索代码](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#原始的二分搜索代码)

```java
// 搜索左侧边界
int left_bound(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int left = 0, right = nums.length;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            // 当找到 target 时，收缩右侧边界
            right = mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid;
        }
    }
    return left;
}
```



```java
// 搜索右侧边界
int right_bound(int[] nums, int target) {
    if (nums.length == 0) return -1;
    int left = 0, right = nums.length;

    while (left < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            // 当找到 target 时，收缩左侧边界
            left = mid + 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid;
        }
    }
    return left - 1;
}
```



### [例题一、珂珂吃香蕉](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#例题一、珂珂吃香蕉)

这是力扣第 875 题「[爱吃香蕉的珂珂](https://leetcode.cn/problems/koko-eating-bananas/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem; color: rgb(60, 60, 67); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, STHeiti, &quot;Microsoft YaHei&quot;, SimSun, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">875. 爱吃香蕉的珂珂</strong>&nbsp;|<span>&nbsp;</span><span><a href="https://leetcode.cn/problems/koko-eating-bananas/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣</a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a href="https://leetcode.com/problems/koko-eating-bananas/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode</a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">珂珂喜欢吃香蕉。这里有<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n</code><span>&nbsp;</span>堆香蕉，第<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">i</code><span>&nbsp;</span>堆中有&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">piles[i]</code>&nbsp;根香蕉。警卫已经离开了，将在<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">h</code><span>&nbsp;</span>小时后回来。</p><p style="line-height: 1.6; overflow-wrap: break-word;">珂珂可以决定她吃香蕉的速度<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>（单位：根/小时）。每个小时，她将会选择一堆香蕉，从中吃掉<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>根。如果这堆香蕉少于<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉。&nbsp;&nbsp;</p><p style="line-height: 1.6; overflow-wrap: break-word;">珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。</p><p style="line-height: 1.6; overflow-wrap: break-word;">返回她可以在<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">h</code><span>&nbsp;</span>小时内吃掉所有香蕉的最小速度<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code>（<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>为整数）。</p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"></ul><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>piles = [3,6,7,11], h = 8
<strong style="font-weight: 600;">输出：</strong>4
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>piles = [30,11,23,4,20], h = 5
<strong style="font-weight: 600;">输出：</strong>30
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 3：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>piles = [30,11,23,4,20], h = 6
<strong style="font-weight: 600;">输出：</strong>23
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= piles.length &lt;= 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">piles.length &lt;= h &lt;= 10<sup>9</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= piles[i] &lt;= 10<sup>9</sup></code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/koko-eating-bananas/" class="" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 875. 爱吃香蕉的珂珂</a>。</strong></details>

```java
class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 1000000000 + 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (f(piles, mid) == H) {
                // 搜索左侧边界，则需要收缩右侧边界
                right = mid;
            } else if (f(piles, mid) < H) {
                // 需要让 f(x) 的返回值大一些
                right = mid;
            } else if (f(piles, mid) > H) {
                // 需要让 f(x) 的返回值小一些
                left = mid + 1;
            }
        }
        return left;
    }
}
```

Tip

我这里采用的是左闭右开的二分搜索写法，如果想用两端都闭的写法，只要修改 `right` 的初始值和 `right` 更新的逻辑即可：

```java
// 两端都闭的二分搜索写法
int minEatingSpeed(int[] piles, int H) {
    int left = 1;
    // right 是闭区间，所以这里改成最大取值
    int right = 1000000000;

    // right 是闭区间，所以这里改成 <=
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (f(piles, mid) <= H) {
            // right 是闭区间，所以这里用 mid - 1
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
```



至此，这道题就解决了。我们代码框架中多余的 if 分支主要是帮助理解的，写出正确解法后建议合并多余的分支，可以提高算法运行的效率：

```java
class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 1000000000 + 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (f(piles, mid) <= H) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // f(x) 随着 x 的增加单调递减
    long f(int[] piles, int x) {
        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / x;
            if (piles[i] % x > 0) {
                hours++;
            }
        }
        return hours;
    }
}
```

### [例题二、运送货物](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#例题二、运送货物)

再看看力扣第 1011 题「[在 D 天内送达包裹的能力](https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem; color: rgb(60, 60, 67); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, STHeiti, &quot;Microsoft YaHei&quot;, SimSun, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">1011. 在 D 天内送达包裹的能力</strong>&nbsp;|<span>&nbsp;</span><span><a href="https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣</a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a href="https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode</a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">传送带上的包裹必须在<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">days</code><span>&nbsp;</span>天内从一个港口运送到另一个港口。</p><p style="line-height: 1.6; overflow-wrap: break-word;">传送带上的第<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">i</code>&nbsp;个包裹的重量为&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">weights[i]</code>。每一天，我们都会按给出重量（<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">weights</code>）的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。</p><p style="line-height: 1.6; overflow-wrap: break-word;">返回能在<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">days</code><span>&nbsp;</span>天内将传送带上的所有包裹送达的船的最低运载能力。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>weights = [1,2,3,4,5,6,7,8,9,10], days = 5
<strong style="font-weight: 600;">输出：</strong>15
<strong style="font-weight: 600;">解释：</strong>
船舶最低载重 15 就能够在 5 天内送达所有包裹，如下所示：
第 1 天：1, 2, 3, 4, 5
第 2 天：6, 7
第 3 天：8
第 4 天：9
第 5 天：10
请注意，货物必须按照给定的顺序装运，因此使用载重能力为 14 的船舶并将包装分成 (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) 是不允许的。 
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>weights = [3,2,2,4,1,4], days = 3
<strong style="font-weight: 600;">输出：</strong>6
<strong style="font-weight: 600;">解释：</strong>
船舶最低载重 6 就能够在 3 天内送达所有包裹，如下所示：
第 1 天：3, 2
第 2 天：2, 4
第 3 天：1, 4
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong class="example" style="font-weight: 600;">示例 3：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>weights = [1,2,3,1,1], days = 4
<strong style="font-weight: 600;">输出：</strong>3
<strong style="font-weight: 600;">解释：</strong>
第 1 天：1
第 2 天：2
第 3 天：3
第 4 天：1, 1
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= days &lt;= weights.length &lt;= 5 * 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= weights[i] &lt;= 500</code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/" class="" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 1011. 在 D 天内送达包裹的能力</a>。</strong></details>

```java
public int shipWithinDays(int[] weights, int days) {
    int left = 0;
    // 注意，right 是开区间，所以额外加一
    int right = 1;
    for (int w : weights) {
        left = Math.max(left, w);
        right += w;
    }
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (f(weights, mid) == days) {
            // 搜索左侧边界，则需要收缩右侧边界
            right = mid;
        } else if (f(weights, mid) < days) {
            // 需要让 f(x) 的返回值大一些
            right = mid;
        } else if (f(weights, mid) > days) {
            // 需要让 f(x) 的返回值小一些
            left = mid + 1;
        }
    }
    
    return left;
}
```

到这里，这道题的解法也写出来了，我们合并一下多余的 if 分支，提高代码运行速度，最终代码如下：



```java
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 1;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (f(weights, mid) <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    int f(int[] weights, int x) {
        int days = 0;
        for (int i = 0; i < weights.length; ) {
            int cap = x;
            while (i < weights.length) {
                if (cap < weights[i]) break;
                else cap -= weights[i];
                i++;
            }
            days++;
        }
        return days;
    }
}
```



### [例题三、分割数组](https://labuladong.online/algo/frequency-interview/binary-search-in-action/#例题三、分割数组)

我们实操一下力扣第 410 题「[分割数组的最大值](https://leetcode.cn/problems/split-array-largest-sum/)」，难度为困难：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem; color: rgb(60, 60, 67); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, STHeiti, &quot;Microsoft YaHei&quot;, SimSun, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">410. 分割数组的最大值</strong>&nbsp;|<span>&nbsp;</span><span><a href="https://leetcode.cn/problems/split-array-largest-sum/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣</a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a href="https://leetcode.com/problems/split-array-largest-sum/" class="" target="_blank" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode</a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🔴</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给定一个非负整数数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>和一个整数&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><span>&nbsp;</span>，你需要将这个数组分成&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><em>&nbsp;</em>个非空的连续子数组。</p><p style="line-height: 1.6; overflow-wrap: break-word;">设计一个算法使得这&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">k</code><em>&nbsp;</em>个子数组各自和的最大值最小。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>nums = [7,2,5,10,8], k = 2
<strong style="font-weight: 600;">输出：</strong>18
<strong style="font-weight: 600;">解释：</strong>
一共有四种方法将 nums 分割为 2 个子数组。 
其中最好的方式是将其分为 [7,2,5] 和 [10,8] 。
因为此时这两个子数组各自的和的最大值为18，在所有情况中最小。</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>nums = [1,2,3,4,5], k = 2
<strong style="font-weight: 600;">输出：</strong>9
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 3：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>nums = [1,4,4], k = 3
<strong style="font-weight: 600;">输出：</strong>4
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= nums.length &lt;= 1000</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= k &lt;= min(50, nums.length)</code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/split-array-largest-sum/" class="" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 410. 分割数组的最大值</a>。</strong></details>
```java
class Solution {
     public int splitArray(int[] nums, int m) {
        return shipWithinDays(nums, m);
    }

    int shipWithinDays(int[] weights, int days) {
        // 见上文
    }

    int f(int[] weights, int x) {
        // 见上文
    }
}
```



## 2.5 小而美的算法技巧：前缀和数组

此页内容

- [一维数组中的前缀和](https://labuladong.online/algo/data-structure/prefix-sum/#一维数组中的前缀和)
- [二维矩阵中的前缀和](https://labuladong.online/algo/data-structure/prefix-sum/#二维矩阵中的前缀和)
- [拓展延伸](https://labuladong.online/algo/data-structure/prefix-sum/#拓展延伸)

本文讲解的例题

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) | [303. 区域和检索 - 数组不可变](https://leetcode.cn/problems/range-sum-query-immutable/) |  🟢   |
| [304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/) | [304. 二维区域和检索 - 矩阵不可变](https://leetcode.cn/problems/range-sum-query-2d-immutable/) |  🟠   |

前置知识

阅读本文前，你需要先学习：

- [数组基础](https://labuladong.online/algo/data-structure-basic/array-basic/)

前缀和技巧适用于快速、频繁地计算一个索引区间内的元素之和。

### [一维数组中的前缀和](https://labuladong.online/algo/data-structure/prefix-sum/#一维数组中的前缀和)

先看一道例题，力扣第 303 题「[区域和检索 - 数组不可变](https://leetcode.cn/problems/range-sum-query-immutable/)」，让你计算数组区间内元素的和，这是一道标准的前缀和问题：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">303. 区域和检索 - 数组不可变</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/range-sum-query-immutable/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/range-sum-query-immutable/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟢</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">给定一个整数数组 &nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code>，处理以下类型的多个查询:</p><ol style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li>计算索引&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left</code>&nbsp;和&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">right</code>&nbsp;（包含<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left</code><span>&nbsp;</span>和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">right</code>）之间的<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>元素的<span>&nbsp;</span><strong style="font-weight: 600;">和</strong><span>&nbsp;</span>，其中&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left &lt;= right</code></li></ol><p style="line-height: 1.6; overflow-wrap: break-word;">实现<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">NumArray</code><span>&nbsp;</span>类：</p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">NumArray(int[] nums)</code><span>&nbsp;</span>使用数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code><span>&nbsp;</span>初始化对象</li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">int sumRange(int i, int j)</code><span>&nbsp;</span>返回数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums</code>&nbsp;中索引&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left</code>&nbsp;和&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">right</code>&nbsp;之间的元素的<span>&nbsp;</span><strong style="font-weight: 600;">总和</strong><span>&nbsp;</span>，包含&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">left</code>&nbsp;和&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">right</code>&nbsp;两点（也就是&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">nums[left] + nums[left + 1] + ... + nums[right]</code>&nbsp;)</li></ul><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
<strong style="font-weight: 600;">输出：
</strong>[null, 1, -1, -3]

<strong style="font-weight: 600;">解释：</strong>
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1)) 
numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-10<sup>5</sup>&nbsp;&lt;= nums[i] &lt;=&nbsp;10<sup>5</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= i &lt;= j &lt; nums.length</code></li><li>最多调用<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">10<sup>4</sup></code><span>&nbsp;</span>次<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">sumRange</code><strong style="font-weight: 600;"><span>&nbsp;</span></strong>方法</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/range-sum-query-immutable/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 303. 区域和检索 - 数组不可变</a>。</strong></details>

```java
class NumArray {
    // 前缀和数组
    private int[] preSum;

    // 输入一个数组，构造前缀和
    public NumArray(int[] nums) {
        // preSum[0] = 0，便于计算累加和
        preSum = new int[nums.length + 1];
        // 计算 nums 的累加和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    // 查询闭区间 [left, right] 的累加和
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}
```

核心思路是我们 new 一个新的数组 `preSum` 出来，`preSum[i]` 记录 `nums[0..i-1]` 的累加和，看图 10=3+5+210=3+5+2：

![img](https://labuladong.online/algo/images/difference/1.jpeg)

看这个 `preSum` 数组，如果我想求索引区间 `[1, 4]` 内的所有元素之和，就可以通过 `preSum[5] - preSum[1]` 得出。

这样，`sumRange` 函数仅仅需要做一次减法运算，避免了每次进行 for 循环调用，最坏时间复杂度为常数 O(1)*O*(1)。



这个技巧在生活中运用也挺广泛的，比方说，你们班上有若干同学，每个同学有一个期末考试的成绩（满分 100 分），那么请你实现一个 API，输入任意一个分数段，返回有多少同学的成绩在这个分数段内。

那么，你可以先通过计数排序的方式计算每个分数具体有多少个同学，然后利用前缀和技巧来实现分数段查询的 API：

```java
// 存储着所有同学的分数
int[] scores = new int[]{...};
// 试卷满分 100 分
int[] count = new int[100 + 1];

// 记录每个分数有几个同学
for (int score : scores) {
    count[score]++;
}
// 构造前缀和
for (int i = 1; i < count.length; i++) {
    count[i] = count[i] + count[i-1];
}

// 利用 count 这个前缀和数组进行分数段查询

// 查询分数在 [80, 90] 之间的同学有多少人
int result = count[90] - count[80];
```

接下来，我们看一看前缀和思路在二维数组中如何运用。



### [二维矩阵中的前缀和](https://labuladong.online/algo/data-structure/prefix-sum/#二维矩阵中的前缀和)

这是力扣第 304 题「[二维区域和检索 - 矩阵不可变](https://leetcode.cn/problems/range-sum-query-2d-immutable/)」，其实和上一题类似，上一题是让你计算子数组的元素之和，这道题让你计算二维矩阵中子矩阵的元素之和：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">304. 二维区域和检索 - 矩阵不可变</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/range-sum-query-2d-immutable/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/range-sum-query-2d-immutable/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;"><big><small>给定一个二维矩阵<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">matrix</code>，</small></big>以下类型的多个请求：</p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><big><small>计算其子矩形范围内元素的总和，该子矩阵的<span>&nbsp;</span><strong style="font-weight: 600;">左上角</strong><span>&nbsp;</span>为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">(row1,&nbsp;col1)</code><span>&nbsp;</span>，<strong style="font-weight: 600;">右下角</strong><span>&nbsp;</span>为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">(row2,&nbsp;col2)</code><span>&nbsp;</span>。</small></big></li></ul><p style="line-height: 1.6; overflow-wrap: break-word;">实现<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">NumMatrix</code><span>&nbsp;</span>类：</p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">NumMatrix(int[][] matrix)</code>&nbsp;给定整数矩阵<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">matrix</code><span>&nbsp;</span>进行初始化</li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">int sumRegion(int row1, int col1, int row2, int col2)</code>&nbsp;返回<big><small><span>&nbsp;</span><strong style="font-weight: 600;">左上角</strong></small></big><big><small><span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">(row1,&nbsp;col1)</code>&nbsp;、<strong style="font-weight: 600;">右下角</strong>&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">(row2,&nbsp;col2)</code></small></big><span>&nbsp;</span>所描述的子矩阵的元素<span>&nbsp;</span><strong style="font-weight: 600;">总和</strong><span>&nbsp;</span>。</li></ul><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><p style="line-height: 1.6; overflow-wrap: break-word;"><img src="https://labuladong.online/algo/images/lc/1626332422-wUpUHT-image.png" style="max-width: 100%; width: 200px;"></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入:</strong> 
["NumMatrix","sumRegion","sumRegion","sumRegion"]
[[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]
<strong style="font-weight: 600;">输出:</strong> 
[null, 8, 11, 12]

<strong style="font-weight: 600;">解释:</strong>
NumMatrix numMatrix = new NumMatrix([[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]);
numMatrix.sumRegion(2, 1, 4, 3); // return 8 (红色矩形框的元素总和)
numMatrix.sumRegion(1, 1, 2, 2); // return 11 (绿色矩形框的元素总和)
numMatrix.sumRegion(1, 2, 2, 4); // return 12 (蓝色矩形框的元素总和)
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">m == matrix.length</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n == matrix[i].length</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= m,&nbsp;n &lt;=&nbsp;200</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">-10<sup>5</sup>&nbsp;&lt;= matrix[i][j] &lt;= 10<sup>5</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= row1 &lt;= row2 &lt; m</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= col1 &lt;= col2 &lt; n</code></li><li>最多调用<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">10<sup>4</sup></code><span>&nbsp;</span>次&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">sumRegion</code><span>&nbsp;</span>方法</li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/range-sum-query-2d-immutable/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 304. 二维区域和检索 - 矩阵不可变</a>。</strong></details>

![img](https://labuladong.online/algo/images/presum/5.jpeg)

而这四个大矩阵有一个共同的特点，就是左上角都是 `(0, 0)` 原点。

那么做这道题更好的思路和一维数组中的前缀和是非常类似的，我们可以维护一个二维 `preSum` 数组，专门记录以原点为顶点的矩阵的元素之和，就可以用几次加减运算算出任何一个子矩阵的元素和：

java 🟢cpp 🤖python 🤖go 🤖javascript 🤖



```java
class NumMatrix {
    // preSum[i][j] 记录矩阵 [0, 0, i-1, j-1] 的元素和
    private int[][] preSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if (m == 0 || n == 0) return;
        // 构造前缀和矩阵
        preSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 计算每个矩阵 [0, 0, i, j] 的元素和
                preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] + matrix[i - 1][j - 1] - preSum[i-1][j-1];
            }
        }
    }

    // 计算子矩阵 [x1, y1, x2, y2] 的元素和
    public int sumRegion(int x1, int y1, int x2, int y2) {
        // 目标矩阵之和由四个相邻矩阵运算获得
        return preSum[x2+1][y2+1] - preSum[x1][y2+1] - preSum[x2+1][y1] + preSum[x1][y1];
    }
}
```



## 2.6 小而美的算法技巧：差分数组

此页内容

- [算法实践](https://labuladong.online/algo/data-structure/diff-array/#算法实践)

本文讲解的例题

|                           LeetCode                           |                             力扣                             | 难度 |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| [1094. Car Pooling](https://leetcode.com/problems/car-pooling/) |   [1094. 拼车](https://leetcode.cn/problems/car-pooling/)    |  🟠   |
| [1109. Corporate Flight Bookings](https://leetcode.com/problems/corporate-flight-bookings/) | [1109. 航班预订统计](https://leetcode.cn/problems/corporate-flight-bookings/) |  🟠   |
| [370. Range Addition](https://leetcode.com/problems/range-addition/)🔒 | [370. 区间加法](https://leetcode.cn/problems/range-addition/)🔒 |  🟠   |

前置知识

阅读本文前，你需要先学习：

- [数组基础](https://labuladong.online/algo/data-structure-basic/array-basic/)
- [前缀和技巧](https://labuladong.online/algo/data-structure/prefix-sum/)

[前缀和技巧](https://labuladong.online/algo/data-structure/prefix-sum/) 主要适用的场景是原始数组不会被修改的情况下，频繁查询某个区间的累加和，核心代码就是下面这段：

```java
class PrefixSum {
    // 前缀和数组
    private int[] preSum;

    // 输入一个数组，构造前缀和
    public PrefixSum(int[] nums) {
        // preSum[0] = 0，便于计算累加和
        preSum = new int[nums.length + 1];
        // 计算 nums 的累加和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }
    
    // 查询闭区间 [left, right] 的累加和
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}
```

![img](https://labuladong.online/algo/images/difference/1.jpeg)



本文讲一个和前缀和思想非常类似的算法技巧「差分数组」，**差分数组的主要适用场景是频繁对原始数组的某个区间的元素进行增减**。

```java
int[] diff = new int[nums.length];
// 构造差分数组
diff[0] = nums[0];
for (int i = 1; i < nums.length; i++) {
    diff[i] = nums[i] - nums[i - 1];
}
```

![img](https://labuladong.online/algo/images/difference/2.jpeg)

通过这个 `diff` 差分数组是可以反推出原始数组 `nums` 的，代码逻辑如下：

```java
int[] res = new int[diff.length];
// 根据差分数组构造结果数组
res[0] = diff[0];
for (int i = 1; i < diff.length; i++) {
    res[i] = res[i - 1] + diff[i];
}
```

**这样构造差分数组 `diff`，就可以快速进行区间增减的操作**，如果你想对区间 `nums[i..j]` 的元素全部加 3，那么只需要让 `diff[i] += 3`，然后再让 `diff[j+1] -= 3` 即可：

![img](https://labuladong.online/algo/images/difference/3.jpeg)

**原理很简单，回想 `diff` 数组反推 `nums` 数组的过程，`diff[i] += 3` 意味着给 `nums[i..]` 所有的元素都加了 3，然后 `diff[j+1] -= 3` 又意味着对于 `nums[j+1..]` 所有元素再减 3，那综合起来，是不是就是对 `nums[i..j]` 中的所有元素都加 3 了**？

### [算法实践](https://labuladong.online/algo/data-structure/diff-array/#算法实践)

力扣第 370 题「[区间加法](https://leetcode.cn/problems/range-addition/)」直接考察了差分数组技巧，相当于给你输入一个长度为 `n` 的 `nums` 数组，其中的元素初始值都为 0，让你对其中的区间元素进行增减操作，最后返回最终的 `nums` 数组。

```java
class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        // nums 初始化为全 0
        int[] nums = new int[length];
        // 构造差分解法
        Difference df = new Difference(nums);
        for (int[] update : updates) {
            int i = update[0];
            int j = update[1];
            int val = update[2];
            df.increment(i, j, val);
        }
        return df.result();
    }

    class Difference {
        // 差分数组
        private int[] diff;

        public Difference(int[] nums) {
            assert nums.length > 0;
            diff = new int[nums.length];
            // 构造差分数组
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = nums[i] - nums[i - 1];
            }
        }

        // 给闭区间 [i, j] 增加 val（可以是负数）
        public void increment(int i, int j, int val) {
            diff[i] += val;
            if (j + 1 < diff.length) {
                diff[j + 1] -= val;
            }
        }

        public int[] result() {
            int[] res = new int[diff.length];
            // 根据差分数组构造结果数组
            res[0] = diff[0];
            for (int i = 1; i < diff.length; i++) {
                res[i] = res[i - 1] + diff[i];
            }
            return res;
        }
    }

}
```

当然，实际的算法题可能需要我们对题目进行联想和抽象，不会这么直接地让你看出来要用差分数组技巧，这里看一下力扣第 1109 题「[航班预订统计](https://leetcode.cn/problems/corporate-flight-bookings/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem; color: rgb(60, 60, 67); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, STHeiti, &quot;Microsoft YaHei&quot;, SimSun, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">1109. 航班预订统计</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/corporate-flight-bookings/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/corporate-flight-bookings/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">这里有&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n</code>&nbsp;个航班，它们分别从<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1</code><span>&nbsp;</span>到<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n</code><span>&nbsp;</span>进行编号。</p><p style="line-height: 1.6; overflow-wrap: break-word;">有一份航班预订表&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">bookings</code><span>&nbsp;</span>，表中第&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">i</code>&nbsp;条预订记录&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">bookings[i] = [first<sub>i</sub>, last<sub>i</sub>, seats<sub>i</sub>]</code>&nbsp;意味着在从<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">first<sub>i</sub></code>&nbsp;到<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">last<sub>i</sub></code><span>&nbsp;</span>（<strong style="font-weight: 600;">包含</strong><span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">first<sub>i</sub></code><span>&nbsp;</span>和<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">last<sub>i</sub></code><span>&nbsp;</span>）的<span>&nbsp;</span><strong style="font-weight: 600;">每个航班</strong><span>&nbsp;</span>上预订了<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">seats<sub>i</sub></code>&nbsp;个座位。</p><p style="line-height: 1.6; overflow-wrap: break-word;">请你返回一个长度为<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">n</code><span>&nbsp;</span>的数组&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">answer</code>，里面的元素是每个航班预定的座位总数。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
<strong style="font-weight: 600;">输出：</strong>[10,55,45,25,25]
<strong style="font-weight: 600;">解释：</strong>
航班编号        1   2   3   4   5
预订记录 1 ：   10  10
预订记录 2 ：       20  20
预订记录 3 ：       25  25  25  25
总座位数：      10  55  45  25  25
因此，answer = [10,55,45,25,25]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>bookings = [[1,2,10],[2,2,15]], n = 2
<strong style="font-weight: 600;">输出：</strong>[10,25]
<strong style="font-weight: 600;">解释：</strong>
航班编号        1   2
预订记录 1 ：   10  10
预订记录 2 ：       15
总座位数：      10  25
因此，answer = [10,25]
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= n &lt;= 2 * 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= bookings.length &lt;= 2 * 10<sup>4</sup></code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">bookings[i].length == 3</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= first<sub>i</sub><span>&nbsp;</span>&lt;= last<sub>i</sub><span>&nbsp;</span>&lt;= n</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= seats<sub>i</sub><span>&nbsp;</span>&lt;= 10<sup>4</sup></code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/corporate-flight-bookings/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 1109. 航班预订统计</a>。</strong></details>

```java
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        // nums 初始化为全 0
        int[] nums = new int[n];
        // 构造差分解法
        Difference df = new Difference(nums);

        for (int[] booking : bookings) {
            // 注意转成数组索引要减一哦
            int i = booking[0] - 1;
            int j = booking[1] - 1;
            int val = booking[2];
            // 对区间 nums[i..j] 增加 val
            df.increment(i, j, val);
        }
        // 返回最终的结果数组
        return df.result();
    }

    class Difference {
        // 差分数组
        private int[] diff;

        public Difference(int[] nums) {
            assert nums.length > 0;
            diff = new int[nums.length];
            // 构造差分数组
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = nums[i] - nums[i - 1];
            }
        }

        // 给闭区间 [i, j] 增加 val（可以是负数）
        public void increment(int i, int j, int val) {
            diff[i] += val;
            if (j + 1 < diff.length) {
                diff[j + 1] -= val;
            }
        }

        public int[] result() {
            int[] res = new int[diff.length];
            // 根据差分数组构造结果数组
            res[0] = diff[0];
            for (int i = 1; i < diff.length; i++) {
                res[i] = res[i - 1] + diff[i];
            }
            return res;
        }
    }

}
```



还有一道很类似的题目是力扣第 1094 题「[拼车](https://leetcode.cn/problems/car-pooling/)」：

<details class="hint-container details" open="" style="background: var(--detail-c-bg); transition: background var(--vp-t-transform),color var(--vp-t-transform); display: block; margin-block: 0.75rem; padding: 1.25rem 1rem; border-radius: 0.5rem; color: rgb(60, 60, 67); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, STHeiti, &quot;Microsoft YaHei&quot;, SimSun, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; white-space: normal; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary style="position: relative; margin: -1rem -1rem 0.5em; padding-block: 1em; padding-inline: 3em 1.5em; list-style: none; font-size: var(--hint-font-size); cursor: pointer;"><strong style="font-weight: 600;">1094. 拼车</strong>&nbsp;|<span>&nbsp;</span><span><a target="_blank" href="https://leetcode.cn/problems/car-pooling/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣<externallinkicon></externallinkicon></a><span>&nbsp;</span>|<span>&nbsp;</span></span><span><a target="_blank" href="https://leetcode.com/problems/car-pooling/" rel="noopener noreferrer" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">LeetCode<externallinkicon></externallinkicon></a><span>&nbsp;</span>|</span><span>&nbsp;</span>&nbsp;🟠</summary><div><p style="line-height: 1.6; overflow-wrap: break-word;">车上最初有&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">capacity</code>&nbsp;个空座位。车&nbsp;<strong style="font-weight: 600;">只能&nbsp;</strong>向一个方向行驶（也就是说，<strong style="font-weight: 600;">不允许掉头或改变方向</strong>）</p><p style="line-height: 1.6; overflow-wrap: break-word;">给定整数&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">capacity</code>&nbsp;和一个数组<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">trips</code><span>&nbsp;</span>, &nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">trip[i] = [numPassengers<sub>i</sub>, from<sub>i</sub>, to<sub>i</sub>]</code>&nbsp;表示第<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">i</code><span>&nbsp;</span>次旅行有&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">numPassengers<sub>i</sub></code>&nbsp;乘客，接他们和放他们的位置分别是&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">from<sub>i</sub></code>&nbsp;和&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">to<sub>i</sub></code>&nbsp;。这些位置是从汽车的初始位置向东的公里数。</p><p style="line-height: 1.6; overflow-wrap: break-word;">当且仅当你可以在所有给定的行程中接送所有乘客时，返回&nbsp;<code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">true</code>，否则请返回<span>&nbsp;</span><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">false</code>。</p><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 1：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>trips = [[2,1,5],[3,3,7]], capacity = 4
<strong style="font-weight: 600;">输出：</strong>false
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">示例 2：</strong></p><pre style="text-align: left; direction: ltr; white-space: pre; word-spacing: normal; word-break: normal; overflow-wrap: unset; tab-size: 4; hyphens: none; overflow: auto;"><strong style="font-weight: 600;">输入：</strong>trips = [[2,1,5],[3,3,7]], capacity = 5
<strong style="font-weight: 600;">输出：</strong>true
</pre><p style="line-height: 1.6; overflow-wrap: break-word;"><strong style="font-weight: 600;">提示：</strong></p><ul style="line-height: 1.6; overflow-wrap: break-word; padding-inline-start: 1.2em;"><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= trips.length &lt;= 1000</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">trips[i].length == 3</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= numPassengers<sub>i</sub>&nbsp;&lt;= 100</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">0 &lt;= from<sub>i</sub>&nbsp;&lt; to<sub>i</sub>&nbsp;&lt;= 1000</code></li><li><code style="font-family: var(--vp-font-mono); margin: 0px; padding: 3px 6px; border-radius: 4px; background: var(--detail-c-soft); font-size: 0.875em; overflow-wrap: break-word; transition: background-color var(--vp-t-color),color var(--vp-t-color);">1 &lt;= capacity &lt;= 10<sup>5</sup></code></li></ul></div><strong style="font-weight: 600; font-size: small;">题目来源：<a href="https://leetcode.cn/problems/car-pooling/" target="_blank" style="color: var(--vp-c-accent); font-weight: 500; text-decoration: none; overflow-wrap: break-word;">力扣 1094. 拼车</a>。</strong></details>

```java
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // 最多有 1000 个车站
        int[] nums = new int[1001];
        // 构造差分解法
        Difference df = new Difference(nums);

        for (int[] trip : trips) {
            // 乘客数量
            int val = trip[0];
            // 第 trip[1] 站乘客上车
            int i = trip[1];
            // 第 trip[2] 站乘客已经下车，
            // 即乘客在车上的区间是 [trip[1], trip[2] - 1]
            int j = trip[2] - 1;
            // 进行区间操作
            df.increment(i, j, val);
        }

        int[] res = df.result();

        // 客车自始至终都不应该超载
        for (int i = 0; i < res.length; i++) {
            if (capacity < res[i]) {
                return false;
            }
        }
        return true;
    }

    // 差分数组工具类
    class Difference {
        // 差分数组
        private int[] diff;

        // 输入一个初始数组，区间操作将在这个数组上进行
        public Difference(int[] nums) {
            assert nums.length > 0;
            diff = new int[nums.length];
            // 根据初始数组构造差分数组
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = nums[i] - nums[i - 1];
            }
        }

        // 给闭区间 [i, j] 增加 val（可以是负数）
        public void increment(int i, int j, int val) {
            diff[i] += val;
            if (j + 1 < diff.length) {
                diff[j + 1] -= val;
            }
        }

        // 返回结果数组
        public int[] result() {
            int[] res = new int[diff.length];
            // 根据差分数组构造结果数组
            res[0] = diff[0];
            for (int i = 1; i < diff.length; i++) {
                res[i] = res[i - 1] + diff[i];
            }
            return res;
        }
    }

}
```

