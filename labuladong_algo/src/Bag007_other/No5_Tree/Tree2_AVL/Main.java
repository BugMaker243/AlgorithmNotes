package Bag007_other.No5_Tree.Tree2_AVL;

// 定义树节点
class TreeNode {
    int val;
    TreeNode left, right;
    int height;  // 记录节点的高度

    TreeNode(int val) {
        this.val = val;
        this.height = 1;  // 新节点的高度初始化为1
    }
}

// 定义AVL树类
class AVLTree {
    private TreeNode root;

    // 获取树的根节点
    public TreeNode getRoot() {
        return root;
    }

    // 获取节点的高度
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // 更新节点的高度
    private void updateHeight(TreeNode node) {
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }

    // 计算节点的平衡因子
    private int getBalanceFactor(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    // 右旋操作
    private TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        // 旋转
        x.right = y;
        y.left = T2;

        // 更新高度
        updateHeight(y);
        updateHeight(x);

        return x;
    }

    // 左旋操作
    private TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        // 旋转
        y.left = x;
        x.right = T2;

        // 更新高度
        updateHeight(x);
        updateHeight(y);

        return y;
    }

    // 插入节点
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);  // 插入新节点
        }

        // 按照二叉搜索树规则插入
        if (val < node.val) {
            node.left = insertRecursive(node.left, val);
        } else if (val > node.val) {
            node.right = insertRecursive(node.right, val);
        } else {
            return node;  // 如果值相等，不插入
        }

        // 更新当前节点的高度
        updateHeight(node);

        // 检查树是否失衡，并进行旋转
        int balance = getBalanceFactor(node);

        // 左左情况（左子树的左子树导致失衡）
        if (balance > 1 && val < node.left.val) {
            return rightRotate(node);
        }

        // 右右情况（右子树的右子树导致失衡）
        if (balance < -1 && val > node.right.val) {
            return leftRotate(node);
        }

        // 左右情况（左子树的右子树导致失衡）
        if (balance > 1 && val > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // 右左情况（右子树的左子树导致失衡）
        if (balance < -1 && val < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;  // 如果没有失衡，直接返回当前节点
    }

    // 中序遍历（按升序输出）
    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(TreeNode node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.val + " ");
            inOrderRecursive(node.right);
        }
    }

    // 删除节点
    public void delete(int val) {
        root = deleteRecursive(root, val);
    }

    private TreeNode deleteRecursive(TreeNode node, int val) {
        if (node == null) {
            return null;  // 找不到要删除的节点
        }

        // 按照二叉搜索树规则删除节点
        if (val < node.val) {
            node.left = deleteRecursive(node.left, val);
        } else if (val > node.val) {
            node.right = deleteRecursive(node.right, val);
        } else {
            // 找到要删除的节点
            if (node.left == null || node.right == null) {
                // 如果节点有一个或零个子节点
                node = (node.left != null) ? node.left : node.right;
            } else {
                // 如果节点有两个子节点，找到右子树的最小节点（即中序遍历的下一个节点）
                TreeNode temp = getMinValueNode(node.right);
                node.val = temp.val;  // 用右子树的最小节点替代当前节点
                node.right = deleteRecursive(node.right, temp.val);  // 删除右子树的最小节点
            }
        }

        // 如果树只有一个节点
        if (node == null) return null;

        // 更新当前节点的高度
        updateHeight(node);

        // 检查树是否失衡，并进行旋转
        int balance = getBalanceFactor(node);

        // 左左情况
        if (balance > 1 && getBalanceFactor(node.left) >= 0) {
            return rightRotate(node);
        }

        // 右右情况
        if (balance < -1 && getBalanceFactor(node.right) <= 0) {
            return leftRotate(node);
        }

        // 左右情况
        if (balance > 1 && getBalanceFactor(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // 右左情况
        if (balance < -1 && getBalanceFactor(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // 获取树中最小节点
    private TreeNode getMinValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建 AVL 树实例
        AVLTree avlTree = new AVLTree();

        // 插入节点
        avlTree.insert(30);
        avlTree.insert(20);
        avlTree.insert(40);
        avlTree.insert(10);
        avlTree.insert(25);
        avlTree.insert(35);
        avlTree.insert(50);

        System.out.println("中序遍历结果（按升序输出）：");
        avlTree.inOrderTraversal();  // 输出: 10 20 25 30 35 40 50

        // 删除节点
        avlTree.delete(40);

        System.out.println("\n删除 40 后的中序遍历结果：");
        avlTree.inOrderTraversal();  // 输出: 10 20 25 30 35 50
    }
}
