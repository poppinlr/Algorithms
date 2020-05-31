package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

public class _111二叉树的最小深度 {

    int minHeight = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        initHeight(root, 1);
        return minHeight;
    }

    private void initHeight(TreeNode root, int height) {
        if (root != null) {
            root.val = height;
            if (root.left == null && root.right == null && height < minHeight) {
                minHeight = height;
            }
            initHeight(root.left, height + 1);
            initHeight(root.right, height + 1);
        }
    }
}
