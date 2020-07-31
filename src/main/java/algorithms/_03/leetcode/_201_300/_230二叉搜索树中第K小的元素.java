package algorithms._03.leetcode._201_300;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _230二叉搜索树中第K小的元素 {

    List<TreeNode> r = new ArrayList<>();
    int k;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        smallest(root);
        return r.get(k - 1).val;
    }

    private void smallest(TreeNode node) {
        if (node == null) {
            return;
        }

        smallest(node.left);

        r.add(node);
        smallest(node.right);
    }

    public static void main(String[] args) {
        _230二叉搜索树中第K小的元素 s = new _230二叉搜索树中第K小的元素();
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(2);
        n1.left = n2;
        n1.right = n3;
        n2.right = n4;

        s.kthSmallest(n1,1);
    }
}
