package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.TreeNode;

public class _112路径总和 {

    public boolean hasPathSum(TreeNode root, int sum) {
        return pathSum(root, 0, sum);
    }

    public boolean pathSum(TreeNode root, int length, int sum) {
        if (root == null) {
            return false;
        }

        length = length + root.val;
        if (root.left == null && root.right == null) {
            return sum == length;
        }
        return pathSum(root.left, length, sum)||pathSum(root.right, length, sum);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t1.left = t2;
        _112路径总和 s = new _112路径总和();
        s.hasPathSum(t1, 1);
    }
}
