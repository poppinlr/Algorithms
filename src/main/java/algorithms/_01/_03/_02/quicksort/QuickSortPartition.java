package algorithms._01._03._02.quicksort;

import algorithms._01.CommonService;

public class QuickSortPartition {

    public static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (a[++i] < a[lo]) {
                if (i == hi) {
                    break;
                }
            }

            while (a[lo] < a[--j]) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            CommonService.exch(a, i, j);
        }
        CommonService.exch(a, lo, j);
        return j;
    }
}
