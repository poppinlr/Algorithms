package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

public class _114二叉树展开为链表 {

    public void flatten(TreeNode root) {
        //return
        if (root == null) {
            return;
        }

        TreeNode nodeL = root.left;
        TreeNode nodeR = root.right;
        //左边节点变成单链表
        flatten(nodeL);
        //右边节点变成单链表
        flatten(nodeR);

        //左边链表接root
        root.right = nodeL;
        root.left = null;//core 置空
        TreeNode node = root;//遍历到链表结尾
        while (node.right != null) {
            node = node.right;
        }

        //和右链表相连
        node.right = nodeR;
    }
}
