package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.TreeNode;

import java.util.HashMap;

public class _106从中序与后序遍历序列构造二叉树 {

    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return constructTreeNode(postorder, 0, postorder.length - 1, postorder.length - 1);
    }

    private TreeNode constructTreeNode(int[] postorder, int lo, int hi, int j) {
        if (lo > hi || j <0) {
            return null;
        }
        TreeNode head = new TreeNode(postorder[j]);
        if (lo == hi || j == 0) {
            return head;
        }
        int i = map.get(postorder[j]);
        head.right = constructTreeNode(postorder, i + 1, hi, j - 1);
        head.left = constructTreeNode(postorder, lo, i - 1, j - (hi - lo) - 1);

        return head;
    }

    public static void main(String[] args) {
        _106从中序与后序遍历序列构造二叉树 s = new _106从中序与后序遍历序列构造二叉树();
        s.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
    }

}
