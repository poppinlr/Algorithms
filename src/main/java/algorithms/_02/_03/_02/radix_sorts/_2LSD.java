package algorithms._02._03._02.radix_sorts;

public class _2LSD {

    public void sort(String[] a, int W) {//fixed-length W strings
        int R = 256;//radix R
        int N = a.length;
        String[] aux = new String[N];

        for (int d = W - 1; d >= 0; d--) {//do key-indexed counting for each digit from right to left
            int[] count = new int[R + 1];
            for (int i = 0; i < N; i++) {
                count[a[i].charAt(d) + 1]++;
            }

            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }

            for (int i = 0; i < N; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }

            for (int i = 0; i < N; i++) {
                a[i] = aux[i];
            }
        }
    }
}
