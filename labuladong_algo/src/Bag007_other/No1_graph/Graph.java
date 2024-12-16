package Bag007_other.No1_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
    static final int MAXSIZE = 100;  // 最大顶点数
    static final int MAX_INT = 32767;  // 最大值（未使用，C中设置为最大整数，Java中可以忽略）

    char[] vexs = new char[MAXSIZE];  // 存储顶点的数组
    int[][] arcs = new int[MAXSIZE][MAXSIZE];  // 邻接矩阵
    int vexnum, arcnum;  // 当前顶点数和边数

    // 获取顶点的索引
    public int getIndex(char m) {
        for (int i = 0; i < vexnum; i++) {
            if (vexs[i] == m) {
                return i;
            }
        }
        return -1;
    }

    // 创建图
    public void createGraph() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入顶点和边的数量:>");
        vexnum = scanner.nextInt();
        arcnum = scanner.nextInt();

        // 初始化邻接矩阵
        for (int i = 0; i < vexnum; i++) {
            for (int j = 0; j < vexnum; j++) {
                arcs[i][j] = 0;
            }
        }

        // 输入顶点信息
        for (int i = 0; i < vexnum; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个顶点的值:>");
            vexs[i] = scanner.next().charAt(0);
        }

        // 输入边的信息
        for (int i = 0; i < arcnum; i++) {
            System.out.println("请输入第 " + (i + 1) + " 条边（格式为：ab）:>");
            char m = scanner.next().charAt(0);
            char n = scanner.next().charAt(0);
            int j = getIndex(m);  // 获取顶点 m 的下标
            int k = getIndex(n);  // 获取顶点 n 的下标
            arcs[j][k] = 1;  // 无向图，边的权重设置为 1
            arcs[k][j] = 1;  // 对称的边
        }
    }

    // 深度优先遍历
    public void depthSearch(int v, boolean[] visited) {
        visited[v] = true;  // 标记该顶点为已访问
        System.out.print(vexs[v] + " ");  // 打印当前顶点
        for (int i = 0; i < vexnum; i++) {
            if (arcs[v][i] == 1 && !visited[i]) {
                depthSearch(i, visited);  // 递归访问相邻的未访问顶点
            }
        }
    }

    // 广度优先遍历
    public void breadthSearch(int v) {
        boolean[] visited = new boolean[MAXSIZE];  // 用于标记顶点是否已访问
        Queue<Integer> queue = new LinkedList<>();  // 创建队列

        visited[v] = true;  // 标记起始顶点已访问
        queue.offer(v);  // 将起始顶点加入队列

        while (!queue.isEmpty()) {
            int current = queue.poll();  // 取出队列中的元素
            System.out.print(vexs[current] + " ");  // 打印当前顶点

            // 遍历所有相邻的未访问顶点
            for (int i = 0; i < vexnum; i++) {
                if (arcs[current][i] == 1 && !visited[i]) {
                    visited[i] = true;  // 标记为已访问
                    queue.offer(i);  // 将未访问的相邻顶点加入队列
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.createGraph();  // 创建图

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入搜索的起始点:>");
        char startVertex = scanner.next().charAt(0);  // 输入起始点

        boolean[] visited = new boolean[MAXSIZE];  // 用于标记顶点是否已访问
        graph.depthSearch(graph.getIndex(startVertex), visited);  // 从指定起始点进行深度优先搜索
    }
}
