package algorithms._02._01._01.undirected_graphs;

import edu.princeton.cs.algs4.Graph;

import java.util.Stack;

/**
 * DFS (to visit a vertex v)
 * ----------------------------------------------------
 * Mark v as visited. Recursively visit all unmarked  -
 * vertices w adjacent to v.                          -
 * ----------------------------------------------------
 */
class _01DepthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;//edgeTo[v] = previous vertex on path from s to v
    private int s;

    public _01DepthFirstSearch(Graph G, int s) {

    }

    //TODO dsf core
    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
                edgeTo[w] = v;
            }
        }
    }

    /**
     * is there a path from s to v?
     *
     * @param v
     * @return
     */
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    /**
     * path from s to v
     * null if no such path
     *
     * @param v
     * @return
     */
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }
}
