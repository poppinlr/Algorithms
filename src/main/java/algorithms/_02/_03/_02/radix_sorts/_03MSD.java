package algorithms._02._03._02.radix_sorts;

import algorithms._01.CommonService;

public class _03MSD {

    public void sort(String[] a) {
        String[] aux = new String[a.length];
        sort(a, aux, 0, a.length - 2, 0);
    }

    private void sort(String[] a, String[] aux, int lo, int hi, int d) {
        int R = 256;
        if (hi <= lo) {
            return;
        }

        //key-indexed counting
        int[] count = new int[R + 2];
        for (int i = lo; i <= hi; i++) {
            count[CommonService.charAt(a[i], d) + 2]++;
        }

        for (int r = 0; r < R + 1; r++) {
            count[r + 1] += count[r];
        }

        for (int i = lo; i <=hi ; i++) {
            aux[count[CommonService.charAt(a[i], d) + 1]++] = a[i];
        }

        for (int i = lo; i <= hi; i++) {
            a[i] = aux[i - lo];
        }

        //sort R sub arrays recursively
        for (int r = 0; r < R; r++) {
            sort(a, aux, lo + count[r], lo + count[r + 1] - 1, d + 1);
        }
    }
}
