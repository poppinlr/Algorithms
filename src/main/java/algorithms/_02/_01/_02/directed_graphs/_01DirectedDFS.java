package algorithms._02._01._02.directed_graphs;

import edu.princeton.cs.algs4.Digraph;

/**
 * DFS (to visit a vertex v)
 * --------------------------------------------------
 * Mark v as visited. Recursively visit all unmarked-
 * vertices w pointing from v.                      -
 * --------------------------------------------------
 */

//Code for directed graphs identical to undirected one.
public class _01DirectedDFS  {

    private boolean[] marked;

    public _01DirectedDFS(Digraph G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if(!marked[w]){
                dfs(G, w);
            }
        }
    }

    public boolean visited(int v) {
        return marked[v];
    }
}
