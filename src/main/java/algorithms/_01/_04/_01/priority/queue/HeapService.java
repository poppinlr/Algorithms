package algorithms._01._04._01.priority.queue;

import algorithms._01.CommonService;

public class HeapService {

    public static void swim(int[] pq, int k) {
        while (k > 1 && CommonService.less(pq, k / 2, k)) {
            CommonService.exch(pq, k, k / 2);
            k = k / 2;
        }
    }

    public static void sink(int[] pq, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && pq[j] < pq[j + 1]) {
                j++;
            }

            if (!(pq[k] < pq[j])) {
                break;
            }

            CommonService.exch(pq, k, j);
            k = j;
        }
    }
}
