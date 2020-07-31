package algorithms._03.leetcode._201_300;

import algorithms._03.leetcode.define.TreeNode;

public class _235二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < q.val) {
            return ancestor(root, p, q);
        } else {
            return ancestor(root, q, p);
        }
    }

    public TreeNode ancestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.equals(p)) {
            return p;
        }

        if (root.equals(q)) {
            return q;
        }

        if (p.val <= root.val && root.val <= q.val) {
            return root;
        } else if (root.val <= p.val) {
            return ancestor(root.right, p, q);
        } else {
            return ancestor(root.left, p, q);
        }
    }
}
