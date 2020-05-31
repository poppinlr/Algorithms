package review._01;

public class _02WeightedPathQuickUnionUF {

    private int[] sz;//weighted
    private int[] id;

    public void _02QuickUnionUF(int N) {
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int root(int i) {
        while (id[i] != i) {
            //TODO
            id[i] = id[id[i]];
            i = id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rootp = root(p);
        int rootq = root(q);

        if (rootp == rootq) {
            return;
        } else {
            if (sz[rootp] > sz[rootq]) {
                id[rootq] = rootp;
                sz[rootp] = sz[rootp] + sz[rootq];
            } else {
                id[rootp] = rootq;
                sz[rootq] = sz[rootq] + sz[rootp];
            }
        }

    }
}
