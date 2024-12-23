package Bag007_other.No6_GraphBFS;

import Bag007_other.No1_graph.Graph;
import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;


// 伪代码，无法运行，导入主要是为了方便看

/**
 * 多叉树与图的三种BFS层序遍历对比
 * */
public class Test {

    /**
     * 第一种遍历方式
     * 不记录遍历步数：
     * */
    // 多叉树的层序遍历
    void levelOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            // 访问 cur 节点
            System.out.println(cur.val);

            // 把 cur 的所有子节点加入队列
            for (Node child : cur.children) {
                q.offer(child);
            }
        }
    }

    // 图结构的 BFS 遍历，从节点 s 开始进行 BFS
    void bfs(Graph graph, int s) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.println("visit " + cur);
            for (Edge e : graph.neighbors(cur)) {
                if (!visited[e.to]) {
                    q.offer(e.to);
                    visited[e.to] = true;
                }
            }
        }
    }


    /**
     * 第二种遍历方式
     * 能够记录遍历步数
     * */
    // 多叉树的层序遍历
    void levelOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        // 记录当前遍历到的层数（根节点视为第 1 层）
        int depth = 1;

        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                Node cur = q.poll();
                // 访问 cur 节点，同时知道它所在的层数
                System.out.println("depth = " + depth + ", val = " + cur.val);

                for (Node child : cur.children) {
                    q.offer(child);
                }
            }
            depth++;
        }
    }

    // 从 s 开始 BFS 遍历图的所有节点，且记录遍历的步数
    void bfs(Graph graph, int s) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        // 记录从 s 开始走到当前节点的步数
        int step = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                int cur = q.poll();
                System.out.println("visit " + cur + " at step " + step);
                for (Edge e : graph.neighbors(cur)) {
                    if (!visited[e.to]) {
                        q.offer(e.to);
                        visited[e.to] = true;
                    }
                }
            }
            step++;
        }
    }


    /**
     * 第三种遍历方式
     * 能够适配不同权重边
     * */
    // 多叉树的层序遍历
    // 每个节点自行维护 State 类，记录深度等信息
    class State {
        Node node;
        int depth;

        public State(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    void levelOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        Queue<State> q = new LinkedList<>();
        // 记录当前遍历到的层数（根节点视为第 1 层）
        q.offer(new State(root, 1));

        while (!q.isEmpty()) {
            State state = q.poll();
            Node cur = state.node;
            int depth = state.depth;
            // 访问 cur 节点，同时知道它所在的层数
            System.out.println("depth = " + depth + ", val = " + cur.val);

            for (Node child : cur.children) {
                q.offer(new State(child, depth + 1));
            }
        }
    }


    // 图结构的 BFS 遍历，从节点 s 开始进行 BFS，且记录路径的权重和
    // 每个节点自行维护 State 类，记录从 s 走来的权重和
    /** 这种写法太巧妙了
    *  已经可以想象到他解决特定的问题很有用了
    *  值得专门记忆一下！
    * */
    class State {
        // 当前节点 ID
        int node;
        // 从起点 s 到当前节点的权重和
        int weight;

        public State(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }


    void bfs(Graph graph, int s) {
        boolean[] visited = new boolean[graph.size()];
        Queue<State> q = new LinkedList<>();

        q.offer(new State(s, 0));
        visited[s] = true;

        while (!q.isEmpty()) {
            State state = q.poll();
            int cur = state.node;
            int weight = state.weight;
            System.out.println("visit " + cur + " with path weight " + weight);
            for (Edge e : graph.neighbors(cur)) {
                if (!visited[e.to]) {
                    q.offer(new State(e.to, weight + e.weight));
                    visited[e.to] = true;
                }
            }
        }
    }

}
