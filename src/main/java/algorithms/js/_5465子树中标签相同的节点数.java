package algorithms.js;

import java.util.ArrayList;
import java.util.List;

public class _5465子树中标签相同的节点数 {

    private int[][] edges;
    private String labels;

    public int[] countSubTrees(int n, int[][] edges, String labels) {
        this.edges = edges;
        this.labels = labels;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            int sum = bfs(list, labels.charAt(i), 1);
            ans[i] = sum;
        }

        return ans;
    }

    private int bfs(List<Integer> list, char charAt, int sum) {
        while (!list.isEmpty()) {
            int start = list.get(0);
            list.remove(0);

            for (int i = 0; i < edges.length; i++) {
                if (edges[i][0] == start) {
                    if (labels.charAt(edges[i][1]) == charAt) {
                        sum++;
                    }
                    list.add(edges[i][1]);
                }
            }
        }

        return sum;
    }


}
