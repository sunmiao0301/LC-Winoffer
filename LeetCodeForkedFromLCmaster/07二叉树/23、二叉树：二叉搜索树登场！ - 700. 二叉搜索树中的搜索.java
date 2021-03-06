2nd
Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return root;
        else if(root.val > val)
            return searchBST(root.left, val);
        else if(root.val < val)
            return searchBST(root.right, val);
        else
            return root;
    }
}

//第一版 一遍过 效率也不错
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
38.8 MB
, 在所有 Java 提交中击败了
98.88%
的用户
通过测试用例：
36 / 36
class Solution {
    TreeNode ret = new TreeNode(0);
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        ret.val = val + 1;
        search(root, val);
        if(ret.val == val)
            return ret;
        return null;
    }
    void search(TreeNode root, int val){
        if(root.val == val)
            ret = root;
        if(root.left != null)
            search(root.left, val);
        if(root.right != null)
            search(root.right, val);
    }
}

//第二版 突然想到是二叉搜索树 那么再写一版
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        if(root.val == val)
            return root;
        else if(root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}

//最简单的标准题解 对于搜索二叉树 由于二叉树的特殊性 不需要额外的空间（队列）就能实现对二叉树的 迭代 遍历 

为了降低空间复杂度，将递归转换为迭代：
如果根节点不空 root != null 且根节点不是目的节点 val != root.val：
如果 val < root.val，进入根节点的左子树查找 root = root.left。
如果 val > root.val，进入根节点的右子树查找 root = root.right。
返回 root。

class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    while (root != null && val != root.val)
      root = val < root.val ? root.left : root.right;
    return root;
  }
}
