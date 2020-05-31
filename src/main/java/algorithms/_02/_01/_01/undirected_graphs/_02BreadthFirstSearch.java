package algorithms._02._01._01.undirected_graphs;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Queue;


/**
 * BFS (from source vertex s)
 * ----------------------------------------------------------------------------------
 * Put s onto a FIFO queue, and mark s as visited. Repeat until the queue is empty: -
 *  - remove the least recently added vertex v                                      -
 *  - add each of v's unvisited neighbors to the queue,    and mark them as visited.-
 *  ---------------------------------------------------------------------------------
 */
public class _02BreadthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;

    //TODO bfs core
    private void bfs(Graph G, int s) {
        Queue<Integer> q = new Queue<>();

        q.enqueue(s);
        marked[s] = true;
        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    q.enqueue(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }
    }
}
