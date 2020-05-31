package algorithms._01._03._02.quicksort;

import edu.princeton.cs.algs4.StdRandom;

public class _01QuickSort {

    public void sort(int[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int j = QuickSortPartition.partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }


}
