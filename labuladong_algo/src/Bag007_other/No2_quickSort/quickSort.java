package Bag007_other.No2_quickSort;

import java.util.Stack;

/*
* 快排的非递归实现
* */

public class quickSort {

    // 三数取中法，选择基准
    public int findMiddle(int[] arr, int start, int end) {
        int middle = start + ((end - start) >>> 1); // 计算中间值

        int max = Math.max(arr[start], Math.max(arr[middle], arr[end])); // 获取三个数的最大值
        int min = Math.min(arr[start], Math.min(arr[middle], arr[end])); // 获取三个数的最小值

        // 返回中间值的位置
        if (arr[start] != max && arr[start] != min) {
            return start; // start是中间值
        } else if (arr[middle] != max && arr[middle] != min) {
            return middle; // middle是中间值
        } else {
            return end; // end是中间值
        }
    }

    // 分区函数
    public int partition(int[] arr, int start, int end) {
        // 选择基准值
        int pivotIndex = findMiddle(arr, start, end);
        int pivot = arr[pivotIndex];

        // 将基准值交换到数组的起始位置
        swap(arr, pivotIndex, start);

        // 定义左指针和右指针
        int left = start + 1;
        int right = end;

        while (true) {
            // 左指针向右移动，直到找到大于等于基准值的元素
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            // 右指针向左移动，直到找到小于等于基准值的元素
            while (left <= right && arr[right] >= pivot) {
                right--;
            }

            // 如果左指针小于右指针，交换位置
            if (left < right) {
                swap(arr, left, right);
            } else {
                // 否则，分区完成，将基准值放到合适位置
                break;
            }
        }

        // 将基准值放到正确位置
        swap(arr, start, right);

        return right;
    }

    // 交换数组中的两个元素
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 非递归实现快速排序
    public void quickNor(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = arr.length - 1;

        // 将初始区间入栈
        stack.push(left);
        stack.push(right);

        // 当栈不为空时
        while (!stack.isEmpty()) {
            right = stack.pop();
            left = stack.pop();

            // 进行分区操作，获取基准值的位置
            int pivot = partition(arr, left, right);

            // 左区间需要排序
            if (pivot - 1 > left) {
                stack.push(left);
                stack.push(pivot - 1);
            }

            // 右区间需要排序
            if (pivot + 1 < right) {
                stack.push(pivot + 1);
                stack.push(right);
            }
        }
    }

    // 主函数，用于测试
    public static void main(String[] args) {
        quickSort qs = new quickSort();
        int[] arr = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
        qs.quickNor(arr);

        // 打印排序后的数组
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
