2nd 因为没加哨兵 所以写太丑了 还不对 2nd的第二版 我将加上哨兵 以此美化代码
class MyLinkedList {
        int size;
        Node first;
        Node last;

    public MyLinkedList() {
        size = 0;
        first = null;
        last = first;
    }

    public class Node{
        public int val;
        public Node next;
        public Node(int v){
            val = v;
            next = null;
        }
    }
    
    public int get(int index) {
        Node p = first;
        while(index > 0 && p != null){
            p = p.next;
            index--;
        }
        if(p == null)
            return -1;
        return p.val;
    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = first;
        first = newHead;
        if(size == 0)
            last = first;
        size++;
    }
    
    public void addAtTail(int val) {
        if(size == 0){
            addAtHead(val);
        }
        else{
        Node newTail = new Node(val);
        last.next = newTail;
        last = last.next;
        size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index <= 0){
            addAtHead(val);
            size++;
        }
        else if(index == size){
            addAtTail(val);
            size++;
        }
        else if(index > size)
            return;
        else{
            index--;
            Node p = first;
            while(index > 0){
                p = p.next;
                index--;
            }
            Node newAtIndex = new Node(val);
            newAtIndex.next = p.next;
            p.next = newAtIndex;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        //index--;
        if(index == 0){
            Node p = first;
            first = first.next;
            p.next = null;//把链表搞好看一点
            size--;
        }
        else if(index > 0 && index <= size){
            index--;
            Node p = first;
            while(index > 0){
                p = p.next;
                index--;
            }
            p.next = p.next.next;
            size--;
        }
        else
            return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


先瞟了一眼单链表，然后自己实现了

//单链表成功实现
重点在于要实现单链表，首先还得新建一个ListNode类，这个是重点，然后就是初始化链表 需要 虚拟化头节点，这个也比较关键 效率还行 但是标准题解的效率更好
执行结果：
通过
执行用时：
10 ms
, 在所有 Java 提交中击败了
81.34%
的用户
内存消耗：
38.9 MB
, 在所有 Java 提交中击败了
78.82%
的用户
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
}
class MyLinkedList {
    ListNode head_is_next = new ListNode(0);
    /** Initialize your data structure here. */
    public MyLinkedList() {
        //ListNode head_is_next = new ListNode(0);
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode head = head_is_next.next;
        for(int i = 0; i < index && head != null; i++){
            head = head.next;
        }
        if(head == null)return -1;
        return head.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode p = new ListNode(val);
        p.next = head_is_next.next;
        head_is_next.next = p;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode head = head_is_next;
        while(head.next != null){
            head = head.next;
        }
        ListNode p = new ListNode(val);
        head.next = p;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode head = head_is_next;
        int i = 0;
        for(i = 0; i < index && head.next != null; i++){
            head = head.next;
        }
        if(i >= index){
            ListNode p = new ListNode(val);
            p.next = head.next;
            head.next = p;
        }
        if(head.next == null){}
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode head = head_is_next;
        int i = 0;
        for(i = 0; i < index && head.next != null; i++){
            head = head.next;
        }
        if(i == index && head.next != null){
            head.next = head.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
 
//标准题解 单链表 ············································单链表击败的少的原因应该是因为双链表快，提高了均值
执行结果：
通过
显示详情
添加备注

执行用时：
10 ms
, 在所有 Java 提交中击败了
81.34%
的用户
内存消耗：
39.2 MB
, 在所有 Java 提交中击败了
26.94%
的用户
class ListNode {
int val;
ListNode next;
ListNode(){}
ListNode(int val) {
this.val=val;
}
}
class MyLinkedList {
    //size存储链表元素的个数
    int size;
    //虚拟头结点
    ListNode head;

    //初始化链表
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    //获取第index个节点的数值
    public int get(int index) {
        //如果index非法，返回-1
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode currentNode = head;
        //包含一个虚拟头节点，所以查找第 index+1 个节点
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    //在链表最前面插入一个节点
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    //在链表的最后插入一个节点
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    // 在第 index 个节点之前插入一个新节点，例如index为0，那么新插入的节点为链表的新头节点。
    // 如果 index 等于链表的长度，则说明是新插入的节点为链表的尾结点
    // 如果 index 大于链表的长度，则返回空
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        size++;
        //找到要插入节点的前驱
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    //删除第index个节点
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}

//标准链表 双链表 ·····································
执行结果：
通过
执行用时：
7 ms
, 在所有 Java 提交中击败了
99.01%
的用户
内存消耗：
38.9 MB
, 在所有 Java 提交中击败了
78.82%
的用户
class MyLinkedList {
    class ListNode {
        int val;
        ListNode next,prev;
        ListNode(int x) {val = x;}
    }

    int size;
    ListNode head,tail;//Sentinel node

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size){return -1;}
        ListNode cur = head;

        // 通过判断 index < (size - 1) / 2 来决定是从头结点还是尾节点遍历，提高效率
        if(index < (size - 1) / 2){
            for(int i = 0; i <= index; i++){
                cur = cur.next;
            }            
        }else{
            cur = tail;
            for(int i = 0; i <= size - index - 1; i++){
                cur = cur.prev;
            }
        }
        return cur.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode cur = head;
        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        cur.next.prev = newNode;
        cur.next = newNode;
        newNode.prev = cur;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode cur = tail;
        ListNode newNode = new ListNode(val);
        newNode.next = tail;
        newNode.prev = cur.prev;
        cur.prev.next = newNode;
        cur.prev = newNode;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size){return;}
        if(index < 0){index = 0;}
        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        cur.next.prev = newNode;
        newNode.prev = cur;
        cur.next = newNode;
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0){return;}
        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        cur.next.next.prev = cur;
        cur.next = cur.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

