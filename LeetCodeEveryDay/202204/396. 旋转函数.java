## 第一版 复杂的样例无法通过 long 都不行，估计是因为中间超界了，毕竟题目中只提到了：生成的测试用例让答案符合 32 位整数。
## 所以中间某个值超过 long 也是有可能的

[4,3,2,6]
[100]
[2,3,4,5,5,6,78]
[-8,5,-10,-5,-7,-2,-7,0,1,-10,4,-2,-2,-7,-6,-6,2,7,8,-3,-4,-3,9,6,0,-6,4,1,-6,1,8,-9,-1,9,4,-10,-1,7,1,-2,3,9,5,-2,6,4,5,4,-8,9,-8,3,-4,2,-9,-5,3,4,-2,-8,-5,4,-7,-8,0,2,-5,8,-5,9,4,-6,8,-2,8,-4,2,1,-7,5,-2,6,3,-3,0,2,-8,-8,0,9,-9,-1,9,-4,5,-1,0,-9,6,3,-8,5,-2,8,5,-3,2,-2,-9,9,-2,-10,1,-2,5,-5,7,-10,6,-3,6,-10,5,4,3,-4,4,-9,-5,6,0,5,2,6,-7,-6,-6,-7,1,2,7,3,0,7,9,0,6,-7,2,-3,1,7,-5,6,7,-2,6,-7,5,-7,6,-3,2,-4,-10,0,-1,2,3,7,-1,-2,-7,-1,2,-1,2,-3,2,-1,0,-5,-5,2,-7,7,2,-8,-3,1,-3,8,7,-7,9,2,3,-1,4,0,-8,7,-9,-7,-6,1,-4,-10,-8,-3,-10,-3,1,5,-10,-3,-3,-9,-4,-4,-8,-2,7,9,-2,-2,-10,1,-10,-8,2,5,1,-4,4,-10,9,-6,-4,-3,3,0,0,-5,2,-2,-2,4,8,-5,-1,1,-8,8,-3,0,-3,3,-5,-1,-10,-2,-9,-8,9,-8,-7,7,3,9,-4,4,3,5,-10,1,-1,-10,5,0,-8,7,9,-10,-4,-7,4,-5,3,2,-10,-10,-1,1,-5,-2,6,9,3,3,-5,2,-7,2,-4,5,-1,-9,-2,-7,9,-7,6,-6,8,-3,1,-5,-1,9,-5,1,-6,8,-2,-10,8,2,-2,4,7,-6,-7,-3,2,-8,9,-7,3,-3,-7,0,6,6,-6,-6,-1,-3,6,5,0,4,-1,5,-9,-4,6,8,0,-3,-9,-3,-2,3,-10,7,-4,-7,0,6,-2,8,4,2,-10,-4,3,-3,6,-10,7,7,0,8,5,-6,-6,-7,-4,-...
输出
26
0
544
0
预期结果
26
0
544
-26472033

class Solution {
    public int maxRotateFunction(int[] nums) {
        //先写一版模拟，找找感觉
        int len = nums.length;
        int max = 0;
        for(int i = 0; i < len; i++){
            long tmp = 0;
            for(int j = 0, k = i; j < len; j++, k++){
                tmp += nums[k % len] * j;
            }
            if(tmp > max){
                max = (int)tmp;
            }
        }
        return max;
    }
}

## 第二版 想到了上面一版为什么错了 因为最小值不一定是正数（草率了） 但是改对了之后 这种写法还是会超时

执行结果：
超出时间限制
显示详情
添加备注

最后执行的输入：
[-56,-66,-60,-76,-20,51,-91,-2,-20,33,39,97,-95,-95,-18,-32,-54,-60,41,85,25,-14,-34,-4,37,71,75,-63,4,6,69,-44,54,-26,59,25,34,-17,-22,58,-97,71,29,81,76,9,82,-65,-25,-27,-62,21,30,91,-16,-93,69,97,0,-41,63,-14,58,96,-62,-40,74,-65,93,86,86,42,-48,-92,-80,-99,83,53,-47,95,-68,-80,-29,-59,61,38,-91,65,-96,-12,-29,6,-16,-21,-24,-49,99,-90,7,-8,88,66,1,-45,-2,-80,49,-40,-7,23,81,-51,19,-54,-46,-93,-26,-51,55,-5,47,36,93,-71,-84,86,-89,66,-29,39,25,-44,-75,-4,55,-25,41,37,-77,-38,99,100,16,35,-70,27,-84,-19,68,78,19,-62,-83,5,-95,-30,-27,-80,-28,28,-1,15,-50,39,-60,-30,-71,92,-39,-67,-54,-94,-87,16,1,-33,58,4,74,64,1,-10,-57,-31,-51,-14,-42,-42,-68,98,19,54,-50,-3,40,-77,35,29,4,-91,21,-78,69,8,33,-12,-8,19,-72,87,78,-23,-62,-59,-5,-59,17,-55,91,-24,-51,-100,29,-90,-33,50,-48,-60,18,14,19,14,70,99,-31,-87,-54,-16,9,-90,46,72,75,78,97,14,92,-80,62,23,14,45,-43,-94,71,-98,51,-79,-42,50,4,-47,86,-82,64,89,13,75,16,46,49,46,73,-35,67,-53,-78,68,-69,-46,64,-29,37,-13,9,-30,-9,-8,90,9,83,80,-35

class Solution {
    public int maxRotateFunction(int[] nums) {
        //先写一版模拟，找找感觉
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            long tmp = 0;
            for(int j = 0, k = i; j < len; j++, k++){
                tmp += nums[k % len] * j;
            }
            if(tmp > max){
                max = (int)tmp;
            }
        }
        return max;
    }
}

## 第三版 想到了思路 找到了规律 如下

执行结果：
通过
显示详情
添加备注

执行用时：
4 ms
, 在所有 Java 提交中击败了
55.08%
的用户
内存消耗：
53 MB
, 在所有 Java 提交中击败了
68.29%
的用户
通过测试用例：
58 / 58

class Solution {
    public int maxRotateFunction(int[] nums) {
       //sum = 1 * arr0 + 1 * arr1 + 2 * arr2 + 1 * arr3
        //F0 = 0 * arr0 + 1 * arr1 + 2 * arr2 + 3 * arr3

        //F1 = 1 * arr0 + 2 * arr1 + 3 * arr2 + 0 * arr3 => F0 + sum - n * arr3;
        //F2 = 2 * arr0 + 3 * arr1 + 0 * arr2 + 1 * arr3 => F1 + sum - n * arr2;
        //F3 = 3 * arr0 + 0 * arr1 + 1 * arr2 + 2 * arr3 => F2 + sum - n * arr1;
        //找到了如上规律，应该算是动态规划了

        int len = nums.length;
        if(len == 1)return 0;
        int[] dp = new int[len];
        int dp0 = 0;
        int sum = 0;

        for(int i = 0; i < len; i++){
            dp0 += i * nums[i];
            sum += nums[i];
        }
        dp[0] = dp0;
        int max = Math.max(Integer.MIN_VALUE, dp[0]);
        for(int i = 1; i < len; i++){
            dp[i] = dp[i - 1] + sum - len * nums[len - i];
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}
 
## 第三版 优化一下（数组转两个int） 最佳思路就出来了

执行结果：
通过
显示详情
添加备注

执行用时：
3 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
53.2 MB
, 在所有 Java 提交中击败了
50.81%
的用户
通过测试用例：
58 / 58

class Solution {
    public int maxRotateFunction(int[] nums) {
       //sum = 1 * arr0 + 1 * arr1 + 2 * arr2 + 1 * arr3
        //F0 = 0 * arr0 + 1 * arr1 + 2 * arr2 + 3 * arr3

        //F1 = 1 * arr0 + 2 * arr1 + 3 * arr2 + 0 * arr3 => F0 + sum - n * arr3;
        //F2 = 2 * arr0 + 3 * arr1 + 0 * arr2 + 1 * arr3 => F1 + sum - n * arr2;
        //F3 = 3 * arr0 + 0 * arr1 + 1 * arr2 + 2 * arr3 => F2 + sum - n * arr1;
        //找到了如上规律，应该算是动态规划了

        int len = nums.length;
        if(len == 1)return 0;
        // int[] dp = new int[len];
        int pre = 0;
        int sum = 0;

        for(int i = 0; i < len; i++){
            pre += i * nums[i];
            sum += nums[i];
        }
        int max = Math.max(Integer.MIN_VALUE, pre);
        for(int i = 1; i < len; i++){
            int cur = pre + sum - len * nums[len - i];
            if(cur > max){
                max = cur;
            }
            pre = cur;
        }
        return max;
    }
}
