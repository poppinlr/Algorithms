package algorithms._03.leetcode.unsolved;

import algorithms._03.leetcode.define.TreeNode;

public class 二叉树中的最大路径和 {


    public int maxPathSum(TreeNode root) {

            return 0;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        二叉树中的最大路径和 s = new 二叉树中的最大路径和();
        s.maxPathSum(node1);
    }
}
