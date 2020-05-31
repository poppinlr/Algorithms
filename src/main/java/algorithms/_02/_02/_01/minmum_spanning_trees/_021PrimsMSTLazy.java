package algorithms._02._02._01.minmum_spanning_trees;

import edu.princeton.cs.algs4.Edge;
import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Queue;

/**
 * start with vertex 0 and greedily grow tree T
 * add to T the min weight edge with exactly one endpoint in T
 * repeat until V-2 edges
 */
public class _021PrimsMSTLazy {

    /**
     * Lazy solution
     * ---------------------------------------------
     * maintain a PQ of edges with (at least) one endpoint in T
     * .Key = edge; priority = weight of edge
     * .Delete-,in to determine next edge e = v-w to add to T
     * .Disregard if both endpoints v and w are in T
     * .otherwise, let w be the vertex not in T:
     *  -add to PQ any edge incident to w(assuming other endpoint not in T)
     *  -add w to T
     */
    private boolean[] marked;//MST vertices
    private Queue<Edge> mst;//MST edges
    private MinPQ<Edge> pq;//PQ of edges

    public _021PrimsMSTLazy(EdgeWeightedGraph G) {
        pq = new MinPQ<>();
        mst = new Queue<Edge>();
        marked = new boolean[G.V()];
        visit(G, 0);//assume G is connected

        while (!pq.isEmpty()) {
            Edge e = pq.delMin();//repeatedly delete the min weight edge e=v-w from PQ
            int v = e.either();
            int w = e.other(v);
            if (marked[v] && marked[w]) {//ignore if both end points in T
                continue;//remove edge from queue if both endpoints in T
            }
            mst.enqueue(e);//add edge e to tree
            //add v or w to tree
            if (!marked[v]) {
                visit(G, v);
            }

            if (!marked[w]) {
                visit(G, w);
            }
        }
    }

    private void visit(EdgeWeightedGraph g, int v) {
        marked[v] = true;
        for (Edge e : g.adj(v)) {
            if (!marked[e.other(v)]) {
                pq.insert(e);
            }
        }
    }

    public Iterable<Edge> mst() {
        return mst;
    }
}
