package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _144二叉树的前序遍历 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        f(root, r);
        return r;
    }

    private void f(TreeNode root, List<Integer> r) {
        if (root != null) {
            r.add(root.val);
            f(root.left, r);
            f(root.right, r);
        }
    }
}
