package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.TreeNode;

public class _124二叉树中的最大路径和 {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        length(root);
        return max;
    }

    private int length(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(length(node.left), 0);
        int right = Math.max(length(node.right), 0);

        int length = node.val + left + right;
        max = Math.max(length, max);
        return node.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(-10);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;


        _124二叉树中的最大路径和 s = new _124二叉树中的最大路径和();

        s.maxPathSum(node1);
    }

}
