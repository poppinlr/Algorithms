package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _107二叉树的层次遍历II {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Stack<List<TreeNode>> stack = new Stack<>();

        List<TreeNode> l = new ArrayList<>();
        l.add(root);
        while (!l.isEmpty()) {
            stack.push(l);
            l = loop(l);
        }

        List<List<Integer>> r = new ArrayList<>();
        while (!stack.isEmpty()) {
            List<Integer> rS = new ArrayList<>();
            List<TreeNode> s = stack.pop();
            for (TreeNode treeNode : s) {
                rS.add(treeNode.val);
            }
            r.add(rS);
        }
        return r;
    }

    private List<TreeNode> loop(List<TreeNode> l) {
        List<TreeNode> nL = new ArrayList<>();
        for (TreeNode treeNode : l) {
            if (treeNode.left != null) {
                nL.add(treeNode.left);
            }

            if (treeNode.right != null) {
                nL.add(treeNode.right);
            }
        }

        return nL;
    }
}
