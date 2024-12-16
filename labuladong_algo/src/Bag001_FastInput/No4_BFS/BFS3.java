package Bag001_FastInput.No4_BFS;

import java.util.LinkedList;
import java.util.Queue;


/**
 *  第二种层序遍历仅仅针对树进行，每层之间的depth相差为1
 *  第三种层序遍历维护了一个state类，每层的depth可以随意指定
 *
 * */

class State {
    TreeNode node;
    int depth;

    State(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}

public class BFS3 {

    void levelOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<State> q = new LinkedList<>();
        // 根节点的路径权重和是 1
        q.offer(new State(root, 1));

        while (!q.isEmpty()) {
            State cur = q.poll();
            // 访问 cur 节点，同时知道它的路径权重和
            System.out.println("depth = " + cur.depth + ", val = " + cur.node.val);

            // 把 cur 的左右子节点加入队列
            if (cur.node.left != null) {
                q.offer(new State(cur.node.left, cur.depth + 1));
            }
            if (cur.node.right != null) {
                q.offer(new State(cur.node.right, cur.depth + 1));
            }
        }
    }

}
