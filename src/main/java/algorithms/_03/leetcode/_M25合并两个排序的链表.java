package algorithms._03.leetcode;

import algorithms._03.leetcode.define.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _M25合并两个排序的链表 {

    public static void main(String[] args) {

        _M25合并两个排序的链表 s = new _M25合并两个排序的链表();


        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(11);
        TreeNode n5 = new TreeNode(13);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(5);
        TreeNode n10 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.left = n5;
        n3.right = n6;
        n4.left = n7;
        n4.right = n8;
        n6.left = n9;
        n6.right = n10;
        List<List<Integer>> b = s.pathSum(n1, 22);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer > listSub = new ArrayList<>();
        dfsSum(root, sum, listSub, list);
        return list;
    }

    private void dfsSum(TreeNode root, int sum, List<Integer> listSub, List<List<Integer>> list){
        if (root == null) {
            return;
        }
        sum = sum-root.val;
        listSub.add(root.val);
        if (sum == 0&&root.left==null&&root.right==null) {
            list.add(new ArrayList<>(listSub));
        }

        dfsSum(root.left, sum, listSub, list);
        dfsSum(root.right, sum, listSub, list);
        listSub.remove(listSub.size() - 1);
    }
}
