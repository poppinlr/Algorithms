package algorithms._04.leetcode2;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _230二叉搜索树中第K小的元素 {

    private List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        sort(root, k);
        return list.get(list.size() - 1);
    }

    private void sort(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        if (list.size() == k) {
            return;
        }
        sort(root.left, k);
        list.add(root.val);
        sort(root.right, k);
    }



    public static void main(String[] args) {
        _230二叉搜索树中第K小的元素 s = new _230二叉搜索树中第K小的元素();
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);

        node3.left = node1;
        node1.right = node2;
        node3.right = node4;

        int k = s.kthSmallest(node3, 2);
    }
}
