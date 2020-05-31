package algorithms._01._04._01.priority.queue;

import algorithms._01.CommonService;

public class _01PriorityQueueUnordered {

    private int[] pq;//pq[i] = ith element on pq
    private int N;//number of elements on pq

    public _01PriorityQueueUnordered(int capacity) {
        pq = new int[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(int x) {
        pq[N++] = x;
    }

    public int delMax() {
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (pq[max] < pq[i]) {
                max = i;
            }
        }

        CommonService.exch(pq, max, N-1);
        return pq[--N];
    }
}
