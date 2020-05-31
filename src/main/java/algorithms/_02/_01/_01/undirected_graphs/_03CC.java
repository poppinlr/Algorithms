package algorithms._02._01._01.undirected_graphs;


import edu.princeton.cs.algs4.Graph;

public class _03CC {

    private boolean[] marked;
    private int[] id;//id[v] = id of component containing v
    private int count;//number of components

    /**
     * ﬁnd connected components in G
     * @param G
     */
    _03CC(Graph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
                count++;
            }
        }
    }

    /**
     * are v and w connected
     * @param v
     * @param w
     * @return
     */
    public boolean connected(int v, int w) {
        return id[v] == id[w];
    }

    /**
     * number of connected components
     * @return
     */
    public int count() {
        return count;
    }

    /**
     * component identifier for v
     * @param v
     * @return
     */
    public int id(int v) {
        return id[v];
    }

    //TODO cc core
    private void dfs(Graph G, int v) {
        marked[v] = true;

        id[v] = count;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

}
