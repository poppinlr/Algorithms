package review._01;

public class _01QuickFindUF {
    private int[] id;

    public void _01QuickFindUF(int N) {
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int i, int j) {
        return id[i] == id[j];
    }

    public void union(int i, int j) {
        for (int k = 0; k < id.length; k++) {
            if (id[k] == id[i]) {
                id[k] = id[j];
            }
        }
    }
}
