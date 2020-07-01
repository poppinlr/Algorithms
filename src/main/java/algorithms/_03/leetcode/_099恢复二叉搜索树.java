package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _099恢复二叉搜索树 {


    public void recoverTree(TreeNode root) {

        TreeNode n1 = null;
        TreeNode n2 = null;

        //中序遍历
        List<TreeNode> list = new ArrayList<>();
        loop(root, list);

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).val > list.get(i + 1).val) {
                n2 = list.get(i + 1);
                if (n1 == null) {
                    n1 = list.get(i);
                }
            }
        }

        if (n1 != null && n2 != null) {
            int n = n1.val;
            n1.val = n2.val;
            n2.val = n;
        }
    }

    private void loop(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }

        loop(root.left, list);
        list.add(root);
        loop(root.right, list);
    }


    public static void main(String[] args) {
        _099恢复二叉搜索树 s = new _099恢复二叉搜索树();
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        n7.left = n2;
        n7.right = n6;
        n2.left = n1;
        n2.right = n3;
        n6.left = n5;
        n6.right = n4;
        s.recoverTree(n7);
    }
}
