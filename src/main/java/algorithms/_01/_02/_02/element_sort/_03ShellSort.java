package algorithms._01._02._02.element_sort;

import algorithms._01.CommonService;

public class _03ShellSort {

    public void sort(int[] a) {
        int N = a.length;

        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;//1,4,13,40,121,364   3x+1 increment sequence
        }

        while (h >= 1) {
            //h-sort the array
            for (int i = h; i < N; i++) {//insertion sort
                for (int j = i; j >= h && CommonService.less(a[j], a[j - h]); j = j - h) {
                    CommonService.exch(a, j, j - h);
                }
            }

            h = h / 3;//move to next increment
        }

    }
}
