2nd
class Solution{
    public String replaceSpace(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                sb.append("%20");//StringBuilder类的append方法可以跟字符串
            else
                sb.append(s.charAt(i));//StringBuilder类的append方法可以跟字符
        }
        return sb.toString();
    }
}

//第一版 效率不行
执行结果：
通过
执行用时：
4 ms
, 在所有 Java 提交中击败了
5.90%
的用户
内存消耗：
36.8 MB
, 在所有 Java 提交中击败了
5.24%
的用户
class Solution {
    public String replaceSpace(String s) {
        String ret = "";
        int i = 0, j = 0;
        for(i = 0, j = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                ret += s.substring(j, i) + "%20";
                j = i + 1;
            }
        }
        ret += s.substring(j, i);
        return ret;
    }
}

//第二版 之前刷剑指时候写的
思路是：

如果想把这道题目做到极致，就不要只用额外的辅助空间了！
首先扩充数组到每个空格替换成"%20"之后的大小。
然后从后向前替换空格，也就是双指针法，过程如下：
i指向新长度的末尾，j指向旧长度的末尾。
替换空格
有同学问了，为什么要从后向前填充，从前向后填充不行么？
从前向后填充就是O(n^2)的算法了，因为每次添加元素都要将添加元素之后的所有元素向后移动。
其实很多数组填充类的问题，都可以先预先给数组扩容带填充后的大小，然后在从后向前进行操作。
这么做有两个好处：
不用申请新数组。
从后向前填充元素，避免了从前先后填充元素要来的 每次添加元素都要将添加元素之后的所有元素向后移动。
时间复杂度，空间复杂度均超过100%的用户。

class Solution {
    public String replaceSpace(String s) {
        int i = 0;
        char[] ret = new char[3 * s.length()];
            for(int j = 0; j < s.length(); i++,j++){//java与c不同
                if(s.charAt(j) == ' '){
                    ret[i] = '%';
                    ret[i+1] = '2';
                    ret[i+2] = '0';
                    i += 2;
                }else{
                    ret[i] = s.charAt(j);
                }
            }
            //String s_ret = new String(ret);//如果这样写 最后就会返回 因为空的字符数组位置会被填上\u0000 正确的方法是 String newStr = new String(array, 0, size); return newStr;
            //"We%20are%20happy.\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
            String s_ret = new String(ret, 0, i);
            return s_ret;
    }
}

//第三版 效率100%
class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}
