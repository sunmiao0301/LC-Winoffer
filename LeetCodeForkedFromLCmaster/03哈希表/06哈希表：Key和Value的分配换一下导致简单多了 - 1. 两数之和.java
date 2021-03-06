//第一版 通过 但是效率很差
执行结果：
通过
执行用时：
427 ms
, 在所有 Java 提交中击败了
5.03%
的用户
内存消耗：
39.4 MB
, 在所有 Java 提交中击败了
6.10%
的用户
class Solution {
    public int[] twoSum(int[] nums, int target) {
    /*
    2 <= nums.length <= 10 4
    只会存在一个有效答案
    并返回它们的数组下标。
    数组中同一个元素在答案里不能重复出现,
    但是如果是两个元素相等不同位置则是可以的。比如：
    输入：nums = [3,2,4], target = 6
    输出：[1,2]
    那么就不能是3 + 3 = 6
    返回[0, 0]
    */

    Map<Integer, Integer> map = new HashMap<>();
    int len = nums.length, i = 0, j = 0;
    for(i = 0; i < len; i++){
        map.put(i, nums[i]);
    }
    for(i = 0; i < len; i++){
        map.remove(i, nums[i]);
        if(map.containsValue(target - nums[i]))
            break;
    }
    for(Map.Entry<Integer, Integer> d : map.entrySet()){
        if(d.getValue() == target - nums[i])
        j = d.getKey();
    }
    return new int[]{i, j};
    }
}

//第二版 将对Entry的操作改为对数组num的，效率没有提升
class Solution {
    public int[] twoSum(int[] nums, int target) {
    /*
    2 <= nums.length <= 10 4
    只会存在一个有效答案
    并返回它们的数组下标。
    数组中同一个元素在答案里不能重复出现,
    但是如果是两个元素相等不同位置则是可以的。比如：
    输入：nums = [3,2,4], target = 6
    输出：[1,2]
    那么就不能是3 + 3 = 6
    返回[0, 0]
    */
    Map<Integer, Integer> map = new HashMap<>();
    int len = nums.length, i = 0, j = 0;
    for(i = 0; i < len; i++){
        map.put(i, nums[i]);
    }
    for(i = 0; i < len; i++){
        map.remove(i, nums[i]);
        if(map.containsValue(target - nums[i]))
            break;
    }
    for(j = i + 1; j < len; j++){
        if(nums[j] == target - nums[i])
            break;
    }
    /*
    for(Map.Entry<Integer, Integer> d : map.entrySet()){
        if(d.getValue() == target - nums[i])
        j = d.getKey();
    }
    */
    return new int[]{i, j};
    }
}

//第三版 后来又构思了一下 空间复杂度好多了 但是时间没有改善
执行结果：
通过
执行用时：
376 ms
, 在所有 Java 提交中击败了
5.03%
的用户
内存消耗：
38.4 MB
, 在所有 Java 提交中击败了
82.96%
的用户
class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int i = 0, j = 0;
    for(i = 0; i < nums.length; i++){
        if(map.containsValue(target - nums[i]))
            break;
        map.put(i, nums[i]);
    }
    for(j = 0; j < i; j++){
        if(nums[j] == target - nums[i])
            break;
    }
    return new int[]{i, j};
    }
}

//标准题解
实在没有思路之后，看了题解
醍醐灌顶 我一直卡在map.put(Key, Value)上
实际上Key可以是数组下标 
也可以是数组下标对应的值 
如果用对应的值 
即使map没有getKey这个方法 
也能找到数组下标 
因为数组下标是Value了 
用get就能找到

原因是hashmap支持的方法，只能判断有没有Key/有没有Value/通过Key找Value，而不支持通过Value找Key：
1）get()	获取指定 key 对应对 value
2）containsKey()	检查 hashMap 中是否存在指定的 key 对应的映射关系。
3）containsValue()	检查 hashMap 中是否存在指定的 value 对应的映射关系。

执行结果：
通过
执行用时：
1 ms
, 在所有 Java 提交中击败了
96.83%
的用户
内存消耗：
38.7 MB
, 在所有 Java 提交中击败了
38.92%
的用户

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
