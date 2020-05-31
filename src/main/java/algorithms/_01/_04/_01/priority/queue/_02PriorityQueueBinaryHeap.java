package algorithms._01._04._01.priority.queue;

import algorithms._01.CommonService;

public class _02PriorityQueueBinaryHeap {

    private int[] pq;
    private int N;

    public _02PriorityQueueBinaryHeap(int capacity) {
        pq = new int[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(int i) {
        pq[++N] = i;
        HeapService.swim(pq, N);
    }

    public int delMax() {
        int max = pq[1];
        CommonService.exch(pq, 1, N--);
        HeapService.sink(pq, 1, N);
        return max;
    }

}
