package algorithms._01._03._02.quicksort;

import algorithms._01.CommonService;

public class _03_3wayQuickSort {

    public void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int lt = lo;
        int gt = hi;

        int v = a[lo];
        int i = lo;

        while (i <= gt) {
            if (a[i] < a[v]) {
                CommonService.exch(a, lt++, i++);
            } else if (a[i] > a[v]) {
                CommonService.exch(a, i, gt--);
            } else {
                i++;
            }
        }

        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }
}
