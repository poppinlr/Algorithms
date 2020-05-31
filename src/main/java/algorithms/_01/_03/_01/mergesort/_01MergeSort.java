package algorithms._01._03._01.mergesort;

import algorithms._01.CommonService;

public class _01MergeSort {

    /**
     *
     * @param a
     */
//    public void bottomUpSort(int[] a){
//        int N = a.length;
//        int[] aux = new int[N];
//        for (int i = 1; i < N; i = i * 2) {
//            for (int lo = 0; lo < N - i; lo = lo + 2 * i) {
//                merge(a, aux, lo, lo + i - 1, Math.min(lo + 2 * i - 1, N - 1));
//            }
//        }
//    }

    public void sort(int[] a) {
        int[] aux = new int[a.length];
        this.sort(a, aux, 0, a.length - 1);
    }

    private void sort(int[] a, int[] aux, int lo, int hi) {
        if(hi<=lo) return;
        int mid = (hi - lo) / 2 + lo;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, hi, mid);
    }

    private void merge(int[] a, int[] aux, int lo, int hi, int mid) {
        assert CommonService.isSorted(a, lo, mid);
        assert CommonService.isSorted(a, mid + 1, hi);

        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j];
                j++;
            } else if (j > hi) {
                a[k] = aux[i];
                i++;
            } else if (aux[i] < aux[j]) {
                a[k] = aux[i];
                i++;
            } else {
                a[k] = aux[j];
                j++;
            }
        }
    }


}
