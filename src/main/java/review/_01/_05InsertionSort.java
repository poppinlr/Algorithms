package review._01;

import algorithms._01.CommonService;

public class _05InsertionSort {

    public static void sort(int[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    CommonService.exch(a, j - 1, j);
                }
            }
        }
    }
}
