package review._01;

import algorithms._01.CommonService;

public class _04SelectionSort {

    public static void sort(int[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (a[i] > a[j]) {
                    CommonService.exch(a, i, j);
                }
            }
        }
    }
}
