package algorithms._02._02._01.minmum_spanning_trees;

import edu.princeton.cs.algs4.*;


public class _01KruskalMST {

    private Queue<Edge> mst = new Queue<>();

    public _01KruskalMST(EdgeWeightedGraph G) {
        //sort edges by weight and dequeue min
        MinPQ<Edge> pq = new MinPQ<>();
        for (Edge e : G.edges()) {
            pq.insert(e);
        }

        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin();//greedily add edges to MST
            int v = e.either();
            int w = e.other(v);
            if (!uf.connected(v, w)) {//edge v-w does not create cycle
                uf.union(v, w);//merge sets
                mst.enqueue(e);//add edge to MST
            }
        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }
}
