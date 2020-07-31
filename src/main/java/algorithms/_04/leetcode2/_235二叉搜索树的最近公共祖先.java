package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.TreeNode;

public class _235二叉搜索树的最近公共祖先 {

    private TreeNode node = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        loop(root, p, q);
        return node;
    }

    private void loop(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return;
        }

        if (dfs(root, p) && dfs(root, q)) {
            node = root;
            if (dfs(root.left, p)) {
                loop(root.left, p, q);
            }

            if (dfs(root.right, p)) {
                loop(root.right, p, q);
            }
        }
    }

    private boolean dfs(TreeNode root, TreeNode p) {
        if (root == null) {
            return false;
        }

        if (root.equals(p)) {
            return true;
        }

        return dfs(root.left, p) || dfs(root.right, p);
    }

    public static void main(String[] args) {
        _235二叉搜索树的最近公共祖先 s = new _235二叉搜索树的最近公共祖先();
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node8 = new TreeNode(8);
        TreeNode node0 = new TreeNode(0);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node3 = new TreeNode(3);

        node6.left = node2;
        node6.right = node8;
        node2.left = node0;
        node2.right = node4;
        node8.left = node7;
        node8.right = node9;
        node4.left = node3;

        s.lowestCommonAncestor(node6, node2, node4);

    }
}
