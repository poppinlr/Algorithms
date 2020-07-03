package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

//TODO O(h)
public class _173二叉搜索树迭代器 {

    List<TreeNode> queue = new ArrayList<>();

    public _173二叉搜索树迭代器(TreeNode root) {
        in_order(root);
    }

    private void in_order(TreeNode root) {
        if (root == null) {
            return;
        }

        in_order(root.left);
        queue.add(root);
        in_order(root.right);
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = queue.get(0);
        queue.remove(0);
        return node.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
