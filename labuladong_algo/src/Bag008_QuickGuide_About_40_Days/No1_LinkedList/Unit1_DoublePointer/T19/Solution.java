//package Bag008_QuickGuide_About_40_Days.No1_LinkedList.Unit1_DoublePointer.T19;
//
//import Bag001_FastInput.*;
//
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        // 虚拟头结点
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        // 删除倒数第 n 个，要先找倒数第 n + 1 个节点
//        ListNode x = findFromEnd(dummy, n + 1);
//        // 删掉倒数第 n 个节点
//        x.next = x.next.next;
//        return dummy.next;
//    }
//
//    private ListNode findFromEnd(ListNode head, int k) {
//        // 代码见上文
//    }
//}