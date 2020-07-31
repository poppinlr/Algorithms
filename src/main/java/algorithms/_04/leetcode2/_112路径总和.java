package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.TreeNode;

public class _112路径总和 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else {
            if (sum == root.val && root.left == null && root.right == null) {
                return true;
            } else {
                return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
            }
        }
    }
}
