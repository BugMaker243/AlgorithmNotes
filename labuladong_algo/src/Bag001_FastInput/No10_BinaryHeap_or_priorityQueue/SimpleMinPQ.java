package Bag001_FastInput.No10_BinaryHeap_or_priorityQueue;
import java.util.Random;


public class SimpleMinPQ {
    // 底层使用数组实现二叉堆
    // 这里使用0号索引作为根节点
    private final int[] heap;

    // 堆中元素的数量
    private int size;

    public SimpleMinPQ(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    // 父节点的索引
    private int parent(int node) {
        return (node - 1) / 2;
    }

    // 左子节点的索引
    private int left(int node) {
        return node * 2 + 1;
    }

    // 右子节点的索引
    private int right(int node) {
        return node * 2 + 2;
    }

    // 交换数组的两个元素
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // 查，返回堆顶元素，时间复杂度 O(1)
    public int peek() {
        return heap[0];
    }

    // 增，向堆中插入一个元素，时间复杂度 O(logN)
    public void push(int x) {
        // 把新元素追加到最后
        heap[size] = x;
        // 然后上浮到正确位置
        swim(size);
        size++;
    }

    // 删，删除堆顶元素，时间复杂度 O(logN)
    public int pop() {
        int res = heap[0];
        // 把堆底元素放到堆顶
        heap[0] = heap[size - 1];
        size--;
        // 然后下沉到正确位置
        sink(0);
        return res;
    }

    // 上浮操作，时间复杂度是树高 O(logN)
    private void swim(int node) {
        while (node > 0 && heap[parent(node)] > heap[node]) {
            swap(parent(node), node);
            node = parent(node);
        }
    }

    // 下沉操作，时间复杂度是树高 O(logN)
    private void sink(int node) {
        while (left(node) < size || right(node) < size) {
            // 比较自己和左右子节点，看看谁最小
            int min = node;
            if (left(node) < size && heap[left(node)] < heap[min]) {
                min = left(node);
            }
            if (right(node) < size && heap[right(node)] < heap[min]) {
                min = right(node);
            }
            if (min == node) {
                break;
            }
            // 如果左右子节点中有比自己小的，就交换
            swap(node, min);
            node = min;
        }
    }

    // 事实上可以这样简化：

    // 下面注释的代码对两种sink写法进行了测试，一百万个数据，优化后满5ms，一千万个数据慢130ms
    // 猜测可能是跟JVM代码优化或者CPU分支预测有关，因为优化前的代码更工整，更容易实现优化

//    private void sink(int node) {
//        while (left(node) < size) {  // 只要有左子节点
//            int min = node;
//
//            // 比较左子节点
//            if (heap[left(node)] < heap[min]) {
//                min = left(node);
//            }
//
//            // 比较右子节点（如果存在）
//            if (right(node) < size && heap[right(node)] < heap[min]) {
//                min = right(node);
//            }
//
//            // 如果自己已经是最小的，跳出循环
//            if (min == node) {
//                break;
//            }
//
//            // 否则，交换并继续下沉
//            swap(node, min);
//            node = min;  // 下沉到新的位置
//        }
//    }


    public static void main(String[] args) {
        SimpleMinPQ pq = new SimpleMinPQ(5);
        pq.push(3);
        pq.push(2);
        pq.push(1);
        pq.push(5);
        pq.push(4);

        System.out.println(pq.pop()); // 1
        System.out.println(pq.pop()); // 2
        System.out.println(pq.pop()); // 3
        System.out.println(pq.pop()); // 4
        System.out.println(pq.pop()); // 5
    }
}


// 这里主要是对两种sink写法进行了测试，一百万个数据，优化后满5ms，一千万个数据慢130ms
// 猜测可能是跟JVM代码优化或者CPU分支预测有关，因为优化前的代码更工整，更容易实现优化

//public class SimpleMinPQ {
//    // 底层使用数组实现二叉堆
//    private final int[] heap;
//    private int size;
//
//    public SimpleMinPQ(int capacity) {
//        heap = new int[capacity];
//        size = 0;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    // 父节点的索引
//    private int parent(int node) {
//        return (node - 1) / 2;
//    }
//
//    // 左子节点的索引
//    private int left(int node) {
//        return node * 2 + 1;
//    }
//
//    // 右子节点的索引
//    private int right(int node) {
//        return node * 2 + 2;
//    }
//
//    // 交换数组的两个元素
//    private void swap(int i, int j) {
//        int temp = heap[i];
//        heap[i] = heap[j];
//        heap[j] = temp;
//    }
//
//    // 查，返回堆顶元素，时间复杂度 O(1)
//    public int peek() {
//        return heap[0];
//    }
//
//    // 增，向堆中插入一个元素，时间复杂度 O(logN)
//    public void push(int x) {
//        // 把新元素追加到最后
//        heap[size] = x;
//        // 然后上浮到正确位置
//        swim(size);
//        size++;
//    }
//
//    // 删，删除堆顶元素，时间复杂度 O(logN)
//    public int pop() {
//        int res = heap[0];
//        // 把堆底元素放到堆顶
//        heap[0] = heap[size - 1];
//        size--;
//        // 然后下沉到正确位置
//        sink(0); // 使用原始的sink
//        return res;
//    }
//
//    public int simplifiedPop(){
//        int res = heap[0];
//        // 把堆底元素放到堆顶
//        heap[0] = heap[size - 1];
//        size--;
//        // 然后下沉到正确位置
//        simplifiedSink(0); // 使用原始的sink
//        return res;
//    }
//
//    // 上浮操作，时间复杂度是树高 O(logN)
//    private void swim(int node) {
//        while (node > 0 && heap[parent(node)] > heap[node]) {
//            swap(parent(node), node);
//            node = parent(node);
//        }
//    }
//
//    // 原始的下沉操作
//    private void sink(int node) {
//        while (left(node) < size || right(node) < size) {
//            int min = node;
//            if (left(node) < size && heap[left(node)] < heap[min]) {
//                min = left(node);
//            }
//            if (right(node) < size && heap[right(node)] < heap[min]) {
//                min = right(node);
//            }
//            if (min == node) {
//                break;
//            }
//            swap(node, min);
//            node = min;
//        }
//    }
//
//    // 简化的下沉操作
//    private void simplifiedSink(int node) {
//        while (left(node) < size) {  // 只要有左子节点
//            int min = node;
//
//            // 比较左子节点
//            if (heap[left(node)] < heap[min]) {
//                min = left(node);
//            }
//
//            // 比较右子节点（如果存在）
//            if (right(node) < size && heap[right(node)] < heap[min]) {
//                min = right(node);
//            }
//
//            // 如果自己已经是最小的，跳出循环
//            if (min == node) {
//                break;
//            }
//
//            // 否则，交换并继续下沉
//            swap(node, min);
//            node = min;  // 下沉到新的位置
//        }
//    }
//
//    public static void main(String[] args) {
//        // 创建一个随机数生成器
//        Random rand = new Random();
//        int N = 10000000;  // 1万个元素
//        int[] data = new int[N];
//
//        // 生成 1 万个不相等的随机数
//        for (int i = 0; i < N; i++) {
//            int temp = rand.nextInt();
//            System.out.println(temp);
//            data[i] = temp;
//        }
//
//        // 测量原始的sink耗时
//        SimpleMinPQ pq1 = new SimpleMinPQ(N);
//        for (int num : data) {
//            pq1.push(num); // 插入数据
//        }
//
//        long startTime1 = System.nanoTime();
//        for (int i = 0; i < N; i++) {
//            pq1.pop(); // 使用原始sink进行pop操作
//        }
//        long endTime1 = System.nanoTime();
//        long duration1 = endTime1 - startTime1;
//        System.out.println("Original sink time: " + duration1 + " ns");
//
//        // 测量简化的sink耗时
//        SimpleMinPQ pq2 = new SimpleMinPQ(N);
//        for (int num : data) {
//            pq2.push(num); // 插入数据
//        }
//
//        long startTime2 = System.nanoTime();
//        for (int i = 0; i < N; i++) {
//            pq2.simplifiedPop(); // 使用简化sink进行pop操作
//        }
//        long endTime2 = System.nanoTime();
//        long duration2 = endTime2 - startTime2;
//        System.out.println("Simplified sink time: " + duration2 + " ns");
//    }
//}
