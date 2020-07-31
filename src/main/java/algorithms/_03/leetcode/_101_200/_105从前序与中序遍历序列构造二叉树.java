package algorithms._03.leetcode._101_200;

import algorithms._03.leetcode.define.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class _105从前序与中序遍历序列构造二叉树 {

    private int[] preorder;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        TreeNode node = buildTreeR(0, preorder.length - 1, 0, inorder.length - 1);
        return node;
    }

    private TreeNode buildTreeR(int pre_left, int pre_right, int in_left, int in_right) {
        if (pre_right < pre_left) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[pre_left]);
        int inorderi = map.get(preorder[pre_left]);

        int size = inorderi - in_left;

        node.left = buildTreeR(pre_left + 1, pre_left + size, in_left, inorderi - 1);
        node.right = buildTreeR(pre_left + size + 1, pre_right, inorderi + 1, in_right);

        return node;
    }

    public static void main(String[] args) {
        _105从前序与中序遍历序列构造二叉树 s = new _105从前序与中序遍历序列构造二叉树();
        s.buildTree(new int[]{3, 9, 8, 20, 15, 6, 7, 4, 5}, new int[]{8, 9, 3, 6, 15, 20, 4, 7, 5});
    }
}
