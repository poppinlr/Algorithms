package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;
import edu.princeton.cs.algs4.StdOut;

public class _236二叉树的最近公共祖先 {
    TreeNode minTree = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }
        if (connected(root, p) && connected(root, q)) {
            minTree = root;
            lowestCommonAncestor(root.left, p, q);
            lowestCommonAncestor(root.right, p, q);
        }

        //if root is connected to p and q
        //fun(root.left) fun(root.right)

        //else ignore
        return minTree;
    }

    private boolean connected(TreeNode root, TreeNode q) {
        if (root == null) {
            return false;
        }
        if (root == q) {
            return true;
        } else {
            return connected(root.left, q) || connected(root.right, q);
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(1);//
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(2);//
        TreeNode t6 = new TreeNode(0);
        TreeNode t7 = new TreeNode(8);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        _236二叉树的最近公共祖先 s = new _236二叉树的最近公共祖先();
        TreeNode node = s.lowestCommonAncestor(t1, t4, t3);
        StdOut.println(node.val);
    }
}
