package algorithms._03.leetcode._101_200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _133克隆图 {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private HashMap<Node, Node> marked = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        //return clone node if node is visited
        if (marked.containsKey(node)) {
            return marked.get(node);
        }

        Node newNode = new Node(node.val, new ArrayList<>());
        marked.put(node, newNode);

        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(cloneGraph(neighbor));
        }

        return newNode;
    }
}
