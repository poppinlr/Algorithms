package algorithms._01._02._02.element_sort;

import algorithms._01.CommonService;

/**
 * in  iteration i, find index min of smallest remaining entry
 * swap a[i] and a[min]
 */
public class _01SelectionSort {

    public void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (CommonService.less(a[j], a[min])) {
                    min = j;
                }
            }
            CommonService.exch(a, i, min);
        }
    }
}
