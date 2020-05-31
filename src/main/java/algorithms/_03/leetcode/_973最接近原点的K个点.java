package algorithms._03.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _973最接近原点的K个点 {

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                double l1 = Math.pow(i1[0], 2) + Math.pow(i1[1], 2);
                double l2 = Math.pow(i2[0], 2) + Math.pow(i2[1], 2);

                if (l1 < l2) {
                    return -1;
                } else if (l1 == l2) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        for (int[] i : points) {
            priorityQueue.add(i);
        }

        int[][] r = new int[K][2];
        for (int i = 0; i < K; i++) {
            r[i] = priorityQueue.poll();
        }

        return r;
    }
}
