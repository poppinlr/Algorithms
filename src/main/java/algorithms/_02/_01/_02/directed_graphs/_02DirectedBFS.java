package algorithms._02._01._02.directed_graphs;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Queue;

public class _02DirectedBFS {

    private boolean[] marked;

    //TODO bfs core
    private void bfs(Graph G, int s) {
        Queue<Integer> q = new Queue<Integer>();

        q.enqueue(s);
        marked[s] = true;
        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    q.enqueue(w);
                    marked[w] = true;
                }
            }
        }
    }
}
