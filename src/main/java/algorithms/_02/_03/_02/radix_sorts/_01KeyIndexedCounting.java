package algorithms._02._03._02.radix_sorts;

public class _01KeyIndexedCounting {

    public int[] sort(int[] a, int R) {//r=group number of key
        int N = a.length;
        int[] aux = new int[N];
        int[] count = new int[R + 1];
        for (int i = 0; i < N; i++) {//count frequencies
            count[a[i]+1]++;
        }

        for (int r = 0; r < R; r++) {
            count[r + 1] = count[r + 1] + count[r];//compute cumulates
        }

        for (int i = 0; i < N; i++) {
            aux[count[a[i]]++] = a[i];//move items
        }

        for (int i = 0; i < N; i++) {
            a[i] = aux[i];
        }
        return a;
    }
}
