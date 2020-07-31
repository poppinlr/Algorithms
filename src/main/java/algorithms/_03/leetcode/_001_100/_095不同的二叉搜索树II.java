package algorithms._03.leetcode._001_100;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _095不同的二叉搜索树II {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<TreeNode> list = generateTree(0, n, nums);

        return list;
    }

    List<TreeNode> generateTree(int left, int right, int[] nums) {
        List<TreeNode> r = new ArrayList<>();
        if (left >= right) {
            r.add(null);
            return r;
        }

        for (int i = left; i < right; i++) {

            List<TreeNode> leftL = generateTree(left, i, nums);
            List<TreeNode> rightL = generateTree(i + 1, right, nums);
            for (int j = 0; j < leftL.size(); j++) {
                for (int k = 0; k < rightL.size(); k++) {
                    //core 要在这里!!!
                    TreeNode rootNode = new TreeNode(nums[i]);
                    rootNode.left = leftL.get(j);
                    rootNode.right = rightL.get(k);
                    r.add(rootNode);
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        _095不同的二叉搜索树II s = new _095不同的二叉搜索树II();
        s.generateTrees(3);
    }
}
