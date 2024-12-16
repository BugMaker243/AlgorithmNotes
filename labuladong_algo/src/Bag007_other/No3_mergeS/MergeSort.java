package Bag007_other.No3_mergeS;

import java.util.Arrays;

public class MergeSort {
    /*
    * 归并排序其实数据结构学过
    *
    * 先分解，然后再合并的时候排序
    * 所谓合并，就是建一个临时数组，然后把两个数组数组头各置一个指针，将其中更小的放到临时数组，然后临时数组和该数组都++
    * 所以要分解到最小，因为数组合并要求两个数组都是有序的
    * */

    // 主函数
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("排序前的数组: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("排序后的数组: " + Arrays.toString(arr));
    }

    // 归并排序
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;  // 找到中间点
            mergeSort(arr, left, mid);      // 对左半部分排序
            mergeSort(arr, mid + 1, right); // 对右半部分排序
            merge(arr, left, mid, right);   // 合并两部分
        }
    }

    // 合并两个已排序的子数组
    public static void merge(int[] arr, int left, int mid, int right) {
        // 临时数组
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // 合并两个已排序的子数组
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // 将左边剩余的元素添加到临时数组
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // 将右边剩余的元素添加到临时数组
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // 将临时数组的元素拷贝回原数组
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}
