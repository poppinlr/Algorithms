package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.TreeNode;

public class _124二叉树中的最大路径和 {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            max = Math.max(max, maxPath(root.left) + maxPath(root.right) + root.val);
//            maxPathSum(root.left);
//            maxPathSum(root.right);
            return max;
        }
    }

    private int maxPath(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(node.val + Math.max(maxPath(node.left), maxPath(node.right)), 0);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(-1);

        _124二叉树中的最大路径和 s = new _124二叉树中的最大路径和();
        s.maxPathSum(root);
    }
}
