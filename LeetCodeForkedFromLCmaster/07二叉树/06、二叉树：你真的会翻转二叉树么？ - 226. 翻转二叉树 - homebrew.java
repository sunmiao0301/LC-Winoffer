2nd
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        helper(root);
        if(root.left != null)
            invertTree(root.left);
        if(root.right != null)
            invertTree(root.right);
        return root;
    }
    void helper(TreeNode root){
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
#### 
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
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
35.8 MB
, 在所有 Java 提交中击败了
66.47%
的用户
通过测试用例：
77 / 77
class Solution {
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
    void helper(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        helper(root.left);
        helper(root.right);
    }
}

//另有题解是：
//DFS递归
class Solution {
   /**
     * 前后序遍历都可以
     * 中序不行，因为先左孩子交换孩子，再根交换孩子（做完后，右孩子已经变成了原来的左孩子），再右孩子交换孩子（此时其实是对原来的左孩子做交换）
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        swapChildren(root);
        return root;
    }

    private void swapChildren(TreeNode root) {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
