package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _102二叉树的层序遍历 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root != null){
            List<TreeNode> queue = new ArrayList<>();
            queue.add(root);
            getNodes(queue, list);
        }
        return list;
    }

    private void getNodes(List<TreeNode> treeNodes, List<List<Integer>> lists) {
        List<Integer> nodeList = new ArrayList<>();
        List<TreeNode> nodeNew = new ArrayList<>();
        while (!treeNodes.isEmpty()){
            TreeNode node = treeNodes.remove(0);
            nodeList.add(node.getVal());
            if (node.getLeft() != null) {
                nodeNew.add(node.getLeft());
            }
            if (node.getRight() != null) {
                nodeNew.add(node.getRight());
            }
        }
        lists.add(nodeList);
        if (!nodeNew.isEmpty()) {
            getNodes(nodeNew, lists);
        }
    }
}
