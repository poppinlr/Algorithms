package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.TreeNode;

public class _110平衡二叉树 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1;
        }
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            if (root.left == null && root.right == null) {
                return 1;
            } else {
                return Math.max(height(root.left), height(root.right)) + 1;
            }
        }
    }
}
