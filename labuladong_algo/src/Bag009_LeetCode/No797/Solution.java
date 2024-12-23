package Bag009_LeetCode.No797;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    // 记录所有路径
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        traverse(graph, 0);
        return res;
    }

    // 图的遍历框架
    void traverse(int[][] graph, int s) {

        // 添加节点 s 到路径
        path.addLast(s);

        int n = graph.length;
        if (s == n - 1) {
            // 到达终点
            res.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }

        // 递归每个相邻节点
        for (int v : graph[s]) {
            traverse(graph, v);
        }

        // 从路径移出节点 s
        path.removeLast();
    }
}