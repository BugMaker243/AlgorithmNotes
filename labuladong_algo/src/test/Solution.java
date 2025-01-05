package test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Solution <br>
 * Package: test <br>
 * Description:  <br>
 * <br>
 *
 * @Author Jason <br>
 * @Create 2025/1/5 20:16 <br>
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // 把二维 grid 抽象成一维数组
        int m = grid.length, n = grid[0].length;
        int mn = m * n;
        k = k % mn;
        // 先把最后 k 个数翻转
        reverse(grid, mn - k, mn - 1);
        // 然后把前 mn - k 个数翻转
        reverse(grid, 0, mn - k - 1);
        // 最后把整体翻转
        reverse(grid, 0, mn - 1);

        // 转化成 Java List
        List<List<Integer>> res = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int e : row) {
                rowList.add(e);
            }
            res.add(rowList);
        }
        return res;
    }

    // 通过一维数组的索引访问二维数组的元素
    int get(int[][] grid, int index) {
        int n = grid[0].length;
        int i = index / n, j = index % n;
        return grid[i][j];
    }

    // 通过一维数组的索引修改二维数组的元素
    void set(int[][] grid, int index, int val) {
        int n = grid[0].length;
        int i = index / n, j = index % n;
        grid[i][j] = val;
    }

    // 翻转一维数组的索引区间元素
    void reverse(int[][] grid, int i, int j) {
        while (i < j) {
            int temp = get(grid, i);
            set(grid, i, get(grid, j));
            set(grid, j, temp);
            i++;
            j--;
        }
    }
}