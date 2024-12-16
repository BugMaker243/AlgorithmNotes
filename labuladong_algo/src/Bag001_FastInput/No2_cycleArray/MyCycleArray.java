package Bag001_FastInput.No2_cycleArray;

/**
 * 仿照 CycleArray 复现的 循环数组，可以用来实现队列
 *
 * 自己写写的一坨，最后对照原代码又重新学习了一遍思路，后面看见了再复现
 */
public class MyCycleArray<T> {
    private T[] arr;
    private int start;  // 头指针，闭区间
    private int end;  // 尾指针，开区间
    private int count;  // 元素个数
    private int size;   // 数组大小

    @SuppressWarnings("unchecked")  // 不要检查向下强转
    public MyCycleArray() {
        this(1);
    }

    @SuppressWarnings("unchecked")  // 不要检查向下强转
    public MyCycleArray(int size) {
        T[] newarray = (T[]) new Object[size];
        arr = newarray;
        start = 0;
        end = 0;
        count = 0;
        this.size = size;
    }

    public void push(T var) {
        check_array();

        arr[this.end] = var;
        end = (end + 1) % size;
        count++;


    }

    public T pop() {
        if (is_empty()) {
            System.out.println("Array is empty");
            System.exit(-1);
        }
        end = (end - 1 + size) % size;
        T temp = arr[end];
        arr[end] = null;
        count--;
        return temp;

    }

    @SuppressWarnings("unchecked")  // 不要检查向下强转
    private void check_array() {
        if (this.count == this.size) {
            T[] newarray = (T[]) new Object[this.size * 2];
            for (int i = 0; i < this.count; i++) {
                newarray[i] = arr[(this.start + i) % this.size];

            }
            arr = newarray;
            start = 0;
            end = count;
            size *= 2;
        }
    }

    private boolean is_empty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void saveMem() {
        if (count < (size / 4)) {

        }
    }

}
