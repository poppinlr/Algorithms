package algorithms._03.leetcode;

import algorithms._03.leetcode.define.Node;

import java.util.ArrayList;
import java.util.List;

public class _117填充每个节点的下一个右侧节点指针II {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        List<Node> list = new ArrayList<>();
        list.add(root);
        while (list.size() > 0) {
            list = bfs(list);
        }

        return root;
    }

    private List<Node> bfs(List<Node> list) {
        List<Node> newList = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).next = list.get(i + 1);
            Node left = list.get(i).left;
            Node right = list.get(i).right;
            if (left != null) {
                newList.add(left);
            }

            if (right != null) {
                newList.add(right);
            }
        }
        if (list.get(list.size() - 1).left != null) {
            newList.add(list.get(list.size() - 1).left);
        }

        if (list.get(list.size() - 1).right != null) {
            newList.add(list.get(list.size() - 1).right);
        }

        return newList;
    }
}
