package algorithms._01._01._01.unin_find;

/**
 * data structure
 * integer array id[] of length N
 * id[i] is parent of i
 * Root of i is id[id[...id[i]...]]
 *
 * find
 * check if p and q have the same root
 *
 * union
 * to merge components containing p and q set the id of p's root to the id of q's root
 */
public class _02QuickUnionUF {

    private int[] id;

    public _02QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
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
        id[i] = j;//change root of p to point to root of q
    }
}
