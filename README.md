# LC-WinOffer 

| Directory                      | Detail                                             | Link                                                         |
| ------------------------------ | -------------------------------------------------- | ------------------------------------------------------------ |
| LeetCodeCodingInterviews       | 剑指 Offer（第 2 版）                              | https://leetcode-cn.com/problem-list/xb9nqhhg/               |
| LeetCodeDataStructure          | LeetCode专项突破-数据结构                          | https://leetcode-cn.com/study-plan/data-structures/?progress=iozhlo7 |
| LeetCodeEveryDay               | 每日 1 题                                          |                                                              |
| LeetCodeForkedFromLCmaster     | [**leetcode-master**](https://programmercarl.com/) | https://programmercarl.com/                                  |
| LeetCodeHot100                 | 🔥 LeetCode 热题 HOT 100                            | https://leetcode-cn.com/problem-list/2cktkvj/                |
| LeetCodeOtherPeopleAskedMeToDo | 与人讨论题                                         |                                                              |

*表示不会 

^表示不熟练

## leetcode-master

| 类型                                                         | 常见题型                                | 备注                                                         | 链接                                                         |
| ------------------------------------------------------------ | --------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [01数组](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/01%E6%95%B0%E7%BB%84) | 有序数组                                | 二分法                                                       | [704](https://leetcode-cn.com/problems/binary-search/)       |
|                                                              | 双指针                                  |                                                              | [27](https://leetcode-cn.com/problems/remove-element/)       |
|                                                              | 滑动窗口                                | 一般用双指针来模拟滑动窗口                                   | [209](https://leetcode-cn.com/problems/minimum-size-subarray-sum/) |
|                                                              | 二维数组（螺旋矩阵）                    | 注意二维数组中有一维或者二维都是null的情况<br>注意数组是引用类型，且null和length == 0是不一样的 | [59](https://leetcode-cn.com/problems/spiral-matrix-ii/)     |
|                                                              | **p.s.**                                | **有时候，对数组排一下序有奇效。**                           |                                                              |
| [02链表](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/02%E9%93%BE%E8%A1%A8) | 哨兵结点sentinel                        |                                                              | [203](https://leetcode-cn.com/problems/remove-linked-list-elements/) |
|                                                              | 链表数据结构及实现                      |                                                              | [707](https://leetcode-cn.com/problems/design-linked-list/)  |
|                                                              | 经典 -- 反转链表                        | 掌握海象之谜和哨兵节点，你对链表问题的迭代解法会变得像诗一样优雅<br>但是递归法仍有问题 | [206](https://leetcode-cn.com/problems/reverse-linked-list/) |
|                                                              | 两两对换                                |                                                              | [24](https://leetcode-cn.com/problems/swap-nodes-in-pairs/)  |
|                                                              | 经典 -- 删除链表的倒数第 N 个结点       | 快慢指针                                                     | [19](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/) |
|                                                              | 找**链表相交**的节点                    | 无论如何，最终总会 a == b                                    | [02.07](https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/) |
|                                                              | 环形链表Ⅰ，Ⅱ                            |                                                              | [142](https://leetcode-cn.com/problems/linked-list-cycle-ii/) |
|                                                              | **p.s.**                                | **链表题，只要是需要进行的操作，把头节点也包含在内的（比如反转链表、两两对换等），无脑用sentinel。** |                                                              |
| [03、哈希表](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/03%E5%93%88%E5%B8%8C%E8%A1%A8) | 有效的字母异位词                        | 这题本质上就是赎金信plus<br>注意，由于小写字母（需要统计的元素种类数很小）只有26个，所以我们可以通过数组代替哈希表。 | [242](https://leetcode-cn.com/problems/valid-anagram/)       |
|                                                              | 两个数组的交集Ⅰ, Ⅱ                      | Ⅰ可以通过set完成、Ⅱ就得用map了。                             | [349](https://leetcode-cn.com/problems/intersection-of-two-arrays/)<br>[350](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/) |
|                                                              | 快乐数                                  | p.s. 本题还可以在时间复杂度不变的情况下，不用set做，节省空间成本 | [202](https://leetcode-cn.com/problems/happy-number/)        |
|                                                              | 两数之和                                | [map，并且遍历一遍即可](01/LC-Winoffer/blob/main/LeetCodeDataStructure14Days/Day02-1.%20两数之和.java) | [1](https://leetcode-cn.com/problems/two-sum/)               |
|                                                              | *四数相加Ⅱ                              | 分组 + 哈希表<br>本题咋眼一看好像和[0015.三数之和](https://programmercarl.com/0015.三数之和.html)，[0018.四数之和](https://programmercarl.com/0018.四数之和.html)差不多，其实差很多。<br>本题是使用哈希法的经典题目，而三数之和，四数之和并不合适使用哈希法，因为三数之和和四数之和这两道题目使用哈希法在不超时的情况下做到对结果去重是很困难的，很有多细节需要处理。<br>而这道题目是四个独立的数组，只要找到A[i] + B[j] + C[k] + D[l] = 0就可以，不用考虑有重复的四个元素相加等于0的情况，所以相对于题目18. 四数之和，题目15.三数之和，还是简单了不少！ | [454](https://leetcode-cn.com/problems/4sum-ii/)             |
|                                                              | 赎金信                                  | map，并且遍历一遍即可                                        | [383](https://leetcode-cn.com/problems/ransom-note/)         |
|                                                              | *三数之和                               | **难度在于怎么去重？**                                       | [15](https://leetcode-cn.com/problems/3sum/)                 |
|                                                              | *四数之和                               |                                                              | [18](https://leetcode-cn.com/problems/4sum/)                 |
|                                                              | **p.s.**                                | **`int count = map.getOrDefault(num, 0) + 1;`<br>`map.put(num, count);`** |                                                              |
|                                                              | **p.s.**                                | **当我们想使用哈希法来解决问题的时候，我们一般会选择如下三种数据结构：`数组`、`set （集合）`、 `map(映射)`** |                                                              |
| [04、字符串](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/04%E5%AD%97%E7%AC%A6%E4%B8%B2) | 反转字符串Ⅰ，Ⅱ                          | 1）swap函数可以用位运算实现<br>2）字符串和字符数组之间的转换，可以用<br>`char[] ch = s.toStringArray();`<br>`return new String(ch);` | [344](https://leetcode-cn.com/problems/reverse-string/)<br>[541](https://leetcode-cn.com/problems/reverse-string-ii/) |
|                                                              | 替换空格(或是替换其他)                  | 1）对字符串进行（非原地替换）新建和替换，可以用StringBuider类的方法append()，其中append既可以跟字符串s，也可以字符c作为参数 | [剑指offer05](https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/) |
|                                                              | 翻转字符串里的单词                      | 清空StringBuilder sb<br>`sb.delete(0, sb.length());`         | [151](https://leetcode-cn.com/problems/reverse-words-in-a-string/) |
|                                                              | 左旋转字符串                            | StringBuilder                                                | [剑指offer58](https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/) |
|                                                              |                                         | KMP算法                                                      | https://github.com/sunmiao0301/leetcode-master#%E5%AD%97%E7%AC%A6%E4%B8%B2 |
| [05、双指针法](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/05%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95) |                                         | 是由之前的题中涉及到双指针思想的题组成的，所以就不重复列出了。 |                                                              |
| [06、栈与队列](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/06%E6%A0%88%E4%B8%8E%E9%98%9F%E5%88%97) | 用栈实现队列                            | ![image-20220406172245995](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202204061722283.png) | [232](https://leetcode-cn.com/problems/implement-queue-using-stacks/) |
|                                                              | 用队列实现栈                            | 一个队列即可                                                 | [225](https://leetcode-cn.com/problems/implement-stack-using-queues/) |
|                                                              | 有效的括号                              | 栈                                                           | [20](https://leetcode-cn.com/problems/valid-parentheses/)    |
|                                                              | 删除字符串中的所有相邻重复项            | StringBuilder，虽说标签是栈，但不一定非要用栈，而是用到栈的思想即可 | [1047](https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/) |
|                                                              | 逆波兰表达式求值                        | 同上一题，不一定非要用栈`Stack<T> s = new Stack<>();`，本题用数组模拟栈会快很多 | [150](https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/) |
|                                                              | *滑动窗口最大值                         | 困难题，难在需要考虑的情况比较多                             | [239](https://leetcode-cn.com/problems/sliding-window-maximum/) |
|                                                              | *前 K 个高频元素                        | 题目最终需要返回的是前 k*k* 个频率最大的元素，借助堆这种数据结构，对于 k频率之后的元素不再处理，进一步优化时间复杂度。 | [347](https://leetcode-cn.com/problems/top-k-frequent-elements/) |
|                                                              | **p.s.**                                | **有时候，不一定非要用到标准的栈结构`Stack<> s = new Stack<>();`，而是借用栈“先入后出”的思想解题（比如用数组实现栈）** |                                                              |
| [07、二叉树](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/07%E4%BA%8C%E5%8F%89%E6%A0%91) | 02、03、深度优先遍历（前中后序遍历）DFS | 1）递归法<br>2）迭代法（由于递归就是隐形栈，所以递归能做的，栈也能）<br>迭代法中序遍历与前后序遍历略有不同 | 144.二叉树的前序遍历<br>94.二叉树的中序遍历<br>145.二叉树的后序遍历 |
|                                                              | 05、广度优先遍历BFS（层序遍历）         | 只用一个队列存储每层节点的话，需要用一个整数值存储上一层的节点数<br>1）一个用于返回的List<List< Integer>> <br>2）一个用于存储某层节点的list< TreeNode><br>3）一个用于存储某层节点值的list< Integer><br>4）整数值i用于记载list< TreeNode>中当前有多少节点是上一层的 | **[一共八道题](https://github.com/sunmiao0301/leetcode-master/blob/master/problems/0102.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.md)** |
|                                                              | 06、翻转二叉树                          | homebrew:dog:<br>无需helper()                                | [226](https://leetcode-cn.com/problems/invert-binary-tree/)  |
|                                                              | 08、对称二叉树                          |                                                              | [101](https://leetcode-cn.com/problems/symmetric-tree/)      |
|                                                              | 09、二叉树的最大深度                    | 无需helper()                                                 | [104](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) |
|                                                              | 10、二叉树的最小深度                    | 和最大深度代码结构一致                                       | [111](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/) |
|                                                              | *11、完全二叉树的节点个数               | 1）二分查找 + 位运算 **难**<br>2）DFS暴力 易                 | [222](https://leetcode-cn.com/problems/count-complete-tree-nodes/) |
|                                                              | *12、平衡二叉树                         | 自顶向下 慢，写出来了<br/>自底向上 快，没写出来              | [110](https://leetcode-cn.com/problems/balanced-binary-tree/) |
|                                                              | 13、二叉树的所有路径                    | 参数传递的本质依旧是GRoE                                     | [257](https://leetcode-cn.com/problems/binary-tree-paths/)   |
|                                                              | 16、左叶子之和                          | 广度优先的话很简单<br>深度优先的话如果不用全局变量，需要一点编程思想。 | [404](https://leetcode-cn.com/problems/sum-of-left-leaves/)  |
|                                                              | 17、找树左下角的值                      | LinkedList层序遍历<br>1）普通思路：从左到右层序遍历（配合for循环即可）<br>2）巧妙思路：从右往左层序遍历，LinkedList中最后一个值就是左下角的值 | [513](https://leetcode-cn.com/problems/find-bottom-left-tree-value/) |
|                                                              | 18、路径总和                            | 这题如果新建一个传参currentSum，需要一个helper()<br>更聪明的方法是用targetSum - TreeNode.val | [112](https://leetcode-cn.com/problems/path-sum/)            |
|                                                              | *19、从中序与后序遍历序列构造二叉树     | left - root - right<br>left - right - root<br>**那么首先需要的就是找到root生成根，并得到递归需要的左右子树分界点，如果用的是*left之后的第一个不同节点就错了，因为right不是一定存在*，但是*root一定存在，所以在后序的最后一个值是root，由此在中序中又能得到分界点***<br>p.s.为什么前序和后序不能唯一构成一棵二叉树？因为没有中序遍历就无法确定左右部分，也就无法分割。 | [106](https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) |
|                                                              | 20、最大二叉树                          | 递归函数什么时候加if(xxx != null)，什么时候不加if，其实就是控制空节点（空指针）是否进入递归，是不同的代码实现方式，都是可以的。<br/>一般情况来说：<br/>如果让空节点（空指针）进入递归，就不加if<br/>如果不让空节点进入递归，就加if限制一下， 终止条件也会相应的调整。 | [654](https://leetcode-cn.com/problems/maximum-binary-tree/) |
|                                                              | 22、合并二叉树                          | 想要在递归helper(TreeNode root)中修改节点，必须是root.left = xx<br>而不能是root = xx<br>因为这个helper(TreeNode root)给到递归下一层的root，并不是上一层的引用，而是一个复制了地址的新引用，如果对这个复制的引用进行root = xx，就直接将这个引用的位置改掉了，又去复制新的地址去了。<br><br>举个例子，现在有一个人的思想（node1）被你（node2）通过语句（node2 = node1）控制了，现在，你想要他的左手去摸电线，那么你应该直接（node2.lefthand = cable），而不能亲自寄生到他的左手里（此时你就又执行了node2 = node1.lefthand），然后说（node2 = cable），因为这样操作的结果不是他的手触摸电线，而是你直接转移到电线上（node2 = cable）<br>一言以蔽之，当你是一个寄生的指针p（p = 主指针）的时候，你应该p.left = cable，p.right = cable，而不是p = cable，因为java会以为理解为：你想去重新寄生电线，而不是你想要被你寄生的那个主指针去碰电线。 | [617](https://leetcode-cn.com/problems/merge-two-binary-trees/) |
|                                                              | 23、二叉搜索树中的搜索                  | 无需helper()                                                 | [700](https://leetcode-cn.com/problems/search-in-a-binary-search-tree/) |
|                                                              | 24、验证二叉搜索树                      | **二叉搜索树重要性质：**<br>二叉搜索树「中序遍历」得到的值构成的序列一定是升序的 | [98](https://leetcode-cn.com/problems/validate-binary-search-tree/) |
|                                                              | 25、二叉搜索树的最小绝对差              | 在搜索二叉树题目中，往往需要写迭代中序遍历。<br>但是我还是想用递归，并且我又不想创建全局变量，所以我经常用数组int[1]进行传参。<br>如果创建全局变量，参数就少很多。（实际上，leetcode上对于二叉搜索树的递归中序遍历，标准题解都是经常全局变量的。） | [530](https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/) |
|                                                              | 26、二叉搜索树中的众数                  | 这题的中序递归，就用一下全局变量吧（题解多样性）             | [501](https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/solution/) |
|                                                              | *27、二叉树的最近公共祖先               |                                                              | [236](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/) |
|                                                              | *29、二叉搜索树的最近公共祖先           |                                                              | [235](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) |
|                                                              | 30、二叉搜索树中的插入操作              | 无需helper()函数<br>二叉搜索树的插入一定能在叶子节点左右插入 | [701](https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/) |
|                                                              | 31、删除二叉搜索树中的节点              | 思路要清晰：<br>找寻，<br/>1、能继续往下遍历（根据搜索二叉树，想走的路不为null<br/>2、不能继续往下遍历（根据搜索二叉树，想走的路为null<br/>3、在能找到的情况下：<br/>3.1、如果找到的节点的左右都不为null，<br/>3.2、如果找到的节点的左右有一个为null，<br/>3.3、如果找到的节点的左右都是null。 | [450](https://leetcode-cn.com/problems/delete-node-in-a-bst/) |
|                                                              | *32、修剪二叉搜索树                     |                                                              | [669](https://leetcode-cn.com/problems/trim-a-binary-search-tree/) |
|                                                              | *33、将有序数组转换为二叉搜索树         |                                                              | [108](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/) |
|                                                              | 34、把二叉搜索树转换为累加树            | 利用二叉搜索树的“中序遍历是递增”的性质 —— 那么按照右中左遍历就是递减 | [538](https://leetcode-cn.com/problems/convert-bst-to-greater-tree/) |
|                                                              | **p.s.**                                | **对于某个要完成的二叉树方法makeSthToTree(){}<br>使用：<br>root.left = makeSthToTree()<br>root.left = makeSthToTree()<br>往往能避免额外的一个helper()函数，而且写出来很优雅，尽量用这种结构写** |                                                              |
|                                                              | **p.s.**                                | **二叉树的问题主要就是（递归 \|\| 迭代）&&（深搜 \|\| 广搜），具体用哪种视情况而定** |                                                              |
|                                                              | **p.s.**                                | **二叉树全总结**                                             | **[见此处](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/%E4%BA%8C%E5%8F%89%E6%A0%91%E6%80%BB%E7%BB%93%E7%AF%87.md)** |
| [08、回溯算法](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/08%E5%9B%9E%E6%BA%AF%E7%AE%97%E6%B3%95) |                                         |                                                              |                                                              |
| [09、贪心算法](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/09%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95) |                                         |                                                              |                                                              |
| [10、动态规划](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/10%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92) |                                         |                                                              |                                                              |
| [11、单调栈](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/11%E5%8D%95%E8%B0%83%E6%A0%88) |                                         |                                                              |                                                              |



## LeetCodeDataStructure

| 等级 | 类型     | 天数  | 题目                                                         | 备注                                                         |
| ---- | -------- | ----- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 入门 | 数组     | Day1  | [217. 存在重复元素](https://leetcode-cn.com/problems/contains-duplicate/) |                                                              |
|      |          |       | [53. 最大子数组和](https://leetcode-cn.com/problems/maximum-subarray/) | 动态规划                                                     |
|      | 数组     | Day2  | [1. 两数之和](https://leetcode-cn.com/problems/two-sum/)     | HashMap，并且只遍历一遍就够了                                |
|      |          |       | [88. 合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/) | *要求空间o(1)                                                |
|      | 数组     | Day3  | [350. 两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/) |                                                              |
|      |          |       | [121. 买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/) |                                                              |
|      | 数组     | Day4  | [566. 重塑矩阵](https://leetcode-cn.com/problems/reshape-the-matrix/) |                                                              |
|      |          |       | [118. 杨辉三角](https://leetcode-cn.com/problems/pascals-triangle/) |                                                              |
|      | 数组     | Day5  | [36. 有效的数独](https://leetcode-cn.com/problems/valid-sudoku/) |                                                              |
|      |          |       | [73. 矩阵置零](https://leetcode-cn.com/problems/set-matrix-zeroes/) |                                                              |
|      | 字符串   | Day6  | [387. 字符串中的第一个唯一字符](https://leetcode-cn.com/problems/first-unique-character-in-a-string/) |                                                              |
|      |          |       | [383. 赎金信](https://leetcode-cn.com/problems/ransom-note/) |                                                              |
|      |          |       | [242. 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) |                                                              |
|      | 链表     | Day7  | [141. 环形链表](https://leetcode-cn.com/problems/linked-list-cycle/) |                                                              |
|      |          |       | [21. 合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists/) |                                                              |
|      |          |       | [203. 移除链表元素](https://leetcode-cn.com/problems/remove-linked-list-elements/) |                                                              |
|      | 链表     | Day8  | [206. 反转链表](https://leetcode-cn.com/problems/reverse-linked-list/) |                                                              |
|      |          |       | [83. 删除排序链表中的重复元素](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/) |                                                              |
|      | 栈/队列  | Day9  | [20. 有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) |                                                              |
|      |          |       | [232. 用栈实现队列](https://leetcode-cn.com/problems/implement-queue-using-stacks/) |                                                              |
|      | 树       | Day10 | [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/) |                                                              |
|      |          |       | [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) |                                                              |
|      |          |       | [145. 二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/) |                                                              |
|      | 树       | Day11 | [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/) |                                                              |
|      |          |       | [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) |                                                              |
|      |          |       | [101. 对称二叉树](https://leetcode-cn.com/problems/symmetric-tree/) |                                                              |
|      | 树       | Day12 | [226. 翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/) |                                                              |
|      |          |       | [112. 路径总和](https://leetcode-cn.com/problems/path-sum/)  |                                                              |
|      | 树       | Day13 | [700. 二叉搜索树中的搜索](https://leetcode-cn.com/problems/search-in-a-binary-search-tree/) |                                                              |
|      |          |       | [701. 二叉搜索树中的插入操作](https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/) |                                                              |
|      | 树       | Day14 | [98. 验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/) |                                                              |
|      |          |       | [653. 两数之和 IV - 输入 BST](https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/) |                                                              |
|      |          |       | [235. 二叉搜索树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) |                                                              |
| -    |          |       |                                                              |                                                              |
| 基础 | 数组     | Day1  | [136. 只出现一次的数字](https://leetcode-cn.com/problems/single-number/) |                                                              |
|      |          |       | [169. 多数元素](https://leetcode-cn.com/problems/majority-element/) |                                                              |
|      |          |       | [15. 三数之和](https://leetcode-cn.com/problems/3sum/)       |                                                              |
|      | 数组     | Day2  | [75. 颜色分类](https://leetcode-cn.com/problems/sort-colors/) |                                                              |
|      |          |       | [56. 合并区间](https://leetcode-cn.com/problems/merge-intervals/) |                                                              |
|      |          |       | [706. 设计哈希映射](https://leetcode-cn.com/problems/design-hashmap/) |                                                              |
|      | 数组     | Day3  | [119. 杨辉三角 II](https://leetcode-cn.com/problems/pascals-triangle-ii/) |                                                              |
|      |          |       | [48. 旋转图像](https://leetcode-cn.com/problems/rotate-image/) |                                                              |
|      |          |       | [59. 螺旋矩阵 II](https://leetcode-cn.com/problems/spiral-matrix-ii/) |                                                              |
|      | 数组     | Day4  | [240. 搜索二维矩阵 II](https://leetcode-cn.com/problems/search-a-2d-matrix-ii/) |                                                              |
|      |          |       | [435. 无重叠区间](https://leetcode-cn.com/problems/non-overlapping-intervals/) |                                                              |
|      | 数组     | Day5  | [334. 递增的三元子序列](https://leetcode-cn.com/problems/increasing-triplet-subsequence/) |                                                              |
|      |          |       | [238. 除自身以外数组的乘积](https://leetcode-cn.com/problems/product-of-array-except-self/) |                                                              |
|      |          |       | [560. 和为 K 的子数组](https://leetcode-cn.com/problems/subarray-sum-equals-k/) |                                                              |
|      | 字符串   | Day6  | [415. 字符串相加](https://leetcode-cn.com/problems/add-strings/) |                                                              |
|      |          |       | [409. 最长回文串](https://leetcode-cn.com/problems/longest-palindrome/) |                                                              |
|      | 字符串   | Day7  | [290. 单词规律](https://leetcode-cn.com/problems/word-pattern/) |                                                              |
|      |          |       | [763. 划分字母区间](https://leetcode-cn.com/problems/partition-labels/) |                                                              |
|      | 字符串   | Day8  | [49. 字母异位词分组](https://leetcode-cn.com/problems/group-anagrams/) |                                                              |
|      |          |       | [43. 字符串相乘](https://leetcode-cn.com/problems/multiply-strings/) |                                                              |
|      | 字符串   | Day9  | [187. 重复的DNA序列](https://leetcode-cn.com/problems/repeated-dna-sequences/) |                                                              |
|      |          |       | [5. 最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/) |                                                              |
|      | 链表     | Day10 | [2. 两数相加](https://leetcode-cn.com/problems/add-two-numbers/) |                                                              |
|      |          |       | [142. 环形链表 II](https://leetcode-cn.com/problems/linked-list-cycle-ii/) |                                                              |
|      | 链表     | Day11 | [160. 相交链表](https://leetcode-cn.com/problems/intersection-of-two-linked-lists/) |                                                              |
|      |          |       | [82. 删除排序链表中的重复元素 II](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/) |                                                              |
|      | 链表     | Day12 | [24. 两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/) |                                                              |
|      |          |       | [707. 设计链表](https://leetcode-cn.com/problems/design-linked-list/) |                                                              |
|      | 链表     | Day13 | [25. K 个一组翻转链表](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/) |                                                              |
|      |          |       | [143. 重排链表](https://leetcode-cn.com/problems/reorder-list/) |                                                              |
|      | 栈/队列  | Day14 | [155. 最小栈](https://leetcode-cn.com/problems/min-stack/)   |                                                              |
|      |          |       | [1249. 移除无效的括号](https://leetcode-cn.com/problems/minimum-remove-to-make-valid-parentheses/) |                                                              |
|      |          |       | [1823. 找出游戏的获胜者](https://leetcode-cn.com/problems/find-the-winner-of-the-circular-game/) |                                                              |
|      | 树       | Day15 | [108. 将有序数组转换为二叉搜索树](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/) |                                                              |
|      |          |       | [105. 从前序与中序遍历序列构造二叉树](https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) |                                                              |
|      |          |       | [103. 二叉树的锯齿形层序遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/) |                                                              |
|      | 树       | Day16 | [199. 二叉树的右视图](https://leetcode-cn.com/problems/binary-tree-right-side-view/) |                                                              |
|      |          |       | [113. 路径总和 II](https://leetcode-cn.com/problems/path-sum-ii/) |                                                              |
|      |          |       | [450. 删除二叉搜索树中的节点](https://leetcode-cn.com/problems/delete-node-in-a-bst/) |                                                              |
|      | 树       | Day17 | [230. 二叉搜索树中第K小的元素](https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/) |                                                              |
|      |          |       | [173. 二叉搜索树迭代器](https://leetcode-cn.com/problems/binary-search-tree-iterator/) |                                                              |
|      | 树       | Day18 | [236. 二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/) | [235. 二叉搜索树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) |
|      |          |       | [297. 二叉树的序列化与反序列化](https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/) |                                                              |
|      | 图       | Day19 | [997. 找到小镇的法官](https://leetcode-cn.com/problems/find-the-town-judge/) |                                                              |
|      |          |       | [1557. 可以到达所有点的最少点数目](https://leetcode-cn.com/problems/minimum-number-of-vertices-to-reach-all-nodes/) |                                                              |
|      |          |       | [841. 钥匙和房间](https://leetcode-cn.com/problems/keys-and-rooms/) |                                                              |
|      | 优先队列 | Day20 | [215. 数组中的第K个最大元素](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/) |                                                              |
|      |          |       | [347. 前 K 个高频元素](https://leetcode-cn.com/problems/top-k-frequent-elements/) |                                                              |
|      | 优先队列 | Day21 | [451. 根据字符出现频率排序](https://leetcode-cn.com/problems/sort-characters-by-frequency/) |                                                              |
|      |          |       | [973. 最接近原点的 K 个点](https://leetcode-cn.com/problems/k-closest-points-to-origin/) |                                                              |

