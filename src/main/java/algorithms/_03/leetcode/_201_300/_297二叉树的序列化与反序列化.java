package algorithms._03.leetcode._201_300;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _297二叉树的序列化与反序列化 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        List<Integer> list = new ArrayList<>();
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        int count = 1;
        while (count > 0) {
            TreeNode node = queue.get(0);
            if (node == null) {
                list.add(null);
                queue.remove(0);
                queue.add(null);
                queue.add(null);
            } else {
                list.add(node.val);
                queue.remove(0);
                count--;
                queue.add(node.left);
                if (node.left != null) {
                    count++;
                }
                queue.add(node.right);
                if (node.right != null) {
                    count++;
                }
            }
        }

        return list.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() <= 2) {
            return null;
        }
        data = data.replace("[", "");
        data = data.replace("]", "");
        String[] dataArray = data.split(",");

        List<TreeNode> nodeArray = new ArrayList<>();
        nodeArray.add(null);
        for (int i = 0; i < dataArray.length; i++) {
            String d = dataArray[i].trim();
            if ("null".equals(d)) {
                nodeArray.add(null);
            } else {
                nodeArray.add(new TreeNode(Integer.valueOf(d)));
            }
        }
        for (int i = 1; i < nodeArray.size(); i++) {
            TreeNode node = nodeArray.get(i);
            if (node != null && i * 2 < nodeArray.size()) {
                node.left = nodeArray.get(i * 2);
                node.right = i * 2 + 1 >= nodeArray.size() ? null : nodeArray.get(i * 2 + 1);
            }
        }
        return nodeArray.get(1);
    }

    private List<TreeNode> resize(List<TreeNode> list) {
        List<TreeNode> newList = new ArrayList<>(list.size() * 2);
        for (int i = 0; i < list.size(); i++) {
            newList.set(i, list.get(i));
        }

        return newList;
    }

    public static void main(String[] args) {

//        List<Integer> testL = new ArrayList<>();
//        testL.r
//        testL.set(1, 0);
        _297二叉树的序列化与反序列化 s = new _297二叉树的序列化与反序列化();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode1.right = treeNode2;
        treeNode2.right = treeNode3;
        treeNode3.right = treeNode4;
        treeNode4.right = treeNode5;
        treeNode5.right = treeNode6;


        TreeNode n = s.deserialize("[1,2]");
        String ts = s.serialize(n);
    }
}
