package algorithms;

import algorithms._03.leetcode.define.TreeNode;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

public class 回溯 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        回溯 s = new 回溯();
        s.recursive(n1, list);
    }

    /**
     *
     * @param node
     * @param list
     */
    private void recursive(TreeNode node, List<Integer> list){
        if (node == null) {
            return;
        }
        list.add(node.val);//add root
        recursive(node.left, list);
        recursive(node.right, list);
        list.remove(list.size() - 1);//remove root
        StdOut.println(list.size());
    }
}
