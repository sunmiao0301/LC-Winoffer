2nd
画个图分析一下可知 对于快慢指针，相遇的时候：
快指针走的路程是：待求值x + 比慢指针多走的圈数n * 一圈长度 + 慢指针在圈内走的长度l
慢指针走的路程是：待求值x + 慢指针在圈内走的长度l

但是这么多等量关系还是不够的，还有一个关键的关系是：由于快指针每次走两步 慢指针每次一步 所以 快s = 2 * 慢s
然后就变成数学题了，得到等量关系即可
p.s. 此外还可以用HashMap

//第一版 一遍过 但是效率很差
执行结果：
通过
执行用时：
4 ms
, 在所有 Java 提交中击败了
16.54%
的用户
内存消耗：
38.7 MB
, 在所有 Java 提交中击败了
21.44%
的用户
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
说明：不允许修改给定的链表。
你是否可以使用 O(1) 空间解决此题？
如果要用o（1），我感觉就是时间换空间 用快慢指针慢慢磨
如果 pos 是 -1，则在该链表中没有环（这个pos的作用只是为了区分示例，并不作为参数传递到函数中）
是否单个节点有环？ 比如head = [1], pos = 0
如果只考虑时间复杂度，那么就是hashmap
其实涉及链表的都可以考虑考虑用hashmap
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
    HashMap<ListNode, Integer> hashmap = new HashMap<>();
    while(head != null && !hashmap.containsKey(head)){
        hashmap.put(head, 0);
        head = head.next;
    }
    return head;
    }
}

//标准题解思路一：哈希表（用的HashSet）效果和hashmap差不多
执行结果：
通过
执行用时：
3 ms
, 在所有 Java 提交中击败了
20.67%
的用户
内存消耗：
39.6 MB
, 在所有 Java 提交中击败了
5.15%
的用户
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<ListNode>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }
}

标准题解思路二：快慢指针
《代码随想录》链接：https://github.com/sunmiao0301/leetcode-master/blob/master/problems/0142.%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8II.md#142%E7%8E%AF%E5%BD%A2%E9%93%BE%E8%A1%A8ii
思路十分清楚
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
38.4 MB
, 在所有 Java 提交中击败了
61.27%
的用户
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {// 有环
                ListNode index1 = fast;
                ListNode index2 = head;
                // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
