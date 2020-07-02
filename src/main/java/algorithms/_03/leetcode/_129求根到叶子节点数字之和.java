package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _129求根到叶子节点数字之和 {

    private List<String> r = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        dfs(root, "");
        int sum = 0;
        for (String sb : r) {
            if (sb.length() > 0) {
                sum = sum + Integer.valueOf(sb);
            }
        }

        return sum;
    }

    private void dfs(TreeNode root, String val) {
        val = val + root.val;

        if (root.left == null && root.right == null) {
            r.add(val);
        }

        if (root.left != null) {
            dfs(root.left, val);
        }

        if (root.right != null) {
            dfs(root.right, val);
        }
    }

    public static void main(String[] args) {
        _129求根到叶子节点数字之和 s = new _129求根到叶子节点数字之和();
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(1);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        s.sumNumbers(n1);
    }
}
