package Bag001_FastInput.No7_BTPaths_BFS;

import java.util.*;

// 自定义类，用于保存节点以及从根节点到该节点的路径
class State {
    TreeNode node;
    List<Integer> path;

    // 构造函数
    public State(TreeNode node, List<Integer> path) {
        this.node = node;
        this.path = path;
    }

    // 获取路径的字符串表示
    public String getVal() {
        return node.val + ": " + String.join("->", path.stream().map(String::valueOf).toArray(String[]::new));
    }
}

// 二叉树节点类
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    // 输入二叉树的根节点，返回所有从根节点到叶子节点的路径
    public List<List<Integer>> findAllPaths(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        // BFS 遍历二叉树
        Queue<State> q = new LinkedList<>();
        q.offer(new State(root, new ArrayList<>(Collections.singletonList(root.val))));

        while (!q.isEmpty()) {
            State cur = q.poll();
            TreeNode node = cur.node;
            List<Integer> path = cur.path;

            // 如果当前节点是叶子节点，保存路径
            if (node.left == null && node.right == null) {
                res.add(new ArrayList<>(path));
            }

            // 否则继续向下遍历
            if (node.left != null) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(node.left.val);
                q.offer(new State(node.left, newPath));
            }

            if (node.right != null) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(node.right.val);
                q.offer(new State(node.right, newPath));
            }
        }

        return res;
    }

    // 创建二叉树的示例（可根据实际需要修改）
    public static TreeNode createRoot(Integer[] values) {
        if (values == null || values.length == 0) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;

        while (index < values.length) {
            TreeNode node = queue.poll();
            if (values[index] != null) {
                node.left = new TreeNode(values[index]);
                queue.offer(node.left);
            }
            index++;
            if (index < values.length && values[index] != null) {
                node.right = new TreeNode(values[index]);
                queue.offer(node.right);
            }
            index++;
        }
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] values = {10, 5, -3, 3, 2, 4, 6, 3, -2, null, 1};
        TreeNode root = createRoot(values);
        List<List<Integer>> result = solution.findAllPaths(root);

        // 打印所有路径
        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }
}
