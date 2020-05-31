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
public class _022PrimsMSTEager {

    /**
     * Eager solution
     * ---------------------------------------------
     * maintain a PQ of vertices connected by en edge to T, where priority of vertex v = weight of shortest edge connecting v to T
     * .Delete min vertex v and add its associated edge e = v-w to T
     * .Update PQ by considering all edges e = v-x incident to v
     *  -ignore if x is already in T
     *  -add x to PQ if not already on it
     *  -decrease priority of x if v-x becomes shortest edge connecting x to T
     */
    //TODO core indexed priority queue implementation
}
