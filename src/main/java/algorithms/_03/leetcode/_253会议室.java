package algorithms._03.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _253会议室 {

    public int minMeetingRooms(int[][] intervals) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if (t1[1] < t2[1]) {
                    return -1;
                } else if (t1[1] == t2[1]) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if (t1[0] < t2[0]) {
                    return -1;
                } else if (t1[0] == t2[0]) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        for (int[] t : intervals) {
            if (priorityQueue.size() == 0) {
                priorityQueue.add(t);
            } else {
                if (priorityQueue.peek()[1] <= t[0]) {
                    priorityQueue.remove();

                }
                priorityQueue.add(t);
            }
        }

        return priorityQueue.size();
    }

    public static void main(String[] args) {
        _253会议室 s = new _253会议室();
        s.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}});
    }
}
