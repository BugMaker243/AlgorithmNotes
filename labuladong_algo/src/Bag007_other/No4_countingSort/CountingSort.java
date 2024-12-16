package Bag007_other.No4_countingSort;

import java.util.Arrays;

public class CountingSort {

    // 主函数
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("排序前的数组: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("排序后的数组: " + Arrays.toString(arr));
    }

    // 计数排序
    public static void countingSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        // 找到数组中的最大值和最小值
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // 计数数组的大小为最大值 - 最小值 + 1
        int[] count = new int[max - min + 1];

        // 统计每个元素出现的次数
        for (int num : arr) {
            count[num - min]++;
        }

        //打印数组
        System.out.println("打印数组1");
        for (int temp : count){

            System.out.println(temp);
        }


        // 将计数数组中的值累加，得到每个元素的最终位置
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        //打印数组
        System.out.println("打印数组2");
        for (int temp : count){
            System.out.println(temp);
        }

        // 创建一个输出数组，按排序顺序放置元素
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            output[count[num - min] - 1] = num;
            count[num - min]--;
        }

        // 将排序后的元素复制回原数组
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
