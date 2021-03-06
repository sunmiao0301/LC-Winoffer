2nd
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
42.2 MB
, 在所有 Java 提交中击败了
5.06%
的用户
通过测试用例：
66 / 66
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //如Berkeley所说 如果链表中各个节点地位不一致 那么特殊情况的考虑会把代码变得极丑 哨兵节点能够解决这问题
        ListNode sentinel = new ListNode(301, head);
        ListNode p = sentinel;
        while(p.next != null){
            if(p.next.val == val){
                p.next = p.next.next;
            }
            else{
                p = p.next;
            }
        }
        return sentinel.next;
    }  
}

//第一版 一遍过 
用虚拟结点头 也就是
ListNode head_is_next = new ListNode(0, head);
很方便 但是空间一般

执行结果：
通过
执行用时：
1 ms
, 在所有 Java 提交中击败了
98.99%
的用户
内存消耗：
39.7 MB
, 在所有 Java 提交中击败了
10.52%
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
    public ListNode removeElements(ListNode head, int val) {
    while(head != null && head.val == val){
        head = head.next;
    }
    if(head == null){
        return null;
    }
    ListNode next_is_head = new ListNode(0, head);//第一个结点必定不是val
    ListNode fast = head.next;
    while(fast != null){
        if(fast.val == val){
            fast = fast.next;
            head.next = fast;
            continue;
        }
        head = fast;
        fast = fast.next;
    }
    return next_is_head.next;
    }
}

//第二版 把continue 改成 else 之后 空间占用居然变小了 
不知有没有理论支持

class Solution {
    public ListNode removeElements(ListNode head, int val) {
    while(head != null && head.val == val){
        head = head.next;
    }
    if(head == null){
        return null;
    }
    ListNode next_is_head = new ListNode(0, head);//第一个结点必定不是val
    ListNode fast = head.next;
    while(fast != null){
        if(fast.val == val){
            fast = fast.next;
            head.next = fast;
        }
        else{····································相较于第一版的修改之处
            head = fast;
            fast = fast.next;   
        }
    }
    return next_is_head.next;
    }
}


//第三版 标准题解
/**
 * 添加虚节点方式
 */
public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
        return head;
    }
    // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
    ListNode dummy = new ListNode(-1, head);
    ListNode pre = dummy;
    ListNode cur = head;
    while (cur != null) {
        if (cur.val == val) {
            pre.next = cur.next;
        } else {
            pre = cur;
        }
        cur = cur.next;
    }
    return dummy.next;
}
/**
 * 不添加虚拟节点方式
 */
public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
        head = head.next;
    }
    // 已经为null，提前退出
    if (head == null) {
        return head;
    }
    // 已确定当前head.val != val
    ListNode pre = head;
    ListNode cur = head.next;
    while (cur != null) {
        if (cur.val == val) {
            pre.next = cur.next;
        } else {
            pre = cur;
        }
        cur = cur.next;
    }
    return head;
}
