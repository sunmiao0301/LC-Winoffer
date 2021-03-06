2nd 不够优雅 太长 （可见最下面的题解）
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != null && b != null){
            a = a.next;
            b = b.next;
        }
        if(a == null){
            a = headB;
        }
        else{
            b = headA;
        }
        while(a != null && b != null){
            a = a.next;
            b = b.next;
        }
        if(a == null){
            a = headB;
        }
        else{
            b = headA;
        }
        while(a != null && b != null){
            if(a == b)
                return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }
}

//第一版 一遍过 因为在剑指offer里刷过 不然不一定写得出 思路“唯美” 
但是通俗的解释思路就是：
a、b同时从 headA 和 headB 出发
想要找到他们俩相交，就得使得他们俩相对于交点的距离相等，那么方法就是：
a 在跑完 headA 的那条链子之后 从链子 b 开始跑
b 在跑完 headB 的那条链子之后 从链子 a 开始跑
那么如果ab链子有相交 
势必有：
a 跑的距离 = a链子总长 + b链子总长 - 交点到链子尾端长度
b 跑的距离 = b链子总长 + a链子总长 - 交点到链子尾端长度
可以看出 是相等的 所以一旦有交点 用这个方法就能得到 但是如果没有交点 那么很明显 a = b 的时候 a = null = b 所以无论如何 return a(b) 都是对的

执行结果：
通过
执行用时：
1 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
41.2 MB
, 在所有 Java 提交中击败了
40.38%
的用户
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
你能否设计一个时间复杂度 O(n) 、仅用 O(1) 内存的解决方案？
return ListNode
listA 中节点数目为 m
listB 中节点数目为 n
0 <= m, n <= 3 * 104
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;
    while(a != null && b != null){
        a = a.next;
        b = b.next;
    }
    if(a == null){
        a = headB;
        while(b != null){
            a = a.next;
            b = b.next;
        }
        b = headA;
        while(a != b && a != null){
            a = a.next;
            b = b.next;
        }
        return a;
    }
    else{
        b = headA;
        while(a != null){
            a = a.next;
            b = b.next;
        }
        a = headB;
        while(a != b && b != null){
            a = a.next;
            b = b.next;
        }
        return a;
    }
    }
}

//标准题解 代码量小 效率和第一版差不多
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            //到达链表末尾时，重新走另一条链表的路
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        //之所以可以这么写而不会死循环的原因，是因为无论AB链表相交与否，最终 a 都会等于 b, 原因是如果没有相交节点的话，最终会 a == null, b == null 继而终止循环返回null
        return a;
    }
}
