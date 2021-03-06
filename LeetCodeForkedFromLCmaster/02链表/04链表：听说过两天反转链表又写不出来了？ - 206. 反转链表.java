2nd 掌握清楚了海象之谜之后 代码会变得像诗一样优雅 —— 迭代法
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        //先双指针吧
        ListNode left = null;
        ListNode mid = head;
        ListNode right = head.next;
        while(right != null){
            mid.next = left;
            left = mid;
            mid = right;
            right = right.next;
        }
        mid.next = left;
        return mid;
    }
}
2rd 递归还是不熟练 不成系统 需加强 题解如下 
//但是有一个疑问，递归到最后一层的时候直接就返回head了 前面的还没执行啊？
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
//如果用另外一种递归（我觉得可以称为将迭代递归化，哈哈）就写的很简单了
// 递归 
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode temp = null;
        temp = cur.next;// 先保存下一个节点
        cur.next = prev;// 反转
        // 更新prev、cur位置
        prev = cur;
        cur = temp;
        return reverse(prev, cur);
    }
}


//第一版 一遍过 （看了题解可知 递归不如迭代 因为使用递归，将会使用隐式栈空间。递归深度可能会达到 n 层。）
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
38.5 MB
, 在所有 Java 提交中击败了
10.76%
的用户
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode ret = new ListNode(0);
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        helper(head);
        head.next = null;
        return ret;
    }
    void helper(ListNode cur){
    if(cur.next.next == null){
        cur.next.next = cur;
        ret = cur.next;
        return;     
    }
        helper(cur.next);
        cur.next.next = cur;
    }
}

//第二版 题解——迭代
方法一：迭代
在遍历列表时，将当前节点的 \textit{next}next 指针改为指向前一个元素。
由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。
在更改引用之前，还需要另一个指针来存储下一个节点。
不要忘记在最后返回新的头引用！

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
复杂度分析

时间复杂度：O(n)O(n)，假设 nn 是列表的长度，时间复杂度是 O(n)O(n)。
空间复杂度：O(1)O(1)。

题解——递归
方法二：递归
递归版本稍微复杂一些，其关键在于反向工作。假设列表的其余部分已经被反转，现在我们应该如何反转它前面的部分？

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
复杂度分析

时间复杂度：O(n)O(n)，假设 nn 是列表的长度，那么时间复杂度为 O(n)O(n)。
空间复杂度：O(n)O(n)，由于使用递归，将会使用隐式栈空间。递归深度可能会达到 nn 层。
