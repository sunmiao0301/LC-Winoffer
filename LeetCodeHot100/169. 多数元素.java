# 摩尔投票不好写 写个排序的
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

# 快排
class Solution {
    public int majorityElement(int[] nums) {
        quickSort(nums);
        return nums[nums.length / 2];
    }
    void quickSort(int[] nums){
        
    }
}

# 题解写的摩尔排序
投票算法证明：
如果候选人不是maj 则 maj,会和其他非候选人一起反对 会反对候选人,所以候选人一定会下台(maj==0时发生换届选举)
如果候选人是maj , 则maj 会支持自己，其他候选人会反对，同样因为maj 票数超过一半，所以maj 一定会成功当选
class Solution {
    public int majorityElement(int[] nums) {
        int cand_num = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (cand_num == nums[i])
                ++count;
            else if (--count == 0) {
                cand_num = nums[i];
                count = 1;
            }
        }
        return cand_num;
    }
}
