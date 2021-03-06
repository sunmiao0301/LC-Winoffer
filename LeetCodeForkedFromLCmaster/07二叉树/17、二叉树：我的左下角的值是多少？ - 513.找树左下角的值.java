2nd 效率很差
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        //如果用广度的话，肯定简单。
        //但是转念一想，深度优先不会有什么好处啊，因为你不到最右边的树的时候没法确认 “最底层”
        LinkedList<TreeNode> queue = new LinkedList<>();
        //int depth = 0;
        queue.add(root);//addLast and 至少一个节点
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                if(queue.get(i).left != null){
                    queue.add(queue.get(i).left);
                }
                if(queue.get(i).right != null){
                    queue.add(queue.get(i).right);
                }
            }
            if(queue.size() != size){
                //return queue.get(0).val;
                while(size > 0){
                    queue.removeFirst();
                    size--;
                }
            }
            else{
                return queue.get(0).val;
            }
        }
        return 301;
    }
}
2nd 优化一下 效率2ms，差不多了，但是还是没到100%
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        //如果用广度的话，肯定简单。
        //但是转念一想，深度优先不会有什么好处啊，因为你不到最右边的树的时候没法确认 “最底层”
        LinkedList<TreeNode> queue = new LinkedList<>();
        int ret = 0;
        queue.add(root);//addLast and 至少一个节点
        while(!queue.isEmpty()){
            int flag = 0;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                if(queue.getFirst().left != null){
                    queue.add(queue.getFirst().left);
                }
                if(queue.getFirst().right != null){
                    queue.add(queue.getFirst().right);
                }
                if(flag == 0){
                    ret = queue.removeFirst().val;
                    flag = 1;
                }else{
                    queue.removeFirst();
                }
            }
        }
        return ret;
    }
}
2nd
####
更优雅的写法 但是不是我写的
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
        }
        return root.val;
    }
}

//第一版 根据样例来看 我对题意的理解应该对的 因为[0,null,-1]的答案是0不是-1 但是效率不是最好 效率最好的是递归法
执行结果：
通过
执行用时：
1 ms
, 在所有 Java 提交中击败了
73.06%
的用户
内存消耗：
37.9 MB
, 在所有 Java 提交中击败了
87.65%
的用户
通过测试用例：
76 / 76
class Solution {
    /*
    二叉树的节点个数的范围是 [1,104]
    其实我感觉难点在于如何确定 最底层的最左 是啥意思
    我的理解是 底层优先级高 同最底层的情况下最左边优先
    这题如果想用递归不简单 但是层序遍历还是不难的
    每一轮记载最左边的节点值
    由此可见 做二叉树的题 无非就是两种思路
    一是递归
    二是迭代
    */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int deepLeft = root.val;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int flag = 0;
            while(size > 0){
                TreeNode temp = queue.poll();
                if(temp.left != null){
                    queue.offer(temp.left);
                    if(flag == 0){
                        deepLeft = temp.left.val;
                        flag = 1;
                    }
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                    if(flag == 0){
                        deepLeft = temp.right.val;
                        flag = 1;
                    }
                }
                size--;
            }
        }
    return deepLeft;
    }
}

//第二版 递归法 我对这一题的递归法的思路就是 由上而下 从左至右 那么每个深度下的第一个值就刷新 该深度下的其余值不刷新 由此就可以得到最后的最深最左值？
//对的 nice
执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
38.2 MB
, 在所有 Java 提交中击败了
17.95%
的用户
通过测试用例：
76 / 76
class Solution {
    int[] arr = new int[]{0, 0};
    public int findBottomLeftValue(TreeNode root) {
        //二叉树的节点个数的范围是 [1,104]
        arr[0] = root.val;
        finder(root, 0);
        return arr[0];
    }
    void finder(TreeNode root, int num){
        if(num > arr[1]){
            arr[0] = root.val;
            arr[1] = num;
        }
        if(root.left != null)
            finder(root.left, num + 1);
        if(root.right != null)
            finder(root.right, num + 1);
    }
}
