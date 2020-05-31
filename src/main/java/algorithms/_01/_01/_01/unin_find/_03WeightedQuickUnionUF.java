package algorithms._01._01._01.unin_find;

/**
 * data structure
 * integer array id[] of length N
 * id[i] is parent of i
 * Root of i is id[id[...id[i]...]]
 * <p>
 * find
 * check if p and q have the same root
 * <p>
 * union
 * to merge components containing p and q set the id of p's root to the id of q's root
 */
public class _03WeightedQuickUnionUF {

    private int[] id;
    private int[] sz;

    public _03WeightedQuickUnionUF(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 0;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}
