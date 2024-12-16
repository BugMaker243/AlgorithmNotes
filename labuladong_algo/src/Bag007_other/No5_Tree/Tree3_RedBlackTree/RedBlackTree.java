package Bag007_other.No5_Tree.Tree3_RedBlackTree;

public class RedBlackTree {

    // 定义节点颜色
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    // 红黑树节点定义
    static class Node {
        int key;
        boolean color;
        Node left, right, parent;

        public Node(int key) {
            this.key = key;
            this.color = RED; // 新插入的节点为红色
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    private Node root;

    public RedBlackTree() {
        this.root = null;
    }

    // 插入操作
    public void insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            root.color = BLACK; // 根节点始终是黑色
        } else {
            insertFixup(insertNode(root, node)); // 插入节点并修复
        }
    }

    // 插入节点
    private Node insertNode(Node root, Node node) {
        if (root == null) {
            return node;
        }
        if (node.key < root.key) {
            root.left = insertNode(root.left, node);
            root.left.parent = root;
        } else {
            root.right = insertNode(root.right, node);
            root.right.parent = root;
        }
        return root;
    }

    // 插入修复
    private void insertFixup(Node node) {
        while (node != root && node.parent.color == RED) {
            if (node.parent == node.parent.parent.left) {
                Node uncle = node.parent.parent.right;
                if (uncle != null && uncle.color == RED) {
                    // 情况1：叔叔节点是红色
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    node.parent.parent.color = RED;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.right) {
                        // 情况2：当前节点是右子节点，父节点是左子节点
                        node = node.parent;
                        leftRotate(node);
                    }
                    // 情况3：当前节点是左子节点，父节点是左子节点
                    node.parent.color = BLACK;
                    node.parent.parent.color = RED;
                    rightRotate(node.parent.parent);
                }
            } else {
                Node uncle = node.parent.parent.left;
                if (uncle != null && uncle.color == RED) {
                    node.parent.color = BLACK;
                    uncle.color = BLACK;
                    node.parent.parent.color = RED;
                    node = node.parent.parent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rightRotate(node);
                    }
                    node.parent.color = BLACK;
                    node.parent.parent.color = RED;
                    leftRotate(node.parent.parent);
                }
            }
        }
        root.color = BLACK; // 保证根节点是黑色
    }

    // 左旋转
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    // 右旋转
    private void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != null) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    // 查找节点
    public Node search(int key) {
        return search(root, key);
    }

    private Node search(Node node, int key) {
        if (node == null || node.key == key) {
            return node;
        }
        if (key < node.key) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    // 中序遍历
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    // 打印红黑树
    public void printTree() {
        printTree(root, "", true);
    }

    private void printTree(Node node, String indent, boolean last) {
        if (node != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }

            String color = (node.color == RED) ? "RED" : "BLACK";
            System.out.println(node.key + "(" + color + ")");
            printTree(node.left, indent, false);
            printTree(node.right, indent, true);
        }
    }

    // 测试红黑树
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(25);

        System.out.println("中序遍历:");
        tree.inorder();
        System.out.println();

        System.out.println("打印红黑树:");
        tree.printTree();
    }
}