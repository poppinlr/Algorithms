package algorithms._01._04._01.priority.queue;

import algorithms._01.CommonService;

public class _03HeapSort {

    public void sort(int[] a) {
        int N = a.length;
        for (int k = N / 2; k >= 1; k--) {
            HeapService.sink(a, k, N);
        }

        while (N > 1) {
            CommonService.exch(a, 1, N);
            HeapService.sink(a, 1, --N);
        }
    }
}
