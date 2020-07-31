package algorithms._03.leetcode._101_200;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _103二叉树的锯齿形层次遍历 {

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }

    }
    boolean flag = true;
    private List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while (list != null) {
            list = newList(list);
        }
        return l;
    }

    List<TreeNode> newList(List<TreeNode> list){
        if (list.size() == 0) {
            return null;
        }

        List<TreeNode> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).left!=null) {
                newList.add(list.get(i).left);
            }
            if (list.get(i).right != null) {
                newList.add(list.get(i).right);
            }
        }

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i).val);
        }
        if (flag) {
            l.add(list1);
        } else {
            Collections.reverse(list1);
            l.add(list1);
        }
        flag = !flag;
        return newList;
    }

}
