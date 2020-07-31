package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.TreeNode;

public class _101对称二叉树 {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        t3.left = t5;

        _101对称二叉树 s = new _101对称二叉树();
        boolean b = s.isSymmetric(t1);
        System.out.println(b);
    }


}
