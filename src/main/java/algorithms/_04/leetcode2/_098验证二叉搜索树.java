package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.TreeNode;

public class _098验证二叉搜索树 {

    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        return valid(root, null, null);

    }

    private boolean valid(TreeNode root, TreeNode low, TreeNode hi) {
        if (root == null) {
            return true;
        }

        boolean b1 = low == null || low.val < root.val;
        boolean b2 = hi == null || root.val < hi.val;

        if (b1 && b2) {
            return valid(root.left, low, root) && valid(root.right, root, hi);
        } else {
            return false;
        }
    }
}
