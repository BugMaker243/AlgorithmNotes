package Bag001_FastInput.No6_BTPaths_DFS;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreePaths {

    public List<List<Integer>> findAllPaths(TreeNode root) {
        // res 用来存放所有路径
        List<List<Integer>> res = new ArrayList<>();
        // path 用来存放当前正在遍历的路径
        List<Integer> path = new ArrayList<>();
        // 从根节点开始进行递归遍历
        traverse(root, path, res);
        return res;
    }

    private void traverse(TreeNode node, List<Integer> path, List<List<Integer>> res) {
        if (node == null) {
            return;
        }

        // 前序位置进入节点时，把节点值加入 path
        path.add(node.val);

        // 如果当前节点是叶子节点（没有左右子节点），则保存当前路径
        if (node.left == null && node.right == null) {
            // 找到一条路径，将路径添加到 res 中
            res.add(new ArrayList<>(path));
        } else {
            // 否则，继续遍历左右子节点
            traverse(node.left, path, res);
            traverse(node.right, path, res);
        }

        // 后序位置离开节点时，把节点值从 path 中移除
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        // 构建一个示例二叉树
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);
        root.right.right = new TreeNode(11);

        BinaryTreePaths solution = new BinaryTreePaths();
        List<List<Integer>> result = solution.findAllPaths(root);

        // 打印结果
        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }
}
