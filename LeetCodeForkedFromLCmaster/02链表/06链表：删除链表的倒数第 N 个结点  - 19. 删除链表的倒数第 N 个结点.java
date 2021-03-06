2nd 用的额外空间 实际上使用常数空间也能实现
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
39.8 MB
, 在所有 Java 提交中击败了
5.02%
的用户
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode sentinel = new ListNode(301, head);
        head = sentinel;
        int size = 0;
        while(head != null){
            arr.add(head);
            head = head.next;
            size++;
        }
        arr.add(null);//这样可以嘛
        arr.get(size - n - 1).next = arr.get(size - n + 1);
        return sentinel.next;
    }
}
2rd 双指针 配上哨兵节点就更诗意了
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(301, head);
        ListNode slow = sentinel;
        ListNode fast = sentinel;
        while(n > -1){
            fast = fast.next;
            n--;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return sentinel.next;
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
36.4 MB
, 在所有 Java 提交中击败了
60.09%
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
 /*
你能尝试使用一趟扫描实现吗？倒数第n个却要求之扫描一遍？那就只能用空间换了。。。、
思路很简单，遍历一遍的同时把每个位置结点都存到数组里，
然后最后根据n值
通过数组索引可以直接找到要删除的结点的前后结点（当n == len）时另算
然后直接连接他的前后结点起到“删除”的作用
如果n == len（结点总数）
就 直接返回arr[1] 也就是第二个结点
比较巧妙的地方在于 A 处代码 起到了不用额外判断n == 1时的情况 但是需要注意数组得为31
因为 题干中提示：
链表中结点的数目为 sz
1 <= sz <= 30
1 <= n <= sz
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode[] arr = new ListNode[31];//注意 因为设置是最后加个null 所以数组应该是31个空间才行 不然在30个结点时，最后加的null结点没有地方放
        int len = 0;
        while(head != null){
            arr[len++] = head;
            head = head.next;
        }
        arr[len] = null;································A
        if(len == n)return arr[1];
        arr[len - 1 - n].next = arr[len + 1 - n];
        return arr[0];
    }
}

//第二版 看了题解之后自己写的 双指针版 效果很好
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
36.2 MB
, 在所有 Java 提交中击败了
90.22%
的用户
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode l = head;
    ListNode r = head;
    while(n > 0){
        r = r.next;
        n--;
    }
    if(r == null)
        return l.next;
    while(r.next != null){
        l = l.next;
        r = r.next;
    }
    l.next = l.next.next;
    return head;
    }
}

//标准题解（双指针）
我们也可以在不预处理出链表的长度，以及使用常数空间的前提下解决本题。
由于我们需要找到倒数第 nn 个节点，因此我们可以使用两个指针 \textit{first}first 和 \textit{second}second 同时对链表进行遍历，并且 \textit{first}first 比 \textit{second}second 超前 nn 个节点。当 \textit{first}first 遍历到链表的末尾时，\textit{second}second 就恰好处于倒数第 nn 个节点。
具体地，初始时 \textit{first}first 和 \textit{second}second 均指向头节点。我们首先使用 \textit{first}first 对链表进行遍历，遍历的次数为 nn。此时，\textit{first}first 和 \textit{second}second 之间间隔了 n-1n−1 个节点，即 \textit{first}first 比 \textit{second}second 超前了 nn 个节点。
在这之后，我们同时使用 \textit{first}first 和 \textit{second}second 对链表进行遍历。当 \textit{first}first 遍历到链表的末尾（即 \textit{first}first 为空指针）时，\textit{second}second 恰好指向倒数第 nn 个节点。
根据方法一和方法二，如果我们能够得到的是倒数第 nn 个节点的前驱节点而不是倒数第 nn 个节点的话，删除操作会更加方便。因此我们可以考虑在初始时将 \textit{second}second 指向哑节点，其余的操作步骤不变。这样一来，当 \textit{first}first 遍历到链表的末尾时，\textit{second}second 的下一个节点就是我们需要删除的节点。

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}

复杂度分析
时间复杂度：O(L)O(L)，其中 LL 是链表的长度。
空间复杂度：O(1)O(1)。
