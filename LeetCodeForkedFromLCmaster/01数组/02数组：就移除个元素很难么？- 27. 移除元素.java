2nd
class Solution {
    public int removeElement(int[] nums, int val) {
        //例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
        //if(nums.length == 0)return 0;
        int l = 0;
        int r = nums.length - 1;
        int valNums = 0;
        while(l <= r){
            if(nums[l] == val){
                swap(l, r, nums);
                //l++; //因为换过来的可能还是val 所以不能l++
                r--;
                valNums++;
            }
            else{
                l++;
            }
        }
        return nums.length - valNums;
    }
    public void swap(int a, int b, int[] nums){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}

//第一版 一遍过
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
36.6 MB
, 在所有 Java 提交中击败了
96.86%
的用户
class Solution {
    public int removeElement(int[] nums, int val) {
    /*
    很明显，不使用额外的数组空间，就只能在数组内部玩
    */
    int j = nums.length - 1;
    for(int i = 0; i <= j; i++){
        if(nums[i] == val){
            int temp = nums[i];//像这种 是等同于弄了很多新int吧
            nums[i] = nums[j];
            nums[j] = temp;
            i--;
            j--;
        }
    }
    return j + 1;
    }
}

//leetcode master解法
双指针法
双指针法（快慢指针法）： 通过一个快指针和慢指针在一个for循环下完成两个for循环的工作。

删除过程如下：

27.移除元素-双指针法

双指针法（快慢指针法）在数组和链表的操作中是非常常见的，很多考察数组、链表、字符串等操作的面试题，都使用双指针法。
class Solution {
    public int removeElement(int[] nums, int val) {

        // 快慢指针
        int fastIndex = 0;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }
}

但是实际上 这个方法不如我的首尾双指针
方法二：双指针优化
思路

如果要移除的元素恰好在数组的开头，例如序列 [1,2,3,4,5][1,2,3,4,5]，当 \textit{val}val 为 11 时，我们需要把每一个元素都左移一位。注意到题目中说：「元素的顺序可以改变」。实际上我们可以直接将最后一个元素 55 移动到序列开头，取代元素 11，得到序列 [5,2,3,4][5,2,3,4]，同样满足题目要求。这个优化在序列中 \textit{val}val 元素的数量较少时非常有效。

实现方面，我们依然使用双指针，两个指针初始时分别位于数组的首尾，向中间移动遍历该序列。

算法

如果左指针 \textit{left}left 指向的元素等于 \textit{val}val，此时将右指针 \textit{right}right 指向的元素复制到左指针 \textit{left}left 的位置，然后右指针 \textit{right}right 左移一位。如果赋值过来的元素恰好也等于 \textit{val}val，可以继续把右指针 \textit{right}right 指向的元素的值赋值过来（左指针 \textit{left}left 指向的等于 \textit{val}val 的元素的位置继续被覆盖），直到左指针指向的元素的值不等于 \textit{val}val 为止。

当左指针 \textit{left}left 和右指针 \textit{right}right 重合的时候，左右指针遍历完数组中所有的元素。

这样的方法两个指针在最坏的情况下合起来只遍历了数组一次。与方法一不同的是，方法二避免了需要保留的元素的重复赋值操作。
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
