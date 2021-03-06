2nd 很简单 但是swap函数还有一种方案是：
/**
 * 通过位运算：
 * s[i] ^= s[j];
 * s[j] ^= s[i];
 * s[i] ^= s[j];
 */
class Solution {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while(l < r){
            swap(s, l, r);
            l++;
            r--;
        }
    }
    public void swap(char[] s, int l, int r){
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
    }
}

//第一版 一遍过

执行结果：
通过
执行用时：
1 ms
, 在所有 Java 提交中击败了
97.05%
的用户
内存消耗：
44.8 MB
, 在所有 Java 提交中击败了
84.81%
的用户

class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
