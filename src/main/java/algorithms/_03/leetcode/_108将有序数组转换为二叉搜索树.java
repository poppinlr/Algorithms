package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

//TODO
public class _108将有序数组转换为二叉搜索树 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }
        int root = from + (to - from) / 2;
        TreeNode n = new TreeNode(nums[root]);
        n.left = helper(nums, from, root - 1);
        n.right = helper(nums, root + 1, to);
        return n;
    }


    public static void main(String[] args) {
        _108将有序数组转换为二叉搜索树 s = new _108将有序数组转换为二叉搜索树();
        s.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }
}
