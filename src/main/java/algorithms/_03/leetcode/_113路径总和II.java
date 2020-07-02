package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _113路径总和II {
    private List<List<Integer>> r = new ArrayList<>();
    private int sum = 0;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return new ArrayList<>();
        }
        this.sum = sum;
        path(root, 0, new ArrayList<>());
        return r;
    }

    private void path(TreeNode root, int listSum, ArrayList<Integer> list) {
        if (root == null) {
            if (listSum == sum) {
                r.add(new ArrayList<>(list));
            }
            return;
        }

        int val = root.val;
        list.add(val);
        if (root.left == null) {//core
            path(root.right, listSum + val, list);
        } else if (root.right == null) {
            path(root.left, listSum + val, list);
        } else {
            path(root.left, listSum + val, list);
            path(root.right, listSum + val, list);
        }

        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n1.left = n2;

        n1.left = n2;
        _113路径总和II s = new _113路径总和II();
        s.pathSum(n1, 1);
    }
}
