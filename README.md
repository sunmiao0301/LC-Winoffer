# WinOffer

#### [leetcode-master](https://github.com/youngyangyang04/leetcode-master)

**[leetcode-cn.com](https://leetcode-cn.com/)**

| 类型                                                         | 常见题型                                | 备注                                                         | 链接                                                         |
| ------------------------------------------------------------ | --------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [01、数组](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/01、数组) | 有序数组                                | 二分法                                                       | [704](https://leetcode-cn.com/problems/binary-search/)       |
|                                                              | 双指针                                  |                                                              | [27](https://leetcode-cn.com/problems/remove-element/)       |
|                                                              | 滑动窗口                                | 一般用双指针来模拟滑动窗口                                   | [209](https://leetcode-cn.com/problems/minimum-size-subarray-sum/) |
|                                                              | 二维数组（螺旋矩阵）                    | 注意二维数组中有一维或者二维都是null的情况<br>注意数组是引用类型，且null和length == 0是不一样的 | [59](https://leetcode-cn.com/problems/spiral-matrix-ii/)     |
|                                                              | p.s.                                    | 有时候，对数组排一下序有奇效。                               |                                                              |
| [02、链表](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/02、链表) | 哨兵结点sentinel                        |                                                              |                                                              |
|                                                              | 链表数据结构及实现                      |                                                              | [203](https://leetcode-cn.com/problems/remove-linked-list-elements/) |
|                                                              | 经典 -- 反转链表                        | 掌握海象之谜和哨兵节点，你对链表问题的迭代解法会变得像诗一样优雅<br>但是递归法仍有问题 | [707](https://leetcode-cn.com/problems/design-linked-list/)  |
|                                                              | 两两对换                                |                                                              | [206](https://leetcode-cn.com/problems/reverse-linked-list/) |
|                                                              | 经典 -- 删除链表的倒数第 N 个结点       | 快慢指针                                                     | [19](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/) |
|                                                              | 找**链表相交**的节点                    | 无论如何，最终总会 a == b                                    | [02.07](https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/) |
|                                                              | 环形链表Ⅰ，Ⅱ                            |                                                              | [142](https://leetcode-cn.com/problems/linked-list-cycle-ii/) |
| [03、哈希表](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/03、哈希表) |                                         |                                                              |                                                              |
| [04、字符串](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/04、字符串) | 反转字符串Ⅰ，Ⅱ                          | 1）swap函数可以用位运算实现<br>2）对字符串进行原地替换，可以用<br>`char[] ch = s.toStringArray();`<br>`return new String(ch);` | [344](https://leetcode-cn.com/problems/reverse-string/)<br>[541](https://leetcode-cn.com/problems/reverse-string-ii/) |
|                                                              | 替换空格(或是替换其他)                  | 1）对字符串进行（非原地替换）新建和替换，可以用StringBuider类的方法append()，其中append既可以跟字符串s，也可以字符c作为参数 | [剑指offer05](https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/) |
|                                                              | 翻转字符串里的单词                      | 清空StringBuilder sb<br>`sb.delete(0, sb.length());`         | [151](https://leetcode-cn.com/problems/reverse-words-in-a-string/) |
|                                                              | 左旋转字符串                            | StringBuilder                                                | [剑指offer58](https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/) |
|                                                              |                                         | KMP算法                                                      | https://github.com/sunmiao0301/leetcode-master#%E5%AD%97%E7%AC%A6%E4%B8%B2 |
|                                                              |                                         |                                                              |                                                              |
| [05、双指针法](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/05、双指针法) |                                         |                                                              |                                                              |
| [06、栈与队列](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/06、栈与队列) |                                         |                                                              |                                                              |
| [07、二叉树](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/07、二叉树) | 02、03、深度优先遍历（前中后序遍历）DFS | 1）递归法<br>2）迭代法（由于递归就是隐形栈，所以递归能做的，栈也能）<br>迭代法中序遍历与前后序遍历略有不同 | 144.二叉树的前序遍历<br>94.二叉树的中序遍历<br>145.二叉树的后序遍历 |
|                                                              | 05、广度优先遍历BFS（层序遍历）         | 只用一个队列存储每层节点的话，需要用一个整数值存储上一层的节点数<br>1）一个用于返回的List<List< Integer>> <br>2）一个用于存储某层节点的list< TreeNode><br>3）一个用于存储某层节点值的list< Integer><br>4）整数值i用于记载list< TreeNode>中当前有多少节点是上一层的 | **[一共八道题](https://github.com/sunmiao0301/leetcode-master/blob/master/problems/0102.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.md)** |
|                                                              | 06、翻转二叉树                          | homebrew:dog:<br><br>对于某个要完成的二叉树题方法makeSthToTree(){}<br/>尽量考虑能不能在其内使用makeSthToTree()来递归完成，避免额外的helper() | [226](https://leetcode-cn.com/problems/invert-binary-tree/)  |
|                                                              | 08、对称二叉树                          |                                                              | [101](https://leetcode-cn.com/problems/symmetric-tree/)      |
|                                                              | 09、二叉树的最大深度                    | 无需helper()                                                 | [104](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) |
|                                                              | 10、二叉树的最小深度                    | 和最大深度代码结构一致                                       | [111](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/) |
|                                                              | *11、完全二叉树的节点个数               | 1）二分查找 + 位运算 **难**<br>2）DFS暴力 易                 | [222](https://leetcode-cn.com/problems/count-complete-tree-nodes/) |
|                                                              | *12、平衡二叉树                         | 自顶向下 慢，写出来了<br/>自底向上 快，没写出来              | [110](https://leetcode-cn.com/problems/balanced-binary-tree/) |
|                                                              | 13、二叉树的所有路径                    | 参数传递的本质依旧是GRoE                                     | [257](https://leetcode-cn.com/problems/binary-tree-paths/)   |
|                                                              | 16、左叶子之和                          | 广度优先的话很简单<br>深度优先的话如果不用全局变量，需要一点编程思想。 | [404](https://leetcode-cn.com/problems/sum-of-left-leaves/)  |
|                                                              | 17、找树左下角的值                      | LinkedList层序遍历<br>1）普通思路：从左到右层序遍历（配合for循环即可）<br>2）巧妙思路：从右往左层序遍历，LinkedList中最后一个值就是左下角的值 | [513](https://leetcode-cn.com/problems/find-bottom-left-tree-value/) |
|                                                              | 18、路径总和                            | 这题如果新建一个传参currentSum，需要一个helper()<br>更聪明的方法是用targetSum - TreeNode.val | [112](https://leetcode-cn.com/problems/path-sum/)            |
|                                                              | *19、从中序与后序遍历序列构造二叉树     | left - root - right<br>left - right - root<br>那么首先需要的就是找到root生成根，并得到递归需要的左右子树分界点，如果用的是*left之后的第一个不同节点就错了，因为right不是一定存在*，但是*root一定存在，所以在后序的最后一个值是root，由此在中序中又能得到分界点*<br>p.s.为什么前序和后序不能唯一构成一棵二叉树？因为没有中序遍历就无法确定左右部分，也就无法分割。 | [106](https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) |
|                                                              | 20、最大二叉树                          | 递归函数什么时候加if(xxx != null)，什么时候不加if，其实就是控制空节点（空指针）是否进入递归，是不同的代码实现方式，都是可以的。<br/>一般情况来说：<br/>如果让空节点（空指针）进入递归，就不加if<br/>如果不让空节点进入递归，就加if限制一下， 终止条件也会相应的调整。 | [654](https://leetcode-cn.com/problems/maximum-binary-tree/) |
|                                                              | 22、合并二叉树                          | 想要在递归helper(TreeNode root)中修改节点，必须是root.left = xx<br>而不能是root = xx<br>因为这个helper(TreeNode root)给到递归下一层的root，并不是上一层的引用，而是一个复制了地址的新引用，如果对这个复制的引用进行root = xx，就直接将这个引用的位置改掉了，又去复制新的地址去了。<br><br>举个例子，现在有一个人的思想（node1）被你（node2）通过语句（node2 = node1）控制了，现在，你想要他的左手去摸电线，那么你应该直接（node2.lefthand = cable），而不能亲自寄生到他的左手里（此时你就又执行了node2 = node1.lefthand），然后说（node2 = cable），因为这样操作的结果不是他的手触摸电线，而是你直接转移到电线上（node2 = cable）<br>一言以蔽之，当你是一个寄生的指针p（p = 主指针）的时候，你应该p.left = cable，p.right = cable，而不是p = cable，因为java会以为理解为：你想去重新寄生电线，而不是你想要被你寄生的那个主指针去碰电线。 | [617](https://leetcode-cn.com/problems/merge-two-binary-trees/) |
|                                                              | 23、二叉搜索树中的搜索                  | 同*翻转二叉树备注*                                           | [700](https://leetcode-cn.com/problems/search-in-a-binary-search-tree/) |
|                                                              | 24、验证二叉搜索树                      | **二叉搜索树重要性质：**<br>二叉搜索树「中序遍历」得到的值构成的序列一定是升序的 | [98](https://leetcode-cn.com/problems/validate-binary-search-tree/) |
|                                                              | 25、二叉搜索树的最小绝对差              | 在搜索二叉树题目中，往往需要写迭代中序遍历。<br>但是我还是想用递归，并且我又不想创建全局变量，所以我经常用数组int[1]进行传参。<br>如果创建全局变量，参数就少很多。（实际上，leetcode上对于二叉搜索树的递归中序遍历，标准题解都是经常全局变量的。） | [530](https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/) |
|                                                              | 26、二叉搜索树中的众数                  | 这题的中序递归，就用一下全局变量吧（题解多样性）             | [501](https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/solution/) |
|                                                              | *27、二叉树的最近公共祖先               |                                                              |                                                              |
|                                                              | p.s.                                    | 对于某个要完成的二叉树方法makeSthToTree(){}<br>使用：<br>root.left = makeSthToTree()<br>root.left = makeSthToTree()<br>往往能避免多加一个helper()函数，而且写出来很优雅，尽量用这种结构写 |                                                              |
|                                                              | *29、二叉搜索树的最近公共祖先           |                                                              |                                                              |
|                                                              | 30、二叉搜索树中的插入操作              | 上面这栏 p.s. 中说的刚好就能在这题用到，从而避免了helper()函数<br>二叉搜索树的插入一定能在叶子节点左右插入 | [701](https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/) |
|                                                              | 31、删除二叉搜索树中的节点              | 思路要清晰：<br>找寻，<br/>1、能继续往下遍历（根据搜索二叉树，想走的路不为null<br/>2、不能继续往下遍历（根据搜索二叉树，想走的路为null<br/>3、在能找到的情况下：<br/>3.1、如果找到的节点的左右都不为null，<br/>3.2、如果找到的节点的左右有一个为null，<br/>3.3、如果找到的节点的左右都是null。 | [450](https://leetcode-cn.com/problems/delete-node-in-a-bst/) |
|                                                              | *32、修剪二叉搜索树                     |                                                              | [669](https://leetcode-cn.com/problems/trim-a-binary-search-tree/) |
|                                                              | *33、将有序数组转换为二叉搜索树         |                                                              | [108](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/) |
|                                                              | 34、把二叉搜索树转换为累加树            | 利用二叉搜索树的“中序遍历是递增”的性质 —— 那么按照右中左遍历就是递减 | [538](https://leetcode-cn.com/problems/convert-bst-to-greater-tree/) |
|                                                              | p.s.                                    | 二叉树全总结                                                 | [见此处](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/%E4%BA%8C%E5%8F%89%E6%A0%91%E6%80%BB%E7%BB%93%E7%AF%87.md) |
|                                                              | p.s.                                    | 二叉树的问题主要就是递归和迭代两种解法，具体用哪种视情况而定 |                                                              |
| [08、回溯算法](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/08、回溯算法) |                                         |                                                              |                                                              |
| [09、贪心算法](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/09、贪心算法) |                                         |                                                              |                                                              |
| [10、动态规划](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/10、动态规划) |                                         |                                                              |                                                              |
| [11、单调栈](https://github.com/sunmiao0301/LC-Winoffer/tree/main/LeetCodeForkedFromLCmaster/11、单调栈) |                                         |                                                              |                                                              |
