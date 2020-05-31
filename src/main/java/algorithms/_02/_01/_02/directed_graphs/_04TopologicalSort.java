package algorithms._02._01._02.directed_graphs;

import edu.princeton.cs.algs4.Digraph;

import java.util.Stack;

/**
 * ・Run depth-first search
 * ・Return vertices in reverse postorder.
 */
public class _04TopologicalSort {

    private Stack<Integer> topologicalSort;

    public _04TopologicalSort(Digraph digraph) {
        _05DepthFirstOrder depthFirstOrder = new _05DepthFirstOrder(digraph);
        this.topologicalSort = depthFirstOrder.getReversePost();
    }

    public Stack<Integer> topologicalSort() {
        return this.topologicalSort;
    }
}
