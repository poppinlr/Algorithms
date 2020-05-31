package algorithms._01._02._02.element_sort;

import algorithms._01.CommonService;

/**
 * entries to the left of i(including i) are in ascending order
 * entries to the right of up have not yet been seen
 */
public class _02InsertionSort {

    public void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (CommonService.less(a[j], a[j - 1])) {
                    CommonService.exch(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
