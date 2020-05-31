package algorithms._02._03._02.radix_sorts;


import algorithms._01.CommonService;

public class _04_3WayRadixQuickSort {

    private void sort(String[] a) {
        sort(a, 0, a.length - 1, 0);
    }

    private void sort(String[] a, int lo, int hi, int d) {
        if(hi<=lo) return;

        int lt = lo;
        int gt = hi;

        int v = CommonService.charAt(a[lo], d);
        int i = lo + 1;

        while (i <= gt) {
            int t = CommonService.charAt(a[i], d);
            if(t<v){
//                exch(a, lt++, i++);
            } else if ((t > v)) {
//                exch(a, i, gt--);
            } else {
                i++;
            }
        }

        sort(a, lo, lt - 1, d);
        if(v>=0){
            sort(a, lt, gt, d + 1);
        }
        sort(a, gt+1, hi, d);
    }
}
