package algorithms._01._01._01.unin_find;

public class _01QuickFindUF {

    private int[] id;

    public _01QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {//set id of each object to itself(N array access)
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];//check whether p and q are in the same component(2 array access)
    }

    public void union(int p, int q) {
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id[p]) {
                id[i] = id[q];
            }
        }
    }
}
