package review._01;

import algorithms._01.CommonService;

public class _06ShellSort {

    public static void sort(int[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i = i + h) {
                for (int j = i; j >= h && a[j] < a[j-h]; j = j - h) {
                    CommonService.exch(a, j-h, j);
                }
            }
            h = h / 3;
        }

    }
}
