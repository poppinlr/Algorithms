package algorithms._03.leetcode._901_1000;

import algorithms._03.leetcode.define.TreeNode;

public class _1530好叶子节点对的数量 {

    private int count = 0;
    private int distance = 0;

    public int countPairs(TreeNode root, int distance) {
        if (root == null) {
            return 0;
        }
        this.distance = distance;
        height(root);
        if (root.left != null) {
            height(root.left);
        }

        if (root.right != null) {
            height(root.right);
        }
        return count;
    }

    private int height(TreeNode root) {
        if (root.left == null && root.right == null) {
            if (root.val <= this.distance) {
                count++;
            }
            return root.val;
        }

        int height = root.val;
        if (root.left != null) {
            height = height(root.left) + height;
        }

        if (root.right != null) {
            height = height(root.right) + height;
        }

        if (height <= distance) {
            count++;
        }
        return height;
    }
}
