package Bag007_other.No5_Tree.Tree1_BinarySearchTree;

// 定义二叉树节点
class TreeNode {
    int val;
    TreeNode left, right;

    // 构造函数
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

// 二叉搜索树类
class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // 插入新节点
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    // 递归插入节点
    private TreeNode insertRecursive(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);  // 找到插入位置
        }

        if (val < node.val) {
            node.left = insertRecursive(node.left, val);  // 插入到左子树
        } else if (val > node.val) {
            node.right = insertRecursive(node.right, val);  // 插入到右子树
        }

        return node;  // 返回当前节点
    }

    // 查找节点
    public boolean contains(int val) {
        return containsRecursive(root, val);
    }

    // 递归查找节点
    private boolean containsRecursive(TreeNode node, int val) {
        if (node == null) {
            return false;  // 未找到节点
        }

        if (val == node.val) {
            return true;  // 找到节点
        }

        return val < node.val
                ? containsRecursive(node.left, val)  // 在左子树中查找
                : containsRecursive(node.right, val);  // 在右子树中查找
    }

    // 中序遍历：按升序输出
    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    // 递归中序遍历
    private void inOrderRecursive(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderRecursive(node.left);  // 遍历左子树
        System.out.print(node.val + " ");  // 打印当前节点值
        inOrderRecursive(node.right);  // 遍历右子树
    }

    // 获取树的根节点
    public TreeNode getRoot() {
        return root;
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建二叉搜索树实例
        BinarySearchTree bst = new BinarySearchTree();


        TreeNode tn =  null;

        // 插入数据
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(8);

        // 中序遍历输出二叉搜索树（应该是按升序）
        System.out.println("中序遍历结果：");
        bst.inOrderTraversal();  // 输出: 2 3 4 5 7 8

        // 查找某个节点
        System.out.println("\n查找 4 是否存在：" + bst.contains(4));  // 输出: true
        System.out.println("查找 9 是否存在：" + bst.contains(9));  // 输出: false
    }
}
