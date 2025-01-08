# 数组二分查找代码模板

> 写在前面：分析二分查找代码时，不要出现 else，全部展开成 else if 方便理解。把逻辑写对之后再合并分支，提升运行效率。

二分查找主要分三种情况：

- 普通的二分查找，一般数组里面只有一个目标值或者没有，找到就直接返回，查完了没找到就return -1

- 左边界查找：数组中的目标值有多个，返回最左边的那个

- 右边界查找：数组中的目标值有多个，返回最右边的那个

  > 注意：左边界查找和右边界查找一定要注意没找到的情况，此时不能直接return索引，因为所以其实指向了某个特定的值，根据不同的写法，所返回的索引`left`、`right`可能指向小于目标值的最大值或者大于目标值的最小值，所以此时return结果的时候要判断到底是不是目标值，用一个三目运算符，具体见代码

```java
/**
*	二分搜索代码模板
*/

int binary_search(int[] nums, int target) {
        // 统一闭区间
    	int left = 0;
    	int right = nums.length - 1;

    	// 闭区间所以执行条件要包含 left == right
        while (left <= right) {
            // 这种mid求法更安全，相对“(left + right)/2”来说更不容易溢出
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                /*
                // 1、普通二分查找：直接返回
                return mid;
                */
                
				/*
				// 2、左边界查找：别返回，锁定左侧边界
                right = mid - 1;
				*/
                
                /*
				// 3、右边界查找：别返回，锁定右侧边界
                left = mid - 1;
				*/
            }
        }

        /*
        // 1、直接返回
        return -1;
        */
    
    	/*
    	// 2、左边界查找
    	// 判断 target 是否存在于 nums 中（边界检查）
        if (left < 0 || left >= nums.length) {
            return -1;
        }
        // 判断一下 nums[left] 是不是 target
        return nums[left] == target ? left : -1;
    	*/
    
    	/*
    	// 3、右边界查找
    	// 由于 while 的结束条件是 right == left - 1，且现在在求右边界
        // 所以用 right 替代 left - 1 更好记
        // 如果要统一也可以写成 left - 1 ，原理很好理解，我们左右都是闭区间，找到mid之后left = mid + 1 看看后面还有没有，所以最后找到的话 left 是会在 target 右边一位的
        if (right < 0 || right >= nums.length) {
            return -1;
        }
        return nums[right] == target ? right : -1;
    	*/
    }
```

