package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _199二叉树的右视图 {

    private List<Integer> r = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        } else {
            List<TreeNode> list = new ArrayList<>();
            list.add(root);
            while (list.size() > 0) {
                list = bfs(list);
            }

            return r;
        }
    }

    private List<TreeNode> bfs(List<TreeNode> list) {
        List<TreeNode> newList = new ArrayList<>();
        r.add(list.get(list.size() - 1).val);
        for (int i = 0; i < list.size(); i++) {
            TreeNode node = list.get(i);
            if (node.left != null) {
                newList.add(node.left);
            }
            if (node.right != null) {
                newList.add(node.right);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        _199二叉树的右视图 s = new _199二叉树的右视图();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node5.left = node7;
        node5.right = node8;
        node8.right = node9;

        s.rightSideView(node1);
    }
}
