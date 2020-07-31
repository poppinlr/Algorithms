package algorithms._03.leetcode._101_200;


import java.util.HashMap;

public class _138复制带随机指针的链表 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        return copy(head);
    }

    HashMap<Node, Node> visitedHash = new HashMap<>();
    private Node copy(Node head) {
        if(head != null){
            if (visitedHash.containsKey(head)) {
                return visitedHash.get(head);
            }
            Node node = new Node(head.val);
            visitedHash.put(head, node);
            node.next = copy(head.next);
            node.random = copy(head.random);
            return node;
        }

        return null;
    }

}
