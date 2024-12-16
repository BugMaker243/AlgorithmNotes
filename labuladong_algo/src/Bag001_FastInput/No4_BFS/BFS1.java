package Bag001_FastInput.No4_BFS;

import java.util.LinkedList;
import java.util.Queue;


/**
 *  这种层序遍历写法是最简单的
 *  但是他没有记录当前是遍历的第几层
 *
 * */

// 基本的二叉树节点
class TreeNode {
    int val;
    TreeNode left, right;
}


public class BFS1 {

    // 二叉树的遍历框架
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        traverse(root.right);
    }

    void levelOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            // 访问 cur 节点
            System.out.println(cur.val);

            // 把 cur 的左右子节点加入队列
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
    }
}
