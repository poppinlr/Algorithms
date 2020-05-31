package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;
import edu.princeton.cs.algs4.StdOut;

public class _098验证二叉搜索树 {

    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        boolean b1 = lower == null || lower < node.val;
        boolean b2 = upper == null || node.val < upper;
        if (b1 && b2) {
            return helper(node.left, lower == null ? null : Math.min(node.val, lower), node.val) && helper(node.right, node.val, upper == null ? null : Math.max(node.val, upper));
        } else {
            return false;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public static void main(String[] args) {
        _098验证二叉搜索树 s = new _098验证二叉搜索树();
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;


        boolean b = s.isValidBST(t1);
        StdOut.println(b);
    }
}
