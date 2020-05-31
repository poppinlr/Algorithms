package algorithms._02._01._02.directed_graphs;

import edu.princeton.cs.algs4.Digraph;

import java.util.Stack;

public class _05DepthFirstOrder {

    private boolean[] marked;
    private Stack<Integer> reversePost;

    public _05DepthFirstOrder(Digraph digraph) {
        reversePost = new Stack<Integer>();

        marked = new boolean[digraph.V()];
        for (int v = 0; v < digraph.V(); v++) {
            if(!marked[v]){
                dfs(digraph, v);
            }
        }
    }

    private void dfs(Digraph digraph, int v) {
        marked[v] = true;
        for (int w : digraph.adj(v)) {
            if(!marked[w]){
                marked[w] = true;
                dfs(digraph, w);
            }
            reversePost.push(v);
        }
    }

    public Stack<Integer> getReversePost() {
        return reversePost;
    }
}
