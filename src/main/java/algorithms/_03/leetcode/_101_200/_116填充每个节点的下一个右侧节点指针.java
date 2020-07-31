package algorithms._03.leetcode._101_200;


import algorithms._03.leetcode.define.Node;

public class _116填充每个节点的下一个右侧节点指针 {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        if(root.left != null){
            root.left.next = root.right;
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        _116填充每个节点的下一个右侧节点指针 s = new _116填充每个节点的下一个右侧节点指针();
        Node n = s.connect(n1);
    }
}
