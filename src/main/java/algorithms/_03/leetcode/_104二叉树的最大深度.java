package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;
import edu.princeton.cs.algs4.StdOut;

public class _104二叉树的最大深度 {

    int max = 0;

    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return max;
    }

    private void dfs(TreeNode root, int length) {
        if (root == null) {
            return;
        }
        length = length + 1;
        max = Math.max(length, max);
        dfs(root.left, length);
        dfs(root.right, length);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);

        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;

        _104二叉树的最大深度 s = new _104二叉树的最大深度();
        int count = s.maxDepth(t1);
        StdOut.println(count);
    }


}
