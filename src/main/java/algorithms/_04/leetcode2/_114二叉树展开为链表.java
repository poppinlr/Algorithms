package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.TreeNode;

public class _114二叉树展开为链表 {

    public void flatten(TreeNode root) {
        f(root);
    }

    private TreeNode f(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        TreeNode right = f(root.right);
        root.left = null;
        //insert left to right

        root.right = f(left);
        TreeNode moveNode = root;
        while (moveNode.right != null) {
            moveNode = moveNode.right;
        }

        moveNode.right = right;
        //
        return root;
    }
}
