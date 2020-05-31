package algorithms._01._03._02.quicksort;

import edu.princeton.cs.algs4.StdRandom;

public class _02QuickSelect {

    public int select(int[] a, int k) {
        StdRandom.shuffle(a);
        int lo = 0;
        int hi = a.length - 1;

        while (lo < hi) {
            int j = QuickSortPartition.partition(a, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;

            } else {
                return a[k];
            }
        }
        return a[k];
    }
}
