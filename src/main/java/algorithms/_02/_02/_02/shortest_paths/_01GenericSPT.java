package algorithms._02._02._02.shortest_paths;

import edu.princeton.cs.algs4.Digraph;

/**
 * Generic algorithm(to compute SPT from s)
 * -----------------------------------------------------------------
 * initialize distTo[s] = 0 and distTo[v] = ∞ for all other vertices
 * Repeat until optimality conditions are satisfied:
 *  - Relax any edge
 */

/**
 * efficient implementations : how to chose which edge to relax
 * Dijkstra's algorithm(no negative weights)
 * Topological sort algorithm(no directed cycles)
 * Bellman-Ford algorithms(no negative cycles)
 */
public class _01GenericSPT {
}
