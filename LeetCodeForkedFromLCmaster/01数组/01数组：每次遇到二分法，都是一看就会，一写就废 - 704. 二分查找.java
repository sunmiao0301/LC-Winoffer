2nd
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while(left <= right){//防止[2,5] 2 因为left == right的时候还得再判断一下
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target){
                right = mid - 1;
                mid = (left + right) / 2;
            }
            else{
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }
        return -1;
    }
}

//第一版 空间复杂度不好 优化一下
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
39.5 MB
, 在所有 Java 提交中击败了
19.18%
的用户
class Solution {
    public int search(int[] nums, int target) {
    /*
    有序数组都要尝试用二分解决
    nums 中的所有元素是不重复的。
    */
    return helper(nums, target, 0, nums.length - 1);
    }
    int helper(int[] nums, int target, int left, int right){
        if(left > right)return -1;
        int mid =(left + right) / 2;
        if(nums[mid] == target)return mid;
        else if(nums[mid] > target)return helper(nums, target, left, mid-1);
        else return helper(nums, target, mid+1, right); 
    }
}

//第二版 优化一下
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
39.2 MB
, 在所有 Java 提交中击败了
80.74%
的用户
class Solution {
    public int search(int[] nums, int target) {
    /*
    有序数组都要尝试用二分解决
    nums 中的所有元素是不重复的。
    */
    return helper(nums, target, 0, nums.length - 1);
    }
    int helper(int[] nums, int target, int left, int right){
        if(left > right)return -1;
        if(nums[(left + right) / 2] == target)return (left + right) / 2;
        else if(nums[(left + right) / 2] > target)return helper(nums, target, left, (left + right) / 2 - 1);
        else return helper(nums, target, (left + right) / 2 + 1, right); 
    }
}

//标准题解
ps：
有大神能解释一下pivot = left + (right - left) / 2; 这样写的好处吗？为什么不直接写pivot = (right + left) / 2
答：
pivot = (right + left) / 2，
为啥就是中间值索引？
有些人好好思考过吗？
其实，这不过是一个运算的结果，
真正原始的等式就是 pivot = left + (right - left) / 2; 
这个等式才能从逻辑上说明中间值的获取过程，
只是这个公式也刚好防范了溢出问题。
class Solution {
  public int search(int[] nums, int target) {
    int pivot, left = 0, right = nums.length - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target) return pivot;
      if (target < nums[pivot]) right = pivot - 1;
      else left = pivot + 1;
    }
    return -1;
  }
}

//leetcode-master 开源库中分析：
https://github.com/sunmiao0301/leetcode-master/blob/master/problems/0704.%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE.md
Java：

（版本一）左闭右闭区间

class Solution {
    public int search(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }
}
（版本二）左闭右开区间

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid;
        }
        return -1;
    }
}
